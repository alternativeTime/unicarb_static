$(document).ready(function(){

  // Data
  var data = [
    {'term': 1, 'gpa': 1.40},
    {'term': 2, 'gpa': 2.32},
    {'term': 3, 'gpa': 3.56},
    {'term': 4, 'gpa': 4.32},
    {'term': 5, 'gpa': 5.57},
    {'term': 6, 'gpa': 6.71},
    {'term': 7, 'gpa': 7.72},
    {'term': 8, 'gpa': 8.92},
    {'term': 9, 'gpa': 9.92},
    {'term': 10, 'gpa': 3.92},
    {'term': 11, 'gpa': 3.40},
    {'term': 12, 'gpa': 3.32},
    {'term': 13, 'gpa': 3.56},
    {'term': 14, 'gpa': 3.32},
    {'term': 15, 'gpa': 3.57},
    {'term': 16, 'gpa': 7.71},
    {'term': 17, 'gpa': 3.72},
    {'term': 18, 'gpa': 3.92},
    {'term': 19, 'gpa': 4.92},
    {'term': 20, 'gpa': 3.92},
    {'term': 21, 'gpa': 3.40},
    {'term': 22, 'gpa': 2.32},
    {'term': 23, 'gpa': 3.56},
    {'term': 24, 'gpa': 7.32},
    {'term': 25, 'gpa': 3.57},
    {'term': 26, 'gpa': 3.71},
    {'term': 27, 'gpa': 1.72},
    {'term': 28, 'gpa': 3.92},
    {'term': 29, 'gpa': 6.92},
    {'term': 30, 'gpa': 3.92},
    {'term': 31, 'gpa': 3.40},
    {'term': 32, 'gpa': 3.32},
    {'term': 33, 'gpa': 9.56},
    {'term': 34, 'gpa': 3.32},
    {'term': 35, 'gpa': 3.57},
    {'term': 36, 'gpa': 8.71},
    {'term': 37, 'gpa': 3.72},
    {'term': 38, 'gpa': 3.92},
    {'term': 39, 'gpa': 3.92},
    {'term': 40, 'gpa': 3.92},
    {'term': 41, 'gpa': 3.40},
    {'term': 42, 'gpa': 3.32},
    {'term': 43, 'gpa': 3.56},
    {'term': 44, 'gpa': 3.32},
    {'term': 45, 'gpa': 3.57},
    {'term': 46, 'gpa': 3.71},
    {'term': 47, 'gpa': 3.72},
    {'term': 48, 'gpa': 3.92},
    {'term': 49, 'gpa': 3.92},
    {'term': 50, 'gpa': 3.92},
    {'term': 51, 'gpa': 3.40},
    {'term': 52, 'gpa': 3.32},
    {'term': 53, 'gpa': 3.56},
    {'term': 54, 'gpa': 3.32},
    {'term': 55, 'gpa': 3.57},
    {'term': 56, 'gpa': 3.71},
    {'term': 57, 'gpa': 3.72},
    {'term': 58, 'gpa': 3.92},
    {'term': 59, 'gpa': 3.92},
    {'term': 60, 'gpa': 3.92},
    {'term': 61, 'gpa': 3.40},
    {'term': 62, 'gpa': 3.32},
    {'term': 63, 'gpa': 9.56},
    {'term': 64, 'gpa': 3.32},
    {'term': 65, 'gpa': 3.57},
    {'term': 66, 'gpa': 3.71},
    {'term': 67, 'gpa': 3.72},
    {'term': 68, 'gpa': 3.92},
    {'term': 69, 'gpa': 3.92},
    {'term': 70, 'gpa': 3.92},
    {'term': 71, 'gpa': 3.40},
    {'term': 72, 'gpa': 3.32},
    {'term': 73, 'gpa': 9.56},
    {'term': 74, 'gpa': 3.32},
    {'term': 75, 'gpa': 3.57},
    {'term': 76, 'gpa': 3.71},
    {'term': 77, 'gpa': 3.72},
    {'term': 78, 'gpa': 3.92},
    {'term': 79, 'gpa': 3.92},
    {'term': 80, 'gpa': 3.92},
    {'term': 81, 'gpa': 3.40},
    {'term': 82, 'gpa': 7.32},
    {'term': 83, 'gpa': 3.56},
    {'term': 84, 'gpa': 3.32},
    {'term': 85, 'gpa': 3.57},
    {'term': 86, 'gpa': 3.71},
    {'term': 87, 'gpa': 5.72},
    {'term': 88, 'gpa': 3.92},
    {'term': 89, 'gpa': 3.92},
    {'term': 90, 'gpa': 3.92},
    {'term': 91, 'gpa': 3.40},
    {'term': 92, 'gpa': 3.32},
    {'term': 93, 'gpa': 7.56},
    {'term': 94, 'gpa': 3.32},
    {'term': 95, 'gpa': 3.57},
    {'term': 96, 'gpa': 3.71},
    {'term': 97, 'gpa': 3.72},
    {'term': 98, 'gpa': 3.92},
    {'term': 99, 'gpa': 3.92},
    {'term': 100, 'gpa': 3.92},
    {'term': 101, 'gpa': 3.40},
    {'term': 102, 'gpa': 3.32},
    {'term': 103, 'gpa': 3.56},
    {'term': 104, 'gpa': 3.32},
    {'term': 105, 'gpa': 3.57},
    {'term': 106, 'gpa': 3.71},
    {'term': 107, 'gpa': 3.72},
    {'term': 108, 'gpa': 3.92},
    {'term': 109, 'gpa': 3.92},
    {'term': 110, 'gpa': 3.92},
    {'term': 111, 'gpa': 3.40},
    {'term': 112, 'gpa': 3.32},
    {'term': 113, 'gpa': 7.56},
    {'term': 114, 'gpa': 3.32},
    {'term': 115, 'gpa': 3.57},
    {'term': 116, 'gpa': 3.71},
    {'term': 117, 'gpa': 3.72},
    {'term': 118, 'gpa': 9.92},
    {'term': 119, 'gpa': 3.92},
    {'term': 120, 'gpa': 3.92},
    {'term': 121, 'gpa': 2.40},
    {'term': 122, 'gpa': 4.32},
    {'term': 123, 'gpa': 3.56},
    {'term': 124, 'gpa': 3.32},
    {'term': 125, 'gpa': 4.57},
    {'term': 126, 'gpa': 3.71},
    {'term': 127, 'gpa': 3.72},
    {'term': 128, 'gpa': 3.92},
    {'term': 129, 'gpa': 3.92},
    {'term': 130, 'gpa': 3.92},
    {'term': 131, 'gpa': 8.40},
    {'term': 132, 'gpa': 3.32},
    {'term': 133, 'gpa': 3.56},
    {'term': 134, 'gpa': 3.32},
    {'term': 135, 'gpa': 3.57},
    {'term': 136, 'gpa': 3.71},
    {'term': 137, 'gpa': 6.72},
    {'term': 138, 'gpa': 3.92},
    {'term': 139, 'gpa': 4.92},
    {'term': 140, 'gpa': 3.92},
    {'term': 141, 'gpa': 3.40},
    {'term': 142, 'gpa': 3.32},
    {'term': 143, 'gpa': 3.56},
    {'term': 144, 'gpa': 7.32},
    {'term': 145, 'gpa': 3.57},
    {'term': 146, 'gpa': 3.71},
    {'term': 147, 'gpa': 3.72},
    {'term': 148, 'gpa': 3.92},
    {'term': 149, 'gpa': 3.92},
    {'term': 150, 'gpa': 3.92},
    {'term': 151, 'gpa': 3.40},
    {'term': 152, 'gpa': 8.32},
    {'term': 153, 'gpa': 3.56},
    {'term': 154, 'gpa': 3.32},
    {'term': 155, 'gpa': 3.57},
    {'term': 156, 'gpa': 7.71},
    {'term': 157, 'gpa': 3.72},
    {'term': 158, 'gpa': 3.92},
    {'term': 159, 'gpa': 3.92},
    {'term': 160, 'gpa': 3.92},
    {'term': 161, 'gpa': 3.40},
    {'term': 162, 'gpa': 7.32},
    {'term': 163, 'gpa': 3.56},
    {'term': 164, 'gpa': 3.32},
    {'term': 165, 'gpa': 3.57},
    {'term': 166, 'gpa': 3.71},
    {'term': 167, 'gpa': 3.72},
    {'term': 168, 'gpa': 4.92},
    {'term': 169, 'gpa': 3.92},
    {'term': 170, 'gpa': 3.92},
    {'term': 171, 'gpa': 6.40},
    {'term': 172, 'gpa': 3.32},
    {'term': 173, 'gpa': 3.56},
    {'term': 174, 'gpa': 3.32},
    {'term': 175, 'gpa': 3.57},
    {'term': 176, 'gpa': 3.71},
    {'term': 177, 'gpa': 3.72},
    {'term': 178, 'gpa': 3.92},
    {'term': 179, 'gpa': 3.92},
    {'term': 180, 'gpa': 2.92},
    {'term': 181, 'gpa': 3.40},
    {'term': 182, 'gpa': 3.32},
    {'term': 183, 'gpa': 3.56},
    {'term': 184, 'gpa': 3.32},
    {'term': 185, 'gpa': 4.57},
    {'term': 186, 'gpa': 3.71},
    {'term': 187, 'gpa': 3.72},
    {'term': 188, 'gpa': 3.92},
    {'term': 189, 'gpa': 3.92},
    {'term': 190, 'gpa': 3.92},
    {'term': 191, 'gpa': 3.40},
    {'term': 192, 'gpa': 3.32},
    {'term': 193, 'gpa': 3.56},
    {'term': 194, 'gpa': 0.32},
    {'term': 195, 'gpa': 3.57},
    {'term': 196, 'gpa': 3.71},
    {'term': 197, 'gpa': 3.72},
    {'term': 198, 'gpa': 3.92},
    {'term': 199, 'gpa': 3.92},
    {'term': 200, 'gpa': 3.92},
  ];

  // Variables
  var barWidth = 1;
  var width = 500;
  var height = 200;
  var margin = {top: 20, right: 20, bottom: 30, left: 60};
  var padding = [20, 30];


  var update = function() {
    // Axis
    xAxis.scale(x);
    yAxis.scale(y);
    chart.select("g.x.axis").call(xAxis);
    chart.select("g.y.axis").call(yAxis);
    
    chartBody.selectAll('rect').remove();
    // Creat data columns
    chartBody.selectAll('rect')
      .data(data).enter().append('g:rect')
      .attr('class', 'column')
      .attr('x', function(datum, index) { return x(index); })
      .attr('y', function(datum) { return y(datum.gpa); })
      .attr('height', function(datum) { return height - y(datum.gpa); })
      .attr('width', barWidth)
      .attr('fill', '#2d578b');
      // columns.exit().remove();
  };


  // D3 chart construction.
  var vis = d3.select('#peaklist')
    .attr('class', 'chart')
    .attr('width', (width + (margin.left + margin.right)))
    .attr('height', height + margin.top + margin.bottom);

  var chart = vis.append("g")
    .attr("transform","translate(60,20)")
    .attr("width",width)
    .attr("height",height)
    .attr("viewBox","0 0 " + (height) + " " + (width));



  // Scales
  var x = d3.scale.linear().range([0, width]);
  var y = d3.scale.linear().range([0, height]);


  var zoom = null;
  var applyZoom = function(){
    // Re-apply the zoom behavior.
    zoom = d3.behavior.zoom().x(x).y(y).on("zoom",function(){ update() });
    chart.call(zoom);
  };


  var setInitialScale = function() {
    applyZoom();
    x.domain([0, data.length]);
    y.domain([d3.max(data, function(datum) { return datum.gpa; }), 3]);
  }

  var setMaxScale = function() {
    applyZoom();
    x.domain([d3.min(data,term),d3.max(data,term)]);
    y.domain([d3.min(data,gpa), d3.max(data,gpa)]);
  }

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

  // Append Axese containers
  chart.append("g")
    .attr("class", "y axis")
    .attr("transform", "translate(" + 0 + ",width)");

  chart.append("g")
    .attr("class", "x axis")
    .attr("transform", "translate(0," + height + ")");


  var plot = chart.append("svg")
    .attr("class","plot")
    .attr("pointer-events","all")
    .attr("width", width)
    .attr("height", height)

  var plotBg = plot.append("rect").attr("class","plotbg")
    .attr("width","100%")
    .attr("height","100%");



  var clip = chart.append("defs").append("svg:clipPath")
    .attr("id", "clip")
    .append("svg:rect")
    .attr("id", "clip-rect")
    .attr("x", "0")
    .attr("y", "0")
    .attr("width", width)
    .attr("height", height);

  var chartBody = chart.append("g")
    .attr("clip-path", "url(#clip)");

  var rect = chartBody.append('svg:rect')
    .attr('width', width)
    .attr('height', height)
    .attr('fill', 'none');


  setInitialScale();
  applyZoom();
  update();

  $('#graph-reset').click( function() {
    setInitialScale();
    update();
  });


});
