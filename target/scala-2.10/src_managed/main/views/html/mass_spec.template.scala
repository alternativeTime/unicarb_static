
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object mass_spec extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""

<script src=""""),_display_(Seq[Any](/*4.15*/routes/*4.21*/.Assets.at("/public","javascripts/massspec.js"))),format.raw/*4.68*/(""""></script>

<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-briefcase" ></i> Mass Spec<span class="divider"></span></li>
</ul>

<section id="layouts" class="browse massspec">
  <div class="page-header row-fluid">
    <h1>Mass Spec</h1>
    <h4 class="subheader">UnicarbKB Mass Spec details.</h4>
  </div>

  <div class="row-fluid">
    <div class="span4 search">
      <div class="row-fluid">
        <div class='info'>
          <div id='structure-massspec'>
            <img class="sugar_image" src="../images/gs/_1053.png">
          </div>
        </div>
        <div class="filterbar tabbable clearfix">
          <ul class="nav nav-tabs" id="myTabBar">
            <li id='workflow1-toggle' class='active'><a href='#workflow1' data-toggle="tab">Sample Summary<span class="pull-right count"></span></a></li>
            <li id='workflow2-toggle'><a href='#workflow2' data-toggle="tab">MS/MS Spectra</a></li>
            <li id='workflow3-toggle'><a href='#workflow3' data-toggle="tab">Peak List<span class="pull-right count"></span></a></li>
            <li id='workflow4-toggle'><a href='#workflow4' data-toggle="tab">Ion Mode<span class="pull-right count"></span></a></li>
            <li id='workflow5-toggle'><a href='#workflow5' data-toggle="tab">HPLC Details<span class="pull-right count"></span></a></li>
          </ul>
        </div>
        <div class='info'>
          <h3>Mass Spec Details</h3>
          <div class="control-group">
            <label class='control-label' for="name">Ion:</label>
            <div class='controls record'>[M-H]</div>
          </div>
          <div class="control-group">
            <label class='control-label'>Base Peak m/z:</label>
            <div class='controls record'>587.25</div>
          </div>
          <div class="control-group">
            <label class='control-label'>Calculated mass and m/z:</label>
            <div class='controls record'>588.238 - 587.231</div>
          </div>
          <div class="control-group">
            <label class='control-label'>Intensity:</label>
            <div class='controls record'>100</div>
          </div>
          <div class="control-group">
            <label class='control-label'>Persubstitution:</label>
            <div class='controls record'>Underivatised</div>
          </div>
          <div class="control-group">
            <label class='control-label'>Reducing End:</label>
            <div class='controls record'>Reduced reducing end</div>
          </div>
          <div class="control-group">
            <label class='control-label'>Retention Time:</label>
            <div class='controls record'>13.65 minutes (see HPLC details)</div>
          </div>
          <div class="control-group">
            <label class='control-label'>Annotated Fragments:</label>
            <div class='controls record'>17 (more details)</div>
          </div>
        </div>

      </div>
    </div>

    <div class="span8 rightpanel">


        <div class='tab-content span12'>

          <div id="workflow1" class="tab-pane active control-group glycosuitedb">

            <h2>Protein Description and Origin</h2>
            <p>Mucin-5AC P98088</p>
            <p>Homo sapiens</p>
            <p>Gastric Mucosa</p>

            <h2>UniProtKB/Swiss-Prot Annotation</h2>

            <strong>Protein Function</strong>
            <p>Gel-forming glycoprotein of gastric and respiratoy tract epithelia that protects the mucosa from infection and chemical damage by binding to inhaled microrganisms and particles that are subsequently removed by the mucocilary system</p>

            <strong>Post-translational modification</strong>
            <p>C-, O- and N-glycosylated. O-glycosylated on the Thr-/Ser-rich tandem repeats. C-mannosylation in the Cys-rich subdomains may be required for proper folding of these regions and for export from the endoplasmic reticulum during biosynthesis Proteolytic cleavage in the C-terminal is initiated early in the secretory pathway and does not involve a serine protease. The extent of cleavage is increased in the acidic parts of the secretory pathway. Cleavage generates a reactive group which could link the protein to a primary amide</p>

          </div> """),format.raw/*93.35*/("""

          <div id="workflow2" class="tab-pane control-group row-fluid eurocarb">

            <div id='spectragraph'>
              <h2>MS/MS Spectra Graph — Peak List <a id='graph-reset' class='btn btn-warning pull-right'>Reset Graph</a></h2>
              <svg id='peaklist'>
            </div>
            </svg>

          </div> """),format.raw/*103.38*/("""

          <div id="workflow3" class="tab-pane control-group nextprot">

            <h2>Annotated Peak List</h2>

            <p>A summary listing for all annotated fragments for this structure can be accessed here.</p>
            <p>Download the peak lists - no reported annotations.</p>

            <table class='table table-striped'>
              <thead>
                <tr>
                  <th>Peak</th>
                  <th>Intensity</th>
                  <th>Annotation</th>
                  <th>Charge</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>171.9</td>
                  <td>1.6</td>
                  <td></td>
                  <td></td>
                </tr>
              </tbody>
            </table>

          </div> """),format.raw/*131.38*/("""

          <div id="workflow4" class="tab-pane control-group nextprot">

            <h2>Ion Mode</h2>

            <div class="control-group">
              <label class='control-label'>MS Mode:</label>
              <div class='controls record'>The data was acquired in Negative mode</div>
            </div>

            <div class="control-group">
              <label class='control-label'>Ion:</label>
              <div class='controls record'>[M-H] -</div>
            </div>

            <div class="control-group">
              <label class='control-label'>Charge State:</label>
              <div class='controls record'>-1</div>
            </div>

          </div> """),format.raw/*152.38*/("""

          <div id="workflow5" class="tab-pane control-group nextprot">

            <h2>HPLC Details</h2>
            <p>Sample material was separated using a Thermo Scientific - Hypercarb column and the glycan eluted at 13.65 minutes</p>

            <div class="control-group">
              <label class='control-label'>Packing Material:</label>
              <div class='controls record'>Porous Graphitic Carbon</div>
            </div>
            
            <div class="control-group">
              <label class='control-label'>Column Width:</label>
              <div class='controls record'>320 um</div>
            </div>
            
            <div class="control-group">
              <label class='control-label'>Column Length:</label>
              <div class='controls record'>100 mm</div>
            </div>

            <p>Information is available for the LC setup and running conditions:</p>
            
            <div class="control-group">
              <label class='control-label'>Solvent A:</label>
              <div class='controls record'>10mM_AmmBicarb</div>
            </div>
            
            <div class="control-group">
              <label class='control-label'>Solvent B:</label>
              <div class='controls record'>10mM_AmmBicarb/80%_ACN</div>
            </div>
            
            <div class="control-group">
              <label class='control-label'>Flow Rate:</label>
              <div class='controls record'>10 ul/min</div>
            </div>
            
            <div class="control-group">
              <label class='control-label'>Time:</label>
              <div class='controls record'>60 min</div>
            </div>

          </div> """),format.raw/*196.38*/("""

        </div>

      </div>
    </div>
  </div><!-- /col -->
</div><!-- /row -->
<div class="footer row-fluid">
  <div class="span12">
    <p class="pull-left">UniCarbKB</p>
    <p class="pull-right">Supported by 
      <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp; 
      <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;
      <a href="http://www.stint.se"> STINT</a> &nbsp;|&nbsp;
      <a href="http://expasy.org/"> SIB ExPASy</a>
    </p>
  </div>
</div>
</section>

""")))})),format.raw/*217.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/mass_spec.scala.html
                    HASH: fd7d2dfc07051ce5d4f229288fb9e99359562148
                    MATRIX: 868->2|879->6|916->7|967->23|981->29|1049->76|5398->4414|5763->4770|6609->5607|7318->6307|9063->8043|9591->8539
                    LINES: 29->2|29->2|29->2|31->4|31->4|31->4|120->93|130->103|158->131|179->152|223->196|244->217
                    -- GENERATED --
                */
            