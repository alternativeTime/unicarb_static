$(document).ready(function(){

  // Data
  var data = [
    {'term': 1, 'gpa': 3.40},
    {'term': 2, 'gpa': 3.32},
    {'term': 3, 'gpa': 3.56},
    {'term': 4, 'gpa': 3.32},
    {'term': 5, 'gpa': 3.57},
    {'term': 6, 'gpa': 3.71},
    {'term': 7, 'gpa': 3.72},
    {'term': 8, 'gpa': 3.92},
    {'term': 9, 'gpa': 3.92},
    {'term': 10, 'gpa': 3.92},
  ];

  // Variables
  var barWidth = 1;
  var width = 500;
  var height = 200;
  var margin = {top: 20, right: 20, bottom: 30, left: 60};
  var padding = [20, 30];

  // Scales
  var x = d3.scale.linear()
    .domain([0, data.length])
    .range([0, width]);

  var y = d3.scale.linear()
    .domain([d3.max(data, function(datum) { return datum.gpa; }), 3])
    .range([0, height]);

  // Axese
  var xAxis = d3.svg.axis()
    .scale(x)
    .orient("bottom")
    .tickSize(-height, 0)
    .tickPadding(6);

  var yAxis = d3.svg.axis()
    .scale(y)
    .orient("left")
    .tickSize(-width)
    .tickPadding(6);
    
  // create canvas
  var chart = d3.select('#peaklist').append('svg')
    .attr('class', 'chart')
    .attr('width', (width + (margin.left + margin.right)))
    .attr('height', height + margin.top + margin.bottom)
    .append("g")
      .attr("transform", "translate(" + margin.left + "," + margin.top + ")")
      .call(d3.behavior.zoom().y(y).x(x).scaleExtent([1, 2]).on("zoom", zoom));

  var zoom = d3.behavior.zoom().on("zoom", draw);

  // Append Axese
  chart.append("g")
    .attr("class", "y axis")
    .attr("transform", "translate(" + 0 + ",width)");

  chart.append("g")
    .attr("class", "x axis")
    .attr("transform", "translate(0," + height + ")");

  // x-axis label
  chart.append("text")
    .attr("class", "x label")
    .attr("text-anchor", "end")
    .attr("x", width / 2)
    .attr("y", height + 30)
    .text("Intensity");

  // y-axis label
  chart.append("text")
    .attr("class", "y label")
    .attr("text-anchor", "end")
    .attr("x", (-height / 2) + 20)
    .attr("y", -50)
    .attr("dy", "12")
    .attr("transform", "rotate(-90)")
    .text("m/z");


  // Clipping path
  // chart.append("clipPath")
  //   .attr("id", "clip")
  //  .append("rect")
  //   .attr("x", 0)
  //   .attr("y", 0)
  //   .attr("width", width)
  //   .attr("height", height);

  // chart.append("path")
  //   .attr("class", "line")
  //   .attr("clip-path", "url(#clip)");

  // Clipping rectangle path
  // chart.append("rect")
  //   .attr("class", "pane")
  //   .attr("width", width)
  //   .attr("height", height)
  //   .call(zoom);

  var clip = chart.append("defs").append("svg:clipPath")
    .attr("id", "clip")
    .append("svg:rect")
    .attr("id", "clip-rect")
    .attr("x", "0")
    .attr("y", "0")
    .attr("width", width)
    .attr("height", height);

  var chartBody = chart.append("g")
    .attr("clip-path", "url(#clip)")
    // .call(zoom);
    // .call(d3.behavior.zoom().scaleExtent([0.2, 5]).on("zoom", redraw));

  var rect = chartBody.append('svg:rect')
    .attr('width', width)
    .attr('height', height)
    .attr('fill', 'none')
    // .call(zoom);

  // Creat data columns
  chartBody.selectAll('rect')
    .data(data).enter().append('g:rect')
    .attr('class', 'column')
    .attr('x', function(datum, index) { return x(index); })
    .attr('y', function(datum) { return y(datum.gpa); })
    .attr('height', function(datum) { return height - y(datum.gpa); })
    .attr('width', barWidth)
    .attr('fill', '#2d578b')
    // .call(zoom);


  // x.domain([0, d3.max(data, function(d) { return d.length; })]);
  // y.domain([d3.max(data, function(d) { return d.gpa; })]), 0;
  // zoom.x(x);
  // zoom.y(y);


  function zoom() {
    chart.select("g.x.axis").call(xAxis);
    chart.select("g.y.axis").call(yAxis);
    chart.selectAll("rect.column")
      .attr("transform", "translate(" + d3.event.translate[0] + ",0)scale(" + d3.event.scale + ", 1)");
  }

  draw();

  function draw() {
    chart.select("g.x.axis").call(xAxis);
    chart.select("g.y.axis").call(yAxis);
  }


});
