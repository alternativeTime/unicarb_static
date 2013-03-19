$(document).ready(function(){

  // define data
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


    var barWidth = 2;
    var chartWidth = 500;
    var chartHeight = 200;
    var margin = {top: 20, right: 20, bottom: 30, left: 40};
    var padding = [20, 30];

//   width = 600 - margin.left - margin.right,
//   height = 300 - margin.top - margin.bottom;

     // scales
     var x = d3.scale.linear()
       .domain([0, data.length])
       .range([0, chartWidth]);

     var y = d3.scale.linear()
       .domain([d3.max(data, function(datum) { return datum.gpa; }), 3])
       .range([0, chartHeight]);

     // Axese
     var xAxis = d3.svg.axis()
      .scale(x)
      .orient("bottom")
      .tickSize(-chartHeight, 0)
      .tickPadding(6);

    var yAxis = d3.svg.axis()
      .scale(y)
      .orient("left")
      .tickSize(-chartWidth)
      .tickPadding(6);
    
     // create canvas
     var chart = d3.select('#peaklist').append('svg')
       .attr('class', 'chart')
       .attr('width', (chartWidth + (margin.left + margin.right)))
       .attr('height', chartHeight + margin.top + margin.bottom)
        .append("g")
          .attr("transform", "translate(" + margin.left + "," + margin.top + ")")
       .call(d3.behavior.zoom().y(y).scaleExtent([1, 2]).on("zoom", zoom));

     var zoom = d3.behavior.zoom().on("zoom", draw);

             //             }

     // Create Lines
     // var lines = chart.selectAll("line");

     // var lines_y = lines
     //   .data(x.ticks(10))
     //   .enter().append("line")
     //   .attr("x1", x)
     //   .attr("x2", x)
     //   .attr("y1", function(d) {
     //     return chartHeight;})
     //   .attr("y2", chartHeight);

     // var lines_x = lines
     //   .data(y.ticks(10))
     //   .enter().append("line")
     //   .attr("x1", 30)
     //   .attr("x2", chartWidth)
     //   .attr("y1", y)
     //   .attr("y2", y);

     // xAxis = d3.svg.axis().scale(x);
     // yAxis = d3.svg.axis().scale(y).orient("left");

     // chart.append("svg:g")
     //   .attr("class", "xaxis")
     //   .attr("transform", "translate(0,200)")
     //   .call(xAxis);

     // chart.append("svg:g")
     //   .attr("class", "yaxis")
     //   .attr("transform", "translate(30,0)")
     //   .call(yAxis);

    // Axese
    chart.append("g")
      .attr("class", "y axis")
      .attr("transform", "translate(" + 0 + ",chartWidth)");

    chart.append("g")
      .attr("class", "x axis")
      .attr("transform", "translate(0," + chartHeight + ")");

    // Clipping path
     chart.append("clipPath")
      .attr("id", "clip")
      .append("rect")
      .attr("x", 0)
      .attr("y", 0)
      .attr("width", chartWidth)
      .attr("height", chartHeight);

     chart.append("path")
      .attr("class", "line")
      .attr("clip-path", "url(#clip)");


    chart.append("rect")
      .attr("class", "pane")
      .attr("width", chartWidth)
      .attr("height", chartHeight)
      // .call(zoom);


     // create rectangle for each datum
      chart.selectAll('rect')
        .data(data).enter().append('path:rect')
        .attr('class', 'column')
        .attr('x', function(datum, index) { return x(index) + padding[1]; })
        .attr('y', function(datum) { return y(datum.gpa); })
        .attr('height', function(datum) { return chartHeight - y(datum.gpa); })
        .attr('width', barWidth)
        .attr('fill', '#2d578b');

     // // Column text
     // chart.selectAll('.xvalues text')
     //   .data(data).enter().append('svg:text')
     //  .attr('class', 'columnvalue')
     //   .text(function(datum) {
     //       return datum.gpa;
     //   }).
     //   attr('x', function(datum, index) {
     //       return x(index) + padding[1] + barWidth / 2;
     //   }).
     //   attr('y', function(datum) {
     //       return y(datum.gpa);
     //   }).
     //   attr('dy', '1.2em'). // y padding
     //  attr('text-anchor', 'middle');


      // x.domain([0, d3.max(data, function(d) { return data.length; })]);
      // y.domain([0, d3.max(data, function(d) { return data.gpa; })]);
      zoom.x(x);
      // zoom.y(y);



    //   // chart label
    //   // chart.append('svg:text').
    //   //     attr('class', 'label').
    //   //     text('Peak List').
    //   //     attr('x', 0).
    //   //     attr('y', 15);


      function zoom() {
      chart.select("g.x.axis").call(xAxis);
      chart.select("g.y.axis").call(yAxis);
       chart.selectAll("svg rect")
         .attr("transform", "translate(" + d3.event.translate[0] + ",0)scale(" + d3.event.scale + ", 1)");
     }


    draw();

    function draw() {
      chart.select("g.x.axis").call(xAxis);
      chart.select("g.y.axis").call(yAxis);
    }


// var data = [
// { mz: 132, value:100 },
// { mz: 143, value:200 },
// { mz: 154, value:300 },
// { mz: 165, value:400 },
// { mz: 176, value:400 },
// { mz: 187, value:500 },
// { mz: 198, value:600 },
// { mz: 209, value:700 },
// { mz: 210, value:800 },
// ];    

// var margin = {top: 20, right: 20, bottom: 30, left: 40},
//   width = 600 - margin.left - margin.right,
//   height = 300 - margin.top - margin.bottom;


// var x = d3.scale.linear()
//     .range([0, width]);

// var y = d3.scale.linear()
//     .range([height, 0]);

// var xAxis = d3.svg.axis()
//     .scale(x)
//     .orient("bottom")
//     .tickSize(-height, 0)
//     .tickPadding(6);

// var yAxis = d3.svg.axis()
//     .scale(y)
//     .orient("left")
//     .tickSize(-width)
//     .tickPadding(6);

// // var area = d3.svg.area()
// //     .interpolate("step-after")
// //     .x(function(d) { return x(d.mz); }).y0(y(0))
// //     .y1(function(d) { return y(d.value); });

// var line = d3.svg.line()
//     .interpolate("linear")
//     .x(function(d) { return x(d.mz); })
//     .y(function(d) { return y(d.value); });


// // create rectangle for each datum
// // var columns = d3.svg.columns()
// //   .x(function(d) { return x(d.date); })
// //   .y(function(d) { return y(d.value); });


// var svg = d3.select("#peaklist").append("svg")
//     .attr("width", width + margin.left + margin.right)
//     .attr("height", height + margin.top + margin.bottom)
//     .append("g")
//     .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

// var zoom = d3.behavior.zoom()
//     .on("zoom", draw);

// // var gradient = svg.append("defs").append("linearGradient")
// //     .attr("id", "gradient")
// //     .attr("x2", "0%")
// //     .attr("y2", "100%");

// // gradient.append("stop")
// //     .attr("offset", "0%")
// //     .attr("stop-color", "#fff")
// //     .attr("stop-opacity", .5);

// // gradient.append("stop")
// //     .attr("offset", "100%")
// //     .attr("stop-color", "#999")
// //     .attr("stop-opacity", 1);

// svg.append("clipPath")
//     .attr("id", "clip")
//   .append("rect")
//     .attr("x", x(0))
//     .attr("y", y(1))
//     .attr("width", x(1) - x(0))
//     .attr("height", y(0) - y(1));

// svg.append("g")
//     .attr("class", "y axis")
//     .attr("transform", "translate(" + 0 + ", width)");

// // svg.append("path")
// //     .attr("class", "area")
// //     .attr("clip-path", "url(#clip)")
// //     .style("fill", "url(#gradient)");

// svg.append("g")
//     .attr("class", "x axis")
//     .attr("transform", "translate(0," + height + ")");

// svg.append("path")
//     .attr("class", "line")
//     .attr("clip-path", "url(#clip)");

// svg.append("path")
//     .attr("class", "line")
//     .attr("clip-path", "url(#clip)");

// svg.append("rect")
//     .attr("class", "pane")
//     .attr("width", width)
//     .attr("height", height)
//     .call(zoom);

//     // create rectangle for each datum
//     // svg.selectAll('rect')
//     //   .data(data).enter().append('g:rect')
//     //   .attr('class', 'columns')
//     //   .attr('x', function(d) { return d.mz; })
//     //   .attr('y', function(d) { return d.value; })
//     //   .attr('height', function(d) { return d.value; })
//     //   .attr('width', 20)
//     //   .attr('fill', '#2d578b')

//   // var rect = svg.selectAll("rect")
//   //   .data(data)
//   //   .enter().append("rect")
//   //   .attr("x", function (d,i) {return d.mz; })
//   //   .attr("y", function (d,i) { return height - d.value;})
//   //   .attr("width", 20)
//   //   .attr("height", function (d,i) {return d.value;})
//   //   .attr('fill', '#2d578b');
 
//   // rect.call(d3.behavior.zoom().x(x).scaleExtent([1, 8]).on("zoom", zoom));

//   //
// //d3.csv("readme-flights.csv", function(error, data) {
//   // data.forEach(function(d) {
//   //   d.mz = parseDate(d.mz);
//   //   d.value = +d.value;
//   // });

//   // x.domain([new Date(1988, 0, 1), new Date(2003, 0, 0)]); //change this to a variable portion of dataset, and to current date
//   x.domain([0, d3.max(data, function(d) { return d.mz; })]);
//   y.domain([0, d3.max(data, function(d) { return d.value; })]);
//   zoom.x(x);
//   zoom.y(y);

//   // svg.select("path.area").data([data]);
//   svg.select("path.line").data([data]);
//   draw();
// //});
// //

// function draw(e) {
//   svg.select("g.x.axis").call(xAxis);
    
//   var yExtent = d3.extent(data.filter(function(d) { 
//     var dt = x(d.mz);
//     return dt > 0 && dt < width;
//   }), function(d) { return d.value; });
//   y.domain(yExtent).nice();

//   svg.select("g.y.axis").call(yAxis);
//   svg.select("g.y.axis").call(yAxis);
//   // svg.select("path.area").attr("d", area);
//   svg.select("path.line").attr("d", line);
//   // svg.select("rect.columns").attr("d", column);
// }


});
