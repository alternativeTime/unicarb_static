package controllers;

import models.glycomobcomposition.*;
import models.ionmob.*;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;


public class IonMobility extends Controller {

    public static Result ionmobilityHome() {
        List<GlycanMob> glycanMobList = GlycanMob.find.all();
        List<NitrogenNegative> nitrogenNegativeList =  NitrogenNegative.find.all();
        List<NitrogenPositive> nitrorogenPositiveList = NitrogenPositive.find.all();
        List<HeNegative> henegativeList = HeNegative.find.all();
        List<HePositive> hepositiveList = HePositive.find.all();

        return ok(views.html.ionmobility.ionmobilityMannose.render(glycanMobList, nitrogenNegativeList, nitrorogenPositiveList, henegativeList, hepositiveList ));
    }

    public static Result dextranIonMobilityHome(){
        List<GlycoproteinStandard> glycoproteinStandardList = GlycoproteinStandard.find.all();
        List<DextranPositive> dextranPositiveList = DextranPositive.find.all();
        List<DextranNegative> dextranNegativeList = DextranNegative.find.all();

        return ok(views.html.ionmobility.dextranIonMobility.render(dextranNegativeList, dextranPositiveList, glycoproteinStandardList));
    }

    public static Result ionmobGlycoproteinStandards() {
        List<GlycoproteinStandard> glycoproteinStandards = GlycoproteinStandard.find.all();
        return ok(views.html.ionmobility.ionmobilityStandards.render(glycoproteinStandards));
    }

    public static Result ionmobSodiatedGlycoproteinData(Long id){
        GlycoproteinStandard glycoproteinStandards = GlycoproteinStandard.find.byId(id);
        List<GlycoproteinStandard> glycoproteinStandardList = GlycoproteinStandard.find.all();
        List<CssData> cssDataPositiveHe = CssData.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "positive").eq("ionmob_gas_id", 1).order().asc("css").findList();
        List<CssData> cssDataNegativeHe = CssData.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "negative").eq("ionmob_gas_id", 1).order().asc("css").findList();

        List<CssData> cssDataPositiveN = CssData.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "positive").eq("ionmob_gas_id", 2).order().asc("css").findList();
        List<CssData> cssDataNegativeN = CssData.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "negative").eq("ionmob_gas_id", 2).order().asc("css").findList();
        return ok(views.html.ionmobility.ionmobilitySodiatedStandardData.render(cssDataPositiveHe, cssDataNegativeHe, glycoproteinStandards, cssDataPositiveN, cssDataNegativeN, glycoproteinStandardList ));
    }

    /*
    get all data minus dextran and sodiated
     */
    public static Result ionmobCompleteProtein(Long id){
        GlycoproteinStandard glycoproteinStandards = GlycoproteinStandard.find.byId(id);
        List<GlycoproteinStandard> glycoproteinStandardList = GlycoproteinStandard.find.all();
        List<CssDataGeneral> cssDataGeneralHe = CssDataGeneral.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "negative").eq("ionmob_gas_id", 1).order().asc("css").findList();
        List<CssDataGeneral> cssDataGeneralN = CssDataGeneral.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "negative").eq("ionmob_gas_id", 2).order().asc("css").findList();

        if(request().queryString().size() > 0){
            String hex = "0";
            String hexnac = "0";
            String dhex = "0";
            String neunac = "0";
            String nativeStructure= "off";
            String cssSearch = "0";
            int numberNaCss = 0;
            int numberCss = 0;
            hex = request().getQueryString("hex");
            hexnac = request().getQueryString("hexnac");
            dhex = request().getQueryString("dhex");
            neunac = request().getQueryString("neunac");
            nativeStructure = request().getQueryString("native");
            cssSearch = request().getHeader("css");

            String unicarbkbComposition = "/compositions?glycanType=N-Linked&comp_Hex=" + hex + "&comp_HexNAc=" + hexnac + "&comp_Deoxyhexose=" + dhex + "&comp_NeuAc=" + neunac + "&comp_NeuGc=&comp_Pent=&comp_Sulph=&comp_Phos=&comp_KDN=&comp_KDO=&comp_HexA=&comp_methyl=&comp_acetyl=&comp_other=";
            List<Glycomobcomposition> glycomobcomposition = new ArrayList<>();
            List<SodiatedGlycomobComposition> sodiatedGlycomobComposition = new ArrayList<>();

            Logger.info("native check " + nativeStructure);

            if(nativeStructure != null && !nativeStructure.isEmpty()) {
                glycomobcomposition = Glycomobcomposition.getMatchingCompositionsAll(hex, hexnac, dhex, neunac);
                sodiatedGlycomobComposition = SodiatedGlycomobComposition.getMatchingCompositionsAll(hex, hexnac, dhex, neunac);

                for(SodiatedGlycomobComposition s: sodiatedGlycomobComposition){
                    numberNaCss = s.cssDatas.size();
                }
                for(Glycomobcomposition c : glycomobcomposition){
                    numberCss = c.cssDataGenerals.size();
                }

            } else{
                glycomobcomposition = Glycomobcomposition.getMatchingCompositions(hex, hexnac, dhex, neunac);
                sodiatedGlycomobComposition = SodiatedGlycomobComposition.getMatchingCompositions(hex, hexnac, dhex, neunac);

                for(SodiatedGlycomobComposition s: sodiatedGlycomobComposition){
                    numberNaCss = s.cssDatas.size();
                }
                for(Glycomobcomposition c : glycomobcomposition){
                    numberCss = c.cssDataGenerals.size();
                }

            }

            if(!cssSearch.matches("0")){
                Logger.info("search css " + cssSearch);
            }



            return ok(views.html.ionmobility.ionmobilityComposition.render(numberCss, numberNaCss, glycomobcomposition, sodiatedGlycomobComposition, glycoproteinStandardList, unicarbkbComposition));
        }

        return ok(views.html.ionmobility.ionmobilityCompleteProtein.render(cssDataGeneralHe, cssDataGeneralN, glycoproteinStandards, glycoproteinStandardList));

    }

    public static Result cssSearch(){
        String cssSearch = "0";
        List<CssData> cssData = new ArrayList<>();
        List<CssDataGeneral> cssDataGeneral = new ArrayList<>();
        List<GlycoproteinStandard> glycoproteinStandardList = GlycoproteinStandard.find.all();

        if(request().queryString().size() > 0){
            cssSearch = request().getQueryString("css");
            if(!cssSearch.matches("0")){
                Logger.info("search css " + cssSearch);

                cssData = CssData.getMatchingCSS(Double.valueOf(cssSearch));
                cssDataGeneral = CssDataGeneral.getMatchingCSS(Double.valueOf(cssSearch));
            }
        }
        return ok(views.html.ionmobility.cssSearch.render(cssData, cssDataGeneral, glycoproteinStandardList));
    }
}