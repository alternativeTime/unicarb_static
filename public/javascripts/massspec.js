$(document).ready(function(){

  var barWidth = 40;
  var width = (barWidth + 10) * data.length;
  var height = 200;

  var x = d3.scale.linear().domain([0, data.length]).range([0, width]);
  var y = d3.scale.linear().domain([0, d3.max(data, function(datum) { return datum.books; })]).
      rangeRound([0, height]);

  // add the canvas to the DOM
  var barDemo = d3.select("#peaklist").
    append("svg:svg").
    attr("width", width).
    attr("height", height);

  barDemo.selectAll("rect").
    data(data).
    enter().
    append("svg:rect").
    attr("x", function(datum, index) { return x(index); }).
    attr("y", function(datum) { return height - y(datum.books); }).
    attr("height", function(datum) { return y(datum.books); }).
    attr("width", barWidth).
    attr("fill", "#2d578b");

});
