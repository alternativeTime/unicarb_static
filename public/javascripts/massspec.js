$(document).ready(function(){


  /* implementation heavily influenced by http://bl.ocks.org/1166403 */

  // define dimensions of graph
  // var m = [40, 40, 40, 80]; // margins
  // var w = 600 - m[1] - m[3]; // width
  // var h = 300 - m[0] - m[2]; // height

  // // create a simple data array that we'll plot with a line (this array represents only the Y values, X will just be the index location)
  // var data = [3, 6, 2, 7, 5, 2, 0, 3, 8, 9, 2, 5, 9, 3, 6, 3, 6, 2, 7, 5, 2, 1, 3, 8, 9, 2, 5, 9, 2, 7];
  //  
  // // X scale will fit all values from data[] within pixels 0-w
  // var x = d3.scale.linear().domain([0, data.length]).range([0, w]);
  // // Y scale will fit values from 0-10 within pixels h-0 (Note the inverted domain for the y-scale: bigger is up!)
  // var y = d3.scale.linear().domain([0, 10]).range([h, 0]);
  // // automatically determining max range can work something like this
  // // var y = d3.scale.linear().domain([0, d3.max(data)]).range([h, 0]);
//  
  // // create a line function that can convert data[] into x and y points
  // var line = d3.svg.line()
  // // assign the X function to plot our line as we wish

  // .x(function(d,i) { 
  //   // verbose logging to show what's actually being done
  //   console.log('Plotting X value for data point: ' + d + ' using index: ' + i + ' to be at: ' + x(i) + ' using our xScale.');
  //   // return the X coordinate where we want to plot this datapoint
  //   return x(i); 
  // })

  // .y(function(d) { 
  //   // verbose logging to show what's actually being done
  //   console.log('Plotting Y value for data point: ' + d + ' to be at: ' + y(d) + " using our yScale.");
  //   // return the Y coordinate where we want to plot this datapoint
  //   return y(d); 
  // })
  //    
  // // Add an SVG element with the desired dimensions and margin.
  // var graph = d3.select("#peaklist").append("svg:svg")
  //   .attr("width", w + m[1] + m[3])
  //   .attr("height", h + m[0] + m[2])
  //   .append("svg:g")
  //   .attr("transform", "translate(" + m[3] + "," + m[0] + ")");
  //  
  // // create yAxis
  // var xAxis = d3.svg.axis().scale(x).tickSize(-h).tickSubdivide(true);
  // // Add the x-axis.
  // graph.append("svg:g")
  //   .attr("class", "x axis")
  //   .attr("transform", "translate(0," + h + ")")
  //   .call(xAxis);
  //  
  //  
  // // create left yAxis
  // var yAxisLeft = d3.svg.axis().scale(y).ticks(4).orient("left");
  // // Add the y-axis to the left
  // graph.append("svg:g")
  //   .attr("class", "y axis")
  //   .attr("transform", "translate(-25,0)")
    // .call(yAxisLeft);

  // // Add the line by appending an svg:path element with the data line we created above
  // // do this AFTER the axes above so that the line is above the tick-lines
  // graph.append("svg:path").attr("d", line(data));








//     // Make some data
//     // var data = [];
//     var data = [3, 6, 2, 7, 5, 2, 0, 3, 8, 9, 2, 5, 9, 3, 6, 3, 6, 2, 7, 5, 2, 1, 3, 8, 9, 2, 5, 9, 2, 7];
//    
//     var n = 13;
//     // for (var i = 0; i < n; i++) {
//     //   data.push({date: new Date(2011, 12+i, 1), value: i==12?0: Math.random() * 100});
//     // }
//     // make 365 days interval and force last value to 0

//     // Make chart
//     var margin = {top: 20.0, right: 20.0, bottom: 30.0, left: 20.0},
//       width = 600 - margin.left - margin.right,
//       height = 500 - margin.top - margin.bottom;

//     var xScale = d3.scale.linear()
//       .domain([0, data.length])
//       .range([margin.left, width]);

//     var yScale = d3.scale.linear()
//       .domain([0, 10])
//       .range([height, 0]);

//     var xAxis = d3.svg.axis()
//       .scale(xScale)
//       .tickSize(-height).tickSubdivide(true);
//       .orient("bottom");

//     var svg = d3.select("#peaklist").append("svg")
//             .attr("width", width + margin.left + margin.right)
//             .attr("height", height + margin.top + margin.bottom)
//             .append("g")
//             .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

//     svg.append("g")
            // .attr("class", "x axis")
            // .attr("transform", "translate(0," + height + ")")
            // .call(xAxis);

    // var pixPerMonth = width /12.0;
    // var gapPix =parseInt(0.1* (pixPerMonth ));// 10% gap
    // var barWidth = parseInt( (pixPerMonth )-gapPix);
    // svg.selectAll(".bar")
            // .data(data)
            // .enter().append("rect")
            // .attr("class", "bar")
            // .attr("x", function(datum,i) { return (margin.left+parseInt(gapPix/2)+ (( gapPix+barWidth- 1)*i)) ; })
            // .attr("width", barWidth )
            // .attr("y", function(datum) { return yScale(datum.value); })
            // .attr("height", function(datum) { return height - yScale(datum.value); });
     // svg.selectAll("text").attr("transform", "translate(" + (barWidth / 2).toString() +","+10+ ")");



  // define data
  var data = [
    {'term': '1', 'gpa': 3.40},
    {'term': '2', 'gpa': 3.32},
    {'term': '3', 'gpa': 3.56},
    {'term': '4', 'gpa': 3.32},
    {'term': '5', 'gpa': 3.57},
    {'term': '6', 'gpa': 3.71},
    {'term': '7', 'gpa': 3.72},
    {'term': '8', 'gpa': 3.92},
    {'term': '9', 'gpa': 3.92},
    {'term': '10', 'gpa': 3.92},
  ];

  var barWidth = 40;
  var chartWidth = (barWidth + 10) * data.length;
  var chartHeight = 200;
  var margin = 20;
  var padding = 20;

  // scales
  var xScale = d3.scale.linear().
      domain([0, data.length]).
      range([0, chartWidth]);

  var yScale = d3.scale.linear().
      domain([3, d3.max(data, function(datum) { return datum.gpa; })]).
      range([0, chartHeight]);

  
  // create canvas
  var chart = d3.select('#peaklist').
      append('svg:svg').
      attr('width', (chartWidth + (margin * 2))).
      attr('height', chartHeight + padding);


  chart.selectAll("line")
    .data(yScale.ticks(10))
    .enter().append("line")
    .attr("y1", yScale)
    .attr("y2", yScale)
    .attr("x1", 0)
    .attr("x2", chartWidth)
    .style("stroke", "#ccc");


// create rectangle for each datum
    chart.selectAll('rect').
      data(data).
      enter().
      append('svg:rect').
      attr('x', function(datum, index) {
          // return x-offset pixels
          return xScale(index);
      }).
      attr('y', function(datum) {
          // return y-offset pixels, subtract due to origin being in top left
          return chartHeight - yScale(datum.gpa);
      }).
      attr('height', function(datum) {
          return yScale(datum.gpa);
      }).
      attr('width', barWidth).
      attr('fill', '#2d578b');

  // text
  chart.selectAll('text').
      data(data).
      enter().
      append('svg:text').
      text(function(datum) {
          return datum.gpa;
      }).
      attr('x', function(datum, index) {
          return xScale(index) + barWidth / 2;
      }).
      attr('y', function(datum) {
          return chartHeight - yScale(datum.gpa);
      }).
      attr('dy', '1.2em'). // y padding
      attr('text-anchor', 'middle').
      attr('fill', 'white').
      attr("style", "font-size: 12; font-family: Helvetica, sans-serif");

  // X axis text
  chart.selectAll('text.xAxis').
      data(data).
      enter().
      append('svg:text').
      attr('class', 'xAxis').
      text(function(datum) {
          return datum.term;
      }).
      attr('x', function(datum, index) {
          return xScale(index) + barWidth / 2;
      }).
      attr('y', chartHeight + padding).
      attr('text-anchor', 'middle').
      attr("style", "font-size: 12; font-family: Helvetica, sans-serif");

  chart.selectAll(".rule")
    .data(yScale.ticks(10))
    .enter().append("text")
    .attr("class", "rule")
    .attr("x", 10)
    .attr("y", yScale)
    .attr("dy", -3)
    .attr("text-anchor", "middle")
    .text(String);

  // chart label
  chart.append('svg:text').
      attr('class', 'label').
      text('Peak List').
      attr('x', 0).
      attr('y', 15);


});
