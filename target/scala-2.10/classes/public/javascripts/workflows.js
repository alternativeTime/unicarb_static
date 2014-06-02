$(document).ready(function(){

  // Structure Associated Descriptions
  $('#next1, #previous2').click(function() {
    $('#workflow1-toggle, #workflow1, #workflow2-toggle, #workflow2').toggleClass('active');
  });

  $('#next2, #previous3').click(function() {
    $('#workflow2-toggle, #workflow2, #workflow3-toggle, #workflow3').toggleClass('active');
  });

  $('#next3, #previous4').click(function() {
    $('#workflow3-toggle, #workflow3, #workflow4-toggle, #workflow4').toggleClass('active');
  });

});
