package controllers;

import models.glycomobcomposition.CssData;
import models.glycomobcomposition.CssDataGeneral;
import models.glycomobcomposition.GlycoproteinStandard;
import models.ionmob.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.ionmobilityHome;

import java.util.List;


public class IonMobility extends Controller {

    public static Result ionmobilityHome() {
        List<GlycanMob> glycanMobList = GlycanMob.find.all();
        List<NitrogenNegative> nitrogenNegativeList =  NitrogenNegative.find.all();
        List<NitrogenPositive> nitrorogenPositiveList = NitrogenPositive.find.all();
        List<HeNegative> henegativeList = HeNegative.find.all();
        List<HePositive> hepositiveList = HePositive.find.all();
        return ok(ionmobilityHome.render(glycanMobList, nitrogenNegativeList, nitrorogenPositiveList, henegativeList, hepositiveList ));
    }

    public static Result dextranIonMobilityHome(){
        List<DextranPositive> dextranPositiveList = DextranPositive.find.all();
        List<DextranNegative> dextranNegativeList = DextranNegative.find.all();
        return ok(views.html.ionmobility.dextranIonMobility.render(dextranNegativeList, dextranPositiveList));
    }

    public static Result ionmobGlycoproteinStandards() {
        List<GlycoproteinStandard> glycoproteinStandards = GlycoproteinStandard.find.all();
        return ok(views.html.ionmobility.ionmobilityStandards.render(glycoproteinStandards));
    }

    public static Result ionmobSodiatedGlycoproteinData(Long id){
        GlycoproteinStandard glycoproteinStandards = GlycoproteinStandard.find.byId(id);
        List<CssData> cssDataPositiveHe = CssData.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "positive").eq("ionmob_gas_id", 1).order().asc("css").findList();
        List<CssData> cssDataNegativeHe = CssData.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "negative").eq("ionmob_gas_id", 1).order().asc("css").findList();

        List<CssData> cssDataPositiveN = CssData.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "positive").eq("ionmob_gas_id", 2).order().asc("css").findList();
        List<CssData> cssDataNegativeN = CssData.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "negative").eq("ionmob_gas_id", 2).order().asc("css").findList();
        return ok(views.html.ionmobility.ionmobilitySodiatedStandardData.render(cssDataPositiveHe, cssDataNegativeHe, glycoproteinStandards, cssDataPositiveN, cssDataNegativeN ));
    }

    /*
    get all data minus dextran and sodiated
     */
    public static Result ionmobCompleteProtein(Long id){
        GlycoproteinStandard glycoproteinStandards = GlycoproteinStandard.find.byId(id);
        List<GlycoproteinStandard> glycoproteinStandardList = GlycoproteinStandard.find.all();
        List<CssDataGeneral> cssDataGeneralHe = CssDataGeneral.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "negative").eq("ionmob_gas_id", 1).order().asc("css").findList();
        List<CssDataGeneral> cssDataGeneralN = CssDataGeneral.find.fetch("glycoproteinStandardList").where().eq("glycoproteinStandardList.id", id).eq("mode", "negative").eq("ionmob_gas_id", 2).order().asc("css").findList();
        return ok(views.html.ionmobility.ionmobilityCompleteProtein.render(cssDataGeneralHe, cssDataGeneralN, glycoproteinStandards, glycoproteinStandardList));

    }

}
