$(document).ready(function(){

  $("#querydiseasecheck").click(function() {
    $("#querydiseasehide").toggle();
  });

  $("#querymasscheck").click(function() {
    $("#querymasshide").toggle();
  });

  $("#querycompositioncheck").click(function() {
    $("#querycompositionhide").toggle();
  });

  $("#queryattachedcheck").click(function() {
    $("#queryattachedhide").toggle();
  });

  $("#queryproteincheck").click(function() {
    $("#queryproteinehide").toggle();
  });

  $("#queryaccessioncheck").click(function() {
    $("#queryaccessionhide").toggle();
  });

  $("#querytaxonomycheck").click(function() {
    $("#querytaxonomyhide").toggle();
  });

  $("#querybiologicalcheck").click(function() {
    $("#querybiologicalhide").toggle();
  });

  $("#querysourcecheck").click(function() {
    $("#querysourcehide").toggle();
  });

  $("input[name='glycosuitedbSearch']").change(function() {
    if ($(this).val() === "Taxonomy") { $("#glycosuitedbTaxonomy").show(); } else { $("#glycosuitedbTaxonomy").hide(); }
    if ($(this).val() === "Localisation") { $("#glycosuitedbLocalisation").show(); } else { $("#glycosuitedbLocalisation").hide(); }
    if ($(this).val() === "ProteinLocalisation") { $("#glycosuitedbAssociation").show(); } else { $("#glycosuitedbAssociation").hide(); }
    if ($(this).val() === "Composition") { $("#glycosuitedbComposition").show(); } else { $("#glycosuitedbComposition").hide(); }
    if ($(this).val() === "Accession") { $("#glycosuitedbAcc").show(); } else { $("#glycosuitedbAcc").hide(); }
  });

  $("input[name='eurocarbdbSearch']").change(function() {
    if ($(this).val() === "Taxonomy") { $("#eurocarbdbTaxonomy").show(); } else { $("#eurocarbdbTaxonomy").hide(); }
    if ($(this).val() === "Localisation") { $("#eurocarbdbLocalisation").show(); } else { $("#eurocarbdbLocalisation").hide(); }
    if ($(this).val() === "ProteinAssociation") { $("#eurocarbdbAssociation").show(); } else { $("#eurocarbdbAssociation").hide(); }
  });

  $("input[name='glycobaseSearch']").change(function() {
    if ($(this).val() === "Taxonomy") { $("#glycobaseTaxonomy").show(); } else { $("#glycobaseTaxonomy").hide(); }
    if ($(this).val() === "Localisation") { $("#glycobaseLocalisation").show(); } else { $("#glycobaseLocalisation").hide(); }
    if ($(this).val() === "ProteinLocalisation") { $("#glycobaseAssociation").show(); } else { $("#glycobaseAssociation").hide(); }
    if ($(this).val() === "Composition") { $("#glycobaseComposition").show(); } else { $("#glycobaseComposition").hide(); }
  });
  
  // TAXONOMY - Show all structures
  $('#show-structures, #more-structures').click(function() {
    $("#more-thumbnails").slideToggle('slow');
    $('span.linktext').toggle();
  });

  // Structure Associated Descriptions
  $("#toggle-taxonomy").click(function() {
    $("#more-taxonomy").toggle();
    $("#more-protein").hide();
    $("#more-source").hide();
  });

  $("#less-taxonomy").click(function() {
    $("#more-taxonomy").toggle();
  });

  $("#toggle-protein").click(function() {
    $("#more-protein").toggle();
    $("#more-taxonomy").hide();
    $("#more-source").hide();
  });

  $("#less-protein").click(function() {
    $("#more-protein").toggle();
  });

  $("#toggle-source").click(function() {
    $("#more-source").toggle();
    $("#more-taxonomy").hide();
    $("#more-protein").hide();
  });

  $("#less-source").click(function() {
    $("#more-source").toggle();
  });

  $("#toggle-exoglycosidases").click(function() {
    $("#more-exoglycosidases").toggle();
  });

  $("#less-exoglycosidases").click(function() {
    $("#more-exoglycosidases").toggle();
   });

  //References
  $("#show-references, #show-more-references").click(function() {
    $("#more-references").toggle();
  });



});
