
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
object proteinsummary extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template18[String,String,String,String,ArrayList[Biolsource],List[Proteins],List[String],List[GsProteinStr2],HashSet[Reference],List[SitesReferences],String,ArrayList[String],List[GeneralSites],List[DefinedSites],String,String,List[com.avaje.ebean.SqlRow],List[composition_protein.CompSite],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(warning: String, notation: String, proteinName: String, accession: String, biol: ArrayList[Biolsource], protein: List[Proteins], uniprot: List[String], gssites: List[GsProteinStr2], source: HashSet[Reference], description: List[SitesReferences], sequence: String, proteinMultiple: ArrayList[String], generalSites: List[GeneralSites], definedSites: List[DefinedSites], typeEntry: String, swissProtName: String, proteinsource:  List[com.avaje.ebean.SqlRow], compSite: List[composition_protein.CompSite] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.505*/("""


"""),_display_(Seq[Any](/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""


<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="#"> UniCarbKB</a> <span class="divider">></span></li>
  <li><i class="icon-map-marker" ></i><a href="/proteins"> Protein</a> <span class="divider">></span></li>
  <li class="active" > """),_display_(Seq[Any](/*10.25*/proteinName)),format.raw/*10.36*/("""</li>
</ul>

<section id="layouts" class="proteinsummary">

  <div class="page-header row-fluid">
    <h1>Associated Structures</h1>
    <h4 class="subheader span8">Accession:
      """),_display_(Seq[Any](/*18.8*/if(typeEntry.matches("not swiss prot"))/*18.47*/ {_display_(Seq[Any](format.raw/*18.49*/("""<a href="http://uniprot.org/uniprot/?query="""),_display_(Seq[Any](/*18.93*/proteinName/*18.104*/.replaceAll(" ","+"))),format.raw/*18.124*/("""+AND+reviewed:yes&sort=score">"""),_display_(Seq[Any](/*18.155*/accession)),format.raw/*18.164*/(""" </a><span class="pull-right"><a href="http://uniprot.org/uniprot/?query="""),_display_(Seq[Any](/*18.238*/proteinName/*18.249*/.replaceAll(" ","+"))),format.raw/*18.269*/("""+AND+reviewed:yes&sort=score"><span class='label label-light'>UniProtKB/Swiss-Prot</span></a></span> """)))})),format.raw/*18.371*/("""
      """),_display_(Seq[Any](/*19.8*/if(!typeEntry.matches("not swiss prot"))/*19.48*/ {_display_(Seq[Any](format.raw/*19.50*/("""<a href="http://uniprot.org/uniprot/"""),_display_(Seq[Any](/*19.87*/accession)),format.raw/*19.96*/("""">"""),_display_(Seq[Any](/*19.99*/accession)),format.raw/*19.108*/(""" </a><span class="pull-right"><a href="http://uniprot.org/uniprot/"""),_display_(Seq[Any](/*19.175*/accession)),format.raw/*19.184*/(""""><span class='label label-light'>UniProtKB/Swiss-Prot Entry</span></a></span> """)))})),format.raw/*19.264*/("""
      </h4>
  </div>


  <div class="row-fluid">
    <div class="span8">
      <div class='name'>
        """),format.raw/*30.11*/("""
      </div>



      <div class='ptm-details'>
        <h3>UniProtKB/Swiss-Prot PTM Description</h3>
        """),format.raw/*39.6*/("""
	"""),_display_(Seq[Any](/*40.3*/for(uniprot <- uniprot) yield /*40.26*/ {_display_(Seq[Any](format.raw/*40.28*/("""
        """),_display_(Seq[Any](/*41.10*/if(uniprot.isEmpty())/*41.31*/ {_display_(Seq[Any](format.raw/*41.33*/("""  <div class="alert alert-error">No UniProt PTM information available. Unable to query UniProt for this accession number(s).</div> """)))})),format.raw/*41.165*/("""
        """),_display_(Seq[Any](/*42.10*/if(!uniprot.matches("No info"))/*42.41*/ {_display_(Seq[Any](format.raw/*42.43*/("""
        <p>"""),_display_(Seq[Any](/*43.13*/uniprot)),format.raw/*43.20*/("""</p>""")))})),format.raw/*43.25*/("""
        """)))})),format.raw/*44.10*/("""
      </div>



      <div class='glycosylation-sites'>
        """),_display_(Seq[Any](/*50.10*/if(generalSites.size() > 0 )/*50.38*/ {_display_(Seq[Any](format.raw/*50.40*/("""
        <h3>Glycosylation Sites</h3>
        """),_display_(Seq[Any](/*52.10*/for(generalSites <- generalSites) yield /*52.43*/ {_display_(Seq[Any](format.raw/*52.45*/("""
        """),_display_(Seq[Any](/*53.10*/if(generalSites.strSiteGeneral.size() > 0 )/*53.53*/ {_display_(Seq[Any](format.raw/*53.55*/("""
        <table class="computers table table-striped">
          <thead>
            <tr>
              <th>Position</th>
              <th>Structures</th>
              <th>Description</th>
              <th>Evidence</th>
            </tr>
          </thead>

          <tbody>
            <tr>
              <td>"""),_display_(Seq[Any](/*66.20*/generalSites/*66.32*/.glyco_aa_site.replace("N-", "ASN-").replace("Asn-", "ASN-").replace("S-", "SER-").replace("Ser-", "SER-").replace("T-", "THR-").replace("Thr-", "THR-").replace("ASASN-", "ASN-").replace("AsnAsn", "ASN-"))),format.raw/*66.236*/("""</td>
              <td>
                """),format.raw/*72.24*/("""
		<a href="/proteinsite?position="""),_display_(Seq[Any](/*73.35*/generalSites/*73.47*/.glyco_aa_site)),format.raw/*73.61*/("""&protein="""),_display_(Seq[Any](/*73.71*/generalSites/*73.83*/.swiss_prot)),format.raw/*73.94*/("""&type=general">
                  <span class="label label-notice"><i class='icon-th icon-white'></i> 
                    Associated Structures: <b>"""),_display_(Seq[Any](/*75.48*/generalSites/*75.60*/.strSiteGeneral.size())),format.raw/*75.82*/("""</b></span>
                </a>
              </td>
              <td><span class="label">global</span></td>
              <td>GlycoSuite</td>
            </tr>
          </tbody>
        </table>
        """)))}))))}))))})),format.raw/*83.12*/("""
      </div>

      <div class='glycosylation-sites'>
        """),_display_(Seq[Any](/*87.10*/if(definedSites.size() > 0 )/*87.38*/ {_display_(Seq[Any](format.raw/*87.40*/("""
        <h5>Site-Specific Information</h5>
        <p>A number of glycan structures have been assigned to specific glycosylation sites</p>
        <table class="computers table table-striped">
          <thead>
            <tr>
              <th>Position</th>
              <th>Structures</th>
              <th>Description</th>
              <th>Evidence</th>
            </tr>
          </thead>

          <tbody>
            """),_display_(Seq[Any](/*101.14*/for(definedSites <- definedSites) yield /*101.47*/ {_display_(Seq[Any](format.raw/*101.49*/("""
            <tr>
              <td>"""),_display_(Seq[Any](/*103.20*/definedSites/*103.32*/.amino_acid_position.replace("N-", "ASN-").replace("Asn-", "ASN-").replace("S-", "SER-").replace("Ser-", "SER-").replace("T-", "THR-").replace("Thr-", "THR-").replace("ASASN-", "ASN-").replace("AsnAsn", "ASN-"))),format.raw/*103.242*/("""</td>
              <td>
		"""),format.raw/*109.24*/("""
		 <a href="/proteinsite?position="""),_display_(Seq[Any](/*110.36*/definedSites/*110.48*/.amino_acid_position)),format.raw/*110.68*/("""&protein="""),_display_(Seq[Any](/*110.78*/definedSites/*110.90*/.swiss_prot)),format.raw/*110.101*/("""&type=defined">
                  <span class="label label-notice"><i class='icon-th icon-white'></i>
                    Associated Structures: <b>"""),_display_(Seq[Any](/*112.48*/definedSites/*112.60*/.strSiteDefined.size())),format.raw/*112.82*/("""</b></span>
                </a>
              </td>
              <td><span class="label">Site specific</span></td>
              <td>GlycoSuite</td>
            </tr>
            """)))})),format.raw/*118.14*/("""
          </tbody>
        </table>
        """)))})),format.raw/*121.10*/("""
      </div>

        <div class='glycosylation-sites'>
            <div class="alert alert-info">Compositional data available: <a href="/composition_protein/"""),_display_(Seq[Any](/*125.104*/accession)),format.raw/*125.113*/("""">"""),_display_(Seq[Any](/*125.116*/compSite/*125.124*/.size())),format.raw/*125.131*/(""" compositions reported</a>



            <p>"""),_display_(Seq[Any](/*129.17*/for(cp <- compSite) yield /*129.36*/ {})),format.raw/*129.39*/(""" </p>

                """),_display_(Seq[Any](/*131.18*/compSite/*131.26*/.groupBy(_.aminoAcidPosition).map/*131.59*/{ case (y,z) =>_display_(Seq[Any](format.raw/*131.74*/(""" <p>"""),_display_(Seq[Any](/*131.79*/y)),format.raw/*131.80*/("""
                """),_display_(Seq[Any](/*132.18*/z/*132.19*/.map/*132.23*/{ a =>_display_(Seq[Any](format.raw/*132.29*/(""" """),_display_(Seq[Any](/*132.31*/a/*132.32*/.composition))))})),format.raw/*132.45*/("""</p>
                    """)))})),format.raw/*133.22*/("""



            </div>
        </div>

      <div class='glycosylation-sites'>
        <h3>Glycan Structures</h3>
        <ul class="structures clearfix">

          """),_display_(Seq[Any](/*144.12*/for(s <- proteinMultiple) yield /*144.37*/ {_display_(Seq[Any](format.raw/*144.39*/("""
          <li>
             """),_display_(Seq[Any](/*146.15*/views/*146.20*/.html.format.structure(notation, s.toLong))),format.raw/*146.62*/("""
          </li>
          """)))})),format.raw/*148.12*/("""
        </ul>

	"""),format.raw/*161.4*/("""
        """),format.raw/*167.18*/("""
      </div>



      <div class='notes'>
        <h3>Notes</h3>
        <p>Accompanying information sourced from GlycoSuiteDB</p>
        """),_display_(Seq[Any](/*175.10*/if(!description.isEmpty() )/*175.37*/ {_display_(Seq[Any](format.raw/*175.39*/("""
	<ol>
        """),_display_(Seq[Any](/*177.10*/for(d <- description) yield /*177.31*/{_display_(Seq[Any](format.raw/*177.32*/("""
          <li class="references">"""),_display_(Seq[Any](/*178.35*/d/*178.36*/.glyco_aa_site.replace("N-", "ASN-").replace("Asn-", "ASN-").replace("S-", "SER-").replace("Ser-", "SER-").replace("T-", "THR-").replace("Thr-", "THR-").replace("ASASN-", "ASN-").replace("AsnAsn", "ASN-").replaceAll("(^, )", "").trim)),format.raw/*178.269*/("""</li>
        """)))})),format.raw/*179.10*/("""
	</ol>""")))})),format.raw/*180.8*/("""
      </div>

      """),format.raw/*189.15*/("""

    </div><!-- /col -->

    <div class="span4 details">

      """),_display_(Seq[Any](/*195.8*/views/*195.13*/.html.format.format())),format.raw/*195.34*/("""

      """),_display_(Seq[Any](/*197.8*/if(sequence.length > 1)/*197.31*/ {_display_(Seq[Any](format.raw/*197.33*/("""
      <div class="info">
        <h3>Sequence</h3>
        <div class="sequence">
          """),_display_(Seq[Any](/*201.12*/sequence)),format.raw/*201.20*/("""
        </div>
      </div>""")))})),format.raw/*203.14*/("""

        <div class='info'>
          <h3>Biological Associations</h4>
          <div class='source'>
            <a id='toggle-taxonomy'><span class='label label-important'><span class='icon-leaf icon-white'></span> Taxonomy ("""),_display_(Seq[Any](/*208.127*/proteinsource/*208.140*/.size())),format.raw/*208.147*/(""") <span class="caret"></span></span></a>
            <a id='toggle-protein'><span class='label label-warning'><span class='icon-map-marker icon-white'></span> Protein (1) <span class="caret"></span></span></a>
            <a id='toggle-source'><span class='label label-success'><span class='icon-leaf icon-white'></span> Source <span class="caret"></span></span></a>
          </div>

          <div>
            <ul id='more-taxonomy'>
              <h3 id='less-taxonomy'><span class='icon-tags icon-white'></span> Taxonomies</h3>
              """),_display_(Seq[Any](/*216.16*/for(p <- proteinsource) yield /*216.39*/{_display_(Seq[Any](format.raw/*216.40*/("""
              <li><span class='icon-tag icon-white'></span> <a href="/taxonomy/"""),_display_(Seq[Any](/*217.81*/p/*217.82*/.get("taxonomy_id"))),format.raw/*217.101*/("""">"""),_display_(Seq[Any](/*217.104*/p/*217.105*/.get("species"))),format.raw/*217.120*/("""</a> &gt; <a href="/tissuesummary/"""),_display_(Seq[Any](/*217.155*/p/*217.156*/.get("tissue_id"))),format.raw/*217.173*/("""">"""),_display_(Seq[Any](/*217.176*/p/*217.177*/.get("system"))),format.raw/*217.191*/("""</a> </li>
              """)))})),format.raw/*218.16*/("""
            </ul>
            <ul id='more-protein'>
              <h3 id='less-protein'><span class='icon-map-marker icon-white'></span> Protein</h3>
		"""),_display_(Seq[Any](/*222.4*/if(!typeEntry.matches("not swiss prot"))/*222.44*/ {_display_(Seq[Any](format.raw/*222.46*/("""
                 <li><span class='icon-map-marker icon-white'></span> <a href='/proteinsummary/"""),_display_(Seq[Any](/*223.97*/accession)),format.raw/*223.106*/("""/annotated'>"""),_display_(Seq[Any](/*223.119*/proteinName)),format.raw/*223.130*/("""</a></li>
		""")))})),format.raw/*224.4*/("""
		"""),_display_(Seq[Any](/*225.4*/if(typeEntry.matches("not swiss prot"))/*225.43*/ {_display_(Seq[Any](format.raw/*225.45*/("""
			"""),_display_(Seq[Any](/*226.5*/for(p <- proteinsource) yield /*226.28*/{_display_(Seq[Any](format.raw/*226.29*/("""
		 	<li><span class='icon-map-marker icon-white'></span> <a href='/proteinsummary/"""),_display_(Seq[Any](/*227.84*/proteinName)),format.raw/*227.95*/("""/"""),_display_(Seq[Any](/*227.97*/p/*227.98*/.get("species"))),format.raw/*227.113*/("""'>"""),_display_(Seq[Any](/*227.116*/proteinName)),format.raw/*227.127*/("""</a></li>
			""")))})),format.raw/*228.5*/("""
		""")))})),format.raw/*229.4*/("""
            </ul>
            <ul id='more-source'>
              <h3 id='less-source'><span class='icon-leaf icon-white'></span> Source</h3>
              """),_display_(Seq[Any](/*233.16*/for(p <- proteinsource) yield /*233.39*/{_display_(Seq[Any](format.raw/*233.40*/("""
              <li><span class='icon-leaf icon-white'></span> <a href='/tissuesummary/"""),_display_(Seq[Any](/*234.87*/p/*234.88*/.get("tissue_id"))),format.raw/*234.105*/("""'>"""),_display_(Seq[Any](/*234.108*/p/*234.109*/.get("div1"))),format.raw/*234.121*/(""" > """),_display_(Seq[Any](/*234.125*/p/*234.126*/.get("div2"))),format.raw/*234.138*/(""" > """),_display_(Seq[Any](/*234.142*/p/*234.143*/.get("div3"))),format.raw/*234.155*/(""" > """),_display_(Seq[Any](/*234.159*/p/*234.160*/.get("div4"))),format.raw/*234.172*/("""</a></li>
             """)))})),format.raw/*235.15*/("""
            </ul>
          </div>
        </div>


        <div class="info">
          <h3>References """),_display_(Seq[Any](/*242.27*/if(source.size() > 5)/*242.48*/ {_display_(Seq[Any](format.raw/*242.50*/("""showing top 5""")))})),format.raw/*242.64*/(""" <span id='show-references' class="label" style="font-size:16px"><a href="#4">"""),_display_(Seq[Any](/*242.143*/source/*242.149*/.size())),format.raw/*242.156*/("""</a></span></h3>
          <ol>
            """),_display_(Seq[Any](/*244.14*/for((source,i) <- source.zipWithIndex; if (i < 5)) yield /*244.64*/ {_display_(Seq[Any](format.raw/*244.66*/("""
            <li class="references">
              <p class="title"><a name='"""),_display_(Seq[Any](/*246.42*/i)),format.raw/*246.43*/("""' href='/references/"""),_display_(Seq[Any](/*246.64*/source/*246.70*/.id)),format.raw/*246.73*/("""'>"""),_display_(Seq[Any](/*246.76*/source/*246.82*/.title)),format.raw/*246.88*/("""</a></p>
              <p class="author">"""),_display_(Seq[Any](/*247.34*/source/*247.40*/.authors)),format.raw/*247.48*/("""</p>
              <p class="ref">PubMed: <a href='http://www.ncbi.nlm.nih.gov/pubmed/"""),_display_(Seq[Any](/*248.83*/source/*248.89*/.pmid)),format.raw/*248.94*/("""'>"""),_display_(Seq[Any](/*248.97*/source/*248.103*/.pmid)),format.raw/*248.108*/("""</a> Year: """),_display_(Seq[Any](/*248.120*/source/*248.126*/.year)),format.raw/*248.131*/("""</p>
            </li>
            """)))})),format.raw/*250.14*/("""
            <div id='more-references'>
              """),_display_(Seq[Any](/*252.16*/for((source,i) <- source.zipWithIndex; if (i > 5)) yield /*252.66*/ {_display_(Seq[Any](format.raw/*252.68*/("""
              <li class="references">
                <p class="title"><a name='"""),_display_(Seq[Any](/*254.44*/i)),format.raw/*254.45*/("""' href='/references/"""),_display_(Seq[Any](/*254.66*/source/*254.72*/.id)),format.raw/*254.75*/("""'>"""),_display_(Seq[Any](/*254.78*/source/*254.84*/.title)),format.raw/*254.90*/("""</a></p>
                <p class="author">"""),_display_(Seq[Any](/*255.36*/source/*255.42*/.authors)),format.raw/*255.50*/("""</p>
                <p class="ref">PubMed: <a href='http://www.ncbi.nlm.nih.gov/pubmed/"""),_display_(Seq[Any](/*256.85*/source/*256.91*/.pmid)),format.raw/*256.96*/("""'>"""),_display_(Seq[Any](/*256.99*/source/*256.105*/.pmid)),format.raw/*256.110*/("""</a> Year: """),_display_(Seq[Any](/*256.122*/source/*256.128*/.year)),format.raw/*256.133*/("""</p>
              </li>
              """)))})),format.raw/*258.16*/("""
            </div>
            """),_display_(Seq[Any](/*260.14*/if(source.size() > 5)/*260.35*/ {_display_(Seq[Any](format.raw/*260.37*/("""
            <div id='show-more-references' class='more-structures' href='#'>
	      <span class="linktext">See more references</span>
      	      <span class="linktext" style="display:none">See less references</span>
              <br />
              <span>&#9679; &#9679; &#9679;</span>
            </div>
            """)))})),format.raw/*267.14*/("""


          </ol>
        </div>

      </div><!-- /col -->
    </div><!-- /row -->

    """),_display_(Seq[Any](/*276.6*/views/*276.11*/.html.footerunicarb.footerunicarb())),format.raw/*276.46*/("""

  </section>

  """)))})),format.raw/*280.4*/("""
"""))}
    }
    
    def render(warning:String,notation:String,proteinName:String,accession:String,biol:ArrayList[Biolsource],protein:List[Proteins],uniprot:List[String],gssites:List[GsProteinStr2],source:HashSet[Reference],description:List[SitesReferences],sequence:String,proteinMultiple:ArrayList[String],generalSites:List[GeneralSites],definedSites:List[DefinedSites],typeEntry:String,swissProtName:String,proteinsource:List[com.avaje.ebean.SqlRow],compSite:List[composition_protein.CompSite]): play.api.templates.HtmlFormat.Appendable = apply(warning,notation,proteinName,accession,biol,protein,uniprot,gssites,source,description,sequence,proteinMultiple,generalSites,definedSites,typeEntry,swissProtName,proteinsource,compSite)
    
    def f:((String,String,String,String,ArrayList[Biolsource],List[Proteins],List[String],List[GsProteinStr2],HashSet[Reference],List[SitesReferences],String,ArrayList[String],List[GeneralSites],List[DefinedSites],String,String,List[com.avaje.ebean.SqlRow],List[composition_protein.CompSite]) => play.api.templates.HtmlFormat.Appendable) = (warning,notation,proteinName,accession,biol,protein,uniprot,gssites,source,description,sequence,proteinMultiple,generalSites,definedSites,typeEntry,swissProtName,proteinsource,compSite) => apply(warning,notation,proteinName,accession,biol,protein,uniprot,gssites,source,description,sequence,proteinMultiple,generalSites,definedSites,typeEntry,swissProtName,proteinsource,compSite)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 16:42:31 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/proteinsummary.scala.html
                    HASH: 6f976b773fb67b57a6a5415727d830563989c210
                    MATRIX: 1057->1|1655->504|1693->508|1704->512|1742->514|2031->767|2064->778|2282->961|2330->1000|2370->1002|2450->1046|2471->1057|2514->1077|2582->1108|2614->1117|2725->1191|2746->1202|2789->1222|2924->1324|2967->1332|3016->1372|3056->1374|3129->1411|3160->1420|3199->1423|3231->1432|3335->1499|3367->1508|3480->1588|3615->1823|3753->2066|3791->2069|3830->2092|3870->2094|3916->2104|3946->2125|3986->2127|4151->2259|4197->2269|4237->2300|4277->2302|4326->2315|4355->2322|4392->2327|4434->2337|4536->2403|4573->2431|4613->2433|4696->2480|4745->2513|4785->2515|4831->2525|4883->2568|4923->2570|5274->2885|5295->2897|5522->3101|5591->3514|5662->3549|5683->3561|5719->3575|5765->3585|5786->3597|5819->3608|6005->3758|6026->3770|6070->3792|6319->4001|6419->4065|6456->4093|6496->4095|6964->4526|7014->4559|7055->4561|7129->4598|7151->4610|7385->4820|7441->5198|7514->5234|7536->5246|7579->5266|7626->5276|7648->5288|7683->5299|7869->5448|7891->5460|7936->5482|8151->5664|8230->5710|8428->5870|8461->5879|8502->5882|8521->5890|8552->5897|8635->5943|8671->5962|8697->5965|8758->5989|8776->5997|8819->6030|8873->6045|8915->6050|8939->6051|8994->6069|9005->6070|9019->6074|9064->6080|9103->6082|9114->6083|9154->6096|9213->6122|9417->6289|9459->6314|9500->6316|9567->6346|9582->6351|9647->6393|9708->6421|9753->6771|9791->7058|9969->7199|10006->7226|10047->7228|10100->7244|10138->7265|10178->7266|10250->7301|10261->7302|10518->7535|10566->7550|10606->7558|10656->7808|10759->7875|10774->7880|10818->7901|10863->7910|10896->7933|10937->7935|11068->8029|11099->8037|11161->8066|11428->8295|11452->8308|11483->8315|12068->8863|12108->8886|12148->8887|12266->8968|12277->8969|12320->8988|12361->8991|12373->8992|12412->9007|12485->9042|12497->9043|12538->9060|12579->9063|12591->9064|12629->9078|12688->9104|12879->9259|12929->9299|12970->9301|13104->9398|13137->9407|13188->9420|13223->9431|13268->9444|13308->9448|13357->9487|13398->9489|13439->9494|13479->9517|13519->9518|13640->9602|13674->9613|13713->9615|13724->9616|13763->9631|13804->9634|13839->9645|13885->9659|13921->9663|14116->9821|14156->9844|14196->9845|14320->9932|14331->9933|14372->9950|14413->9953|14425->9954|14461->9966|14503->9970|14515->9971|14551->9983|14593->9987|14605->9988|14641->10000|14683->10004|14695->10005|14731->10017|14788->10041|14931->10147|14962->10168|15003->10170|15050->10184|15167->10263|15184->10269|15215->10276|15297->10321|15364->10371|15405->10373|15520->10451|15544->10452|15602->10473|15618->10479|15644->10482|15684->10485|15700->10491|15729->10497|15808->10539|15824->10545|15855->10553|15979->10640|15995->10646|16023->10651|16063->10654|16080->10660|16109->10665|16159->10677|16176->10683|16205->10688|16274->10724|16366->10779|16433->10829|16474->10831|16593->10913|16617->10914|16675->10935|16691->10941|16717->10944|16757->10947|16773->10953|16802->10959|16883->11003|16899->11009|16930->11017|17056->11106|17072->11112|17100->11117|17140->11120|17157->11126|17186->11131|17236->11143|17253->11149|17282->11154|17355->11194|17425->11227|17456->11248|17497->11250|17853->11573|17980->11664|17995->11669|18053->11704|18104->11723
                    LINES: 26->1|29->1|32->4|32->4|32->4|38->10|38->10|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|55->30|62->39|63->40|63->40|63->40|64->41|64->41|64->41|64->41|65->42|65->42|65->42|66->43|66->43|66->43|67->44|73->50|73->50|73->50|75->52|75->52|75->52|76->53|76->53|76->53|89->66|89->66|89->66|91->72|92->73|92->73|92->73|92->73|92->73|92->73|94->75|94->75|94->75|102->83|106->87|106->87|106->87|120->101|120->101|120->101|122->103|122->103|122->103|124->109|125->110|125->110|125->110|125->110|125->110|125->110|127->112|127->112|127->112|133->118|136->121|140->125|140->125|140->125|140->125|140->125|144->129|144->129|144->129|146->131|146->131|146->131|146->131|146->131|146->131|147->132|147->132|147->132|147->132|147->132|147->132|147->132|148->133|159->144|159->144|159->144|161->146|161->146|161->146|163->148|166->161|167->167|175->175|175->175|175->175|177->177|177->177|177->177|178->178|178->178|178->178|179->179|180->180|183->189|189->195|189->195|189->195|191->197|191->197|191->197|195->201|195->201|197->203|202->208|202->208|202->208|210->216|210->216|210->216|211->217|211->217|211->217|211->217|211->217|211->217|211->217|211->217|211->217|211->217|211->217|211->217|212->218|216->222|216->222|216->222|217->223|217->223|217->223|217->223|218->224|219->225|219->225|219->225|220->226|220->226|220->226|221->227|221->227|221->227|221->227|221->227|221->227|221->227|222->228|223->229|227->233|227->233|227->233|228->234|228->234|228->234|228->234|228->234|228->234|228->234|228->234|228->234|228->234|228->234|228->234|228->234|228->234|228->234|229->235|236->242|236->242|236->242|236->242|236->242|236->242|236->242|238->244|238->244|238->244|240->246|240->246|240->246|240->246|240->246|240->246|240->246|240->246|241->247|241->247|241->247|242->248|242->248|242->248|242->248|242->248|242->248|242->248|242->248|242->248|244->250|246->252|246->252|246->252|248->254|248->254|248->254|248->254|248->254|248->254|248->254|248->254|249->255|249->255|249->255|250->256|250->256|250->256|250->256|250->256|250->256|250->256|250->256|250->256|252->258|254->260|254->260|254->260|261->267|270->276|270->276|270->276|274->280
                    -- GENERATED --
                */
            