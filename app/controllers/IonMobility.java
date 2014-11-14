package controllers;

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

}
