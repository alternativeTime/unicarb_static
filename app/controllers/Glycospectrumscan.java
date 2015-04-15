package controllers;

import org.unicarbkb.gss.Amino_acids.glycans;
import org.unicarbkb.gss.glycoSpectrumScan.GSS_Core;
import org.unicarbkb.gss.glycoSpectrumScan.ReadGlycanFile;
import play.Logger;
import play.Play;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http.MultipartFormData;
import play.mvc.Result;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by matthew on 15/04/15.
 */
public class Glycospectrumscan extends Controller {

    public static Result glycospectrumscan() {
        String test = "test";
        return ok(views.html.gss.gssHome.render(test));

    }

    public static Result glycanFileUpload() throws IOException {

        List<String> uploadFiles = new ArrayList<>();

        MultipartFormData body = request().body().asMultipartFormData();
        System.out.println("body request " + body.toString());
        MultipartFormData.FilePart gfile = body.getFile("glycanfile");
        if (gfile != null) {

            List<MultipartFormData.FilePart> plate_files = request().body().asMultipartFormData().getFiles();
            for(MultipartFormData.FilePart f : plate_files){

                String myUploadPath = Play.application().configuration().getString("myUploadPath");
                Logger.info("file: " + f.getFilename() + " " + myUploadPath);

                File file1 = f.getFile();
                BufferedReader br= new BufferedReader(new FileReader(file1));
                String header = br.readLine();
                Logger.info("header: " + header);
                if(header.toLowerCase().contains("mass")) {
                    file1.renameTo(new File(myUploadPath, "glycanFile.txt"));
                    uploadFiles.add("glycanFile.txt");

                } else{
                    file1.renameTo(new File(myUploadPath, "exampleGss.txt"));
                    uploadFiles.add("exampleGss.txt");
                }

                int count = new File("/tmp/gssfiles").listFiles().length;
                Logger.info("count: " + count);
                if(count == 2 ){
                    return redirect(routes.Glycospectrumscan.gssSettings());
                }
            }


            return redirect(routes.Glycospectrumscan.glycanFileProcess(gfile.getFilename()));

                    //glycanFileProcess(gfile.getFilename()));

        } else {
            //flash("error", "Missing file");
            return badRequest(views.html.formdata.fileUpload.render());
        }
    }

    public static Result glycanFileProcess(String filename) {
        return ok(views.html.gss.gssHome.render(filename));
    }

    public static Result gssSettings() {
        return ok(views.html.gss.gssSettings.render());
    }

    public static Result gssCore() throws IOException {

        //String uniprot = String.valueOf(request().queryString().get("uniprot"));
        //Double window = Double.valueOf(String.valueOf(request().queryString().get("window")));

        Logger.info("request: " + request().queryString());

        DynamicForm requestData = Form.form().bindFromRequest();
        Double window = Double.valueOf(requestData.get("window"));
        String uniprot = requestData.get("uniprot");
        Double intensityThreshold = Double.valueOf(requestData.get("threshold"));

        GSS_Core gss = new GSS_Core();

        final int cleavage = 0;
        int charge = 3;
        uniprot = "P01833";
        //Double window = 0.5;
        //double intensityThreshold = 3.0;
        String proteinTreatment = "ProteinSequence_Trypsin";




        ArrayList<glycans> glycanss = new ArrayList();
        glycanss = ReadGlycanFile.getGlycanCompositions();
        for(glycans gt : glycanss){
            System.out.println("another check: " + gt.Hexose);
        }

        gss.PrepareSequence(cleavage, charge, uniprot, window, intensityThreshold, proteinTreatment);

        return ok(views.html.gss.gssResults.render());
    }
}
