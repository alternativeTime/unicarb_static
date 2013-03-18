$(document).ready(function(){

  // // define data
  // var data = [
  //   {'term': '1', 'gpa': 3.40},
  //   {'term': '2', 'gpa': 3.32},
  //   {'term': '3', 'gpa': 3.56},
  //   {'term': '4', 'gpa': 3.32},
  //   {'term': '5', 'gpa': 3.57},
  //   {'term': '6', 'gpa': 3.71},
  //   {'term': '7', 'gpa': 3.72},
  //   {'term': '8', 'gpa': 3.92},
  //   {'term': '9', 'gpa': 3.92},
  //   {'term': '10', 'gpa': 3.92},
  // ];

  // function draw() {

  //   var barWidth = 40;
  //   var chartWidth = (barWidth + 10) * data.length;
  //   var chartHeight = 200;
  //   var margin = 20;
  //   var padding = [20, 30];

  //   // scales
  //   var x = d3.scale.linear()
  //     .domain([0, data.length])
  //     .range([0, chartWidth]);

  //   var y = d3.scale.linear()
  //     .domain([d3.max(data, function(datum) { return datum.gpa; }), 3])
  //     .range([0, chartHeight]);

    
  //   // create canvas
  //   var chart = d3.select('#peaklist').append('svg')
  //     .attr('class', 'chart')
  //     .attr('width', (chartWidth + (margin * 2)))
  //     .attr('height', chartHeight + padding[0])
  //     .call(d3.behavior.zoom().x(x).y(y).scaleExtent([1, 2]).on("zoom", zoom));

  //   var zoom = d3.behavior.zoom().on("zoom", draw);

  //   // Create Lines
  //   var lines = chart.selectAll("line");

  //   var lines_y = lines
  //     .data(x.ticks(10))
  //     .enter().append("line")
  //     .attr("x1", x)
  //     .attr("x2", x)
  //     .attr("y1", function(d) {
  //       return chartHeight;})
  //     .attr("y2", chartHeight);

  //   var lines_x = lines
  //     .data(y.ticks(10))
  //     .enter().append("line")
  //     .attr("x1", 30)
  //     .attr("x2", chartWidth)
  //     .attr("y1", y)
  //     .attr("y2", y);

  //   xAxis = d3.svg.axis().scale(x);
  //   yAxis = d3.svg.axis().scale(y).orient("left");

  //   chart.append("svg:g")
  //     .attr("class", "xaxis")
  //     .attr("transform", "translate(0,200)")
  //     .call(xAxis);

  //   chart.append("svg:g")
  //     .attr("class", "yaxis")
  //     .attr("transform", "translate(30,0)")
  //     .call(yAxis);

  //   chart.append("svg:g")
  //     .attr("class", "xvalues");

  //   // // Horizontal Lines
  //   // chart.selectAll("line")
  //   //   .data(y.ticks(10))
  //   //   .enter().append("line")
  //   //   .attr("y1", y)
  //   //   .attr("y2", y)
  //   //   .attr("x1", 0 + padding[1])
  //   //   .attr("x2", chartWidth)
  //   //   .style("stroke", "#ccc");


  //   // create rectangle for each datum
  //   chart.selectAll('rect')
  //     .data(data).enter().append('svg:rect')
  //     .attr('x', function(datum, index) {
  //     // return x-offset pixels
  //     return x(index) + padding[1];
  //       })
  //     .attr('y', function(datum) {
  //     // return y-offset pixels, subtract due to origin being in top left
  //     return y(datum.gpa);
  //       }).
  //     attr('height', function(datum) {
  //     return chartHeight - y(datum.gpa);
  //       }).
  //     attr('width', barWidth).
  //     attr('fill', '#2d578b');

  //   // Column text
  //   chart.selectAll('.xvalues text')
  //     .data(data).enter().append('svg:text')
  //     .attr('class', 'columnvalue')
  //     .text(function(datum) {
  //         return datum.gpa;
  //     }).
  //     attr('x', function(datum, index) {
  //         return x(index) + padding[1] + barWidth / 2;
  //     }).
  //     attr('y', function(datum) {
  //         return y(datum.gpa);
  //     }).
  //     attr('dy', '1.2em'). // y padding
  //     attr('text-anchor', 'middle');

  //   // X Axis Text
  //   // chart.selectAll('text.xAxis')
  //   //   .data(data).enter().append('svg:text')
  //   //   .attr('class', 'xAxis').
  //   //     text(function(datum) {
  //   //         return datum.term;
  //   //     }).
  //   //     attr('x', function(datum, index) {
  //   //         return x(index) + padding[1] + barWidth / 2;
  //   //     }).
  //   //     attr('y', chartHeight + padding[0]).
  //   //     attr('text-anchor', 'middle').
  //   //     attr("style", "font-size: 12; font-family: Helvetica, sans-serif");

  //   // Y Axis Text
  //   // chart.selectAll(".rule")
  //   //   .data(y.ticks(10))
  //   //   .enter().append("text")
  //   //   .attr("class", "rule")
  //   //   .attr("x", 10)
  //   //   .attr("y", y)
  //   //   .attr("dy", 5)
  //   //   .attr("text-anchor", "middle")
  //   //   .text(String);

  //   // chart label
  //   // chart.append('svg:text').
  //   //     attr('class', 'label').
  //   //     text('Peak List').
  //   //     attr('x', 0).
  //   //     attr('y', 15);


  //   function zoom() {
  //     // chart.select(".xAxis").call(xAxis);
  //     // chart.select(".yAxis").call(yAxis);
  //     chart.selectAll(".yaxis g text, svg rect, svg .columnvalue")
  //       .attr("transform", "translate(" + d3.event.translate[0] + ",0)scale(" + d3.event.scale + ", 1)");
  //   }

  // }

// draw();
//

var data = [
{ mz: 132, value:100 },
{ mz: 143, value:200 },
{ mz: 154, value:300 },
{ mz: 165, value:400 },
{ mz: 176, value:400 },
{ mz: 187, value:500 },
{ mz: 198, value:600 },
{ mz: 209, value:700 },
{ mz: 210, value:800 },
];    

var margin = {top: 20, right: 60, bottom: 30, left: 20},
  width = 460 - margin.left - margin.right,
  height = 200 - margin.top - margin.bottom;

// var parseDate = d3.time.format("%Y-%m-%d").parse,
//     formatDate = d3.time.format("%Y");

var x = d3.scale.linear()
    .range([0, width]);

var y = d3.scale.linear()
    .range([height, 0]);

var xAxis = d3.svg.axis()
    .scale(x)
    .orient("bottom")
    .tickSize(-height, 0)
    .tickPadding(6);

var yAxis = d3.svg.axis()
    .scale(y)
    .orient("right")
    .tickSize(-width)
    .tickPadding(6);

var area = d3.svg.area()
    .interpolate("step-after")
    .x(function(d) { return x(d.mz); })
    .y0(y(0))
    .y1(function(d) { return y(d.value); });

var line = d3.svg.line()
    .interpolate("step-after")
    .x(function(d) { return x(d.mz); })
    .y(function(d) { return y(d.value); });


// create rectangle for each datum
// var columns = d3.svg.columns()
//   .x(function(d) { return x(d.date); })
//   .y(function(d) { return y(d.value); });


var svg = d3.select("#peaklist").append("svg")
    .attr("width", width + margin.left + margin.right)
    .attr("height", height + margin.top + margin.bottom)
    .append("g")
    .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

var zoom = d3.behavior.zoom()
    .on("zoom", draw);

// var gradient = svg.append("defs").append("linearGradient")
//     .attr("id", "gradient")
//     .attr("x2", "0%")
//     .attr("y2", "100%");

// gradient.append("stop")
//     .attr("offset", "0%")
//     .attr("stop-color", "#fff")
//     .attr("stop-opacity", .5);

// gradient.append("stop")
//     .attr("offset", "100%")
//     .attr("stop-color", "#999")
//     .attr("stop-opacity", 1);

svg.append("clipPath")
    .attr("id", "clip")
  .append("rect")
    .attr("x", x(0))
    .attr("y", y(1))
    .attr("width", x(1) - x(0))
    .attr("height", y(0) - y(1));

svg.append("g")
    .attr("class", "y axis")
    .attr("transform", "translate(" + width + ",0)");

svg.append("path")
    .attr("class", "area")
    .attr("clip-path", "url(#clip)")
    .style("fill", "url(#gradient)");

svg.append("g")
    .attr("class", "x axis")
    .attr("transform", "translate(0," + height + ")");

svg.append("path")
    .attr("class", "line")
    .attr("clip-path", "url(#clip)");

svg.append("rect")
    .attr("class", "pane")
    .attr("width", width)
    .attr("height", height)
    .call(zoom);

    // create rectangle for each datum
    svg.selectAll('rect')
      .data(data).enter().append('rect:rect')
      .attr('x', function(d) { return d.mz; })
      // .x(function(d) { return x(d.mz); })
      .attr('y', function(d) { return d.value; })
      .attr('height', function(d) { return d.value; })
      .attr('width', 20)
      .attr('fill', '#2d578b')

  //
//d3.csv("readme-flights.csv", function(error, data) {
  // data.forEach(function(d) {
  //   d.mz = parseDate(d.mz);
  //   d.value = +d.value;
  // });

  // x.domain([new Date(1988, 0, 1), new Date(2003, 0, 0)]); //change this to a variable portion of dataset, and to current date
  x.domain([0, d3.max(data, function(d) { return d.mz; })]);
  y.domain([0, d3.max(data, function(d) { return d.value; })]);
  zoom.x(x);
  //zoom.y(y);

  svg.select("path.area").data([data]);
  svg.select("path.line").data([data]);
  svg.select("path.columns").data([data]);
  draw();
//});

function draw(e) {
  svg.select("g.x.axis").call(xAxis);
    
  var yExtent = d3.extent(data.filter(function(d) { 
        var dt = x(d.mz);
        return dt > 0 && dt < width;
  }), function(d) { return d.value; });
  y.domain(yExtent).nice();

  svg.select("g.y.axis").call(yAxis);
  svg.select("path.area").attr("d", area);
  svg.select("path.line").attr("d", line);
}


});
