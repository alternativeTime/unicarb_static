var virgin = {};
virgin.portfolio = {		//Holds the Portfolio Object
	'selectedItem': {},		//The Selected Portfolio Item
	'items':[]		// All items in portfolio object... the portfolio-items.json is loaded in this variable
}; 
virgin.mdConvert = new Showdown.converter(); //Showdown converter
virgin.fn = {}; //Stores Functions
virgin.audio = document.createElement('audio');		//HTML5 Audio Player
virgin.audio.preload=true;
virgin.audio.autoplay=true;



$(document).ready(function(){

		$(window).on("load",function(){
			fixLayout();		//This function fixes the layout... and is also reponsible for responsiveness of this theme.
			loadPage('members');	//Change default loading page here
		});
		$(window).on("resize",function(){
			fixLayout();
		});
	
		//This is what happens when you click a button on sidebar
		$(".sideBar>ul>li>figure:first-child").on("click",function(){
			var link = $(this).parent().attr('data-link');
			if(link != 'none'){
				loadPage(link.toString().toLowerCase());
			}
			if(!$(this).parent().find('.subSide').length){
				$('.subSide').slideUp();
			}			
		});
		


		//BIND DROPPER SIDEBAR ACTIONS
		$('.sideBar > ul > li.dropper >figure:first-child').on("click",function(){
			$(this).parent().find('.subSide').slideToggle(300);
			var ac = $('.sideBar > ul >li.active')[0];
			
			var par = $(this).parent()[0];
			$(ac).removeClass('active');
			$(par).addClass('active');
		});

		//Dropper Subside Action Bind
		$('.sideBar > ul > li.dropper > .subSide > li').on("click",function(){
			var link = $(this).attr('data-target');
			console.log(link);
			loadPage(link);
		});

		//Centering Elements with Class 'centerOnPage'
		$("button[data-toggle='droppy']").on("click",function(e){
			var bttn=0,ul=0,lcheck=1;
			bttn = $(this)[0];
			bsOps = $('.sOpsB')[0];
			ul = $(this).parent().find('ul.dropdown-menu')[0];
			if((getDocWidth()-bttn.offsetLeft)<parseInt($(ul).css('width').replace('px','')) ){lcheck=0;}
			$(ul).css({
				'font-family': 'OpenSansRegular',
				'font-size':'13px'
			});
			if(lcheck){$(ul).css('left',bttn.offsetLeft);}
			else{$(ul).css('left', (bttn.offsetLeft+bttn.offsetWidth)-2-parseInt($(ul).css('width').replace('px')) );}
			$("ul.dropdown-menu[id='sOpsL']").find('a').on("click",function(e){
				e.preventDefault();
				$(bsOps).html($(this).text()+"&nbsp;&nbsp;<b class='caret'></b>");
				$('#searchInput').attr('placeholder',"Search"+$(this).text());
				fixSearchPos();
				$(ul).fadeOut(300);
			});
			$("ul.dropdown-menu[id='uOpsL']").find('a').on("click",function(){
				e.preventDefault();
				var target = $(this).attr('data-target');
				$(ul).fadeOut(300);
				$('.loader').empty();
				$('#thisModal').empty();
				//Modals are loaded and shown here
				if(target=='loginModal'){
					$.ajax({
						url:"pages/login-modal.html",
						cache:'false',
						success: function(data){
							$('#thisModal').html(data);
						}
					}).done(function(){
						$('#thisModal').modal('show');
					});
				}
				if(target=='registerModal'){
					$.ajax({
						url:"pages/register-modal.html",
						cache:'false',
						success: function(data){
							$('#thisModal').html(data);
						}
					}).done(function(){
						$('#thisModal').modal('show');
					});
				}
				if(target=='settingsModal'){
					$.ajax({
						url:"pages/settings-modal.html",
						cache:'false',
						success: function(data){
							$('#thisModal').html(data);
						}
					}).done(function(){
						$('#thisModal').modal('show');
					});
				}
				
			});
			$(ul).fadeToggle(300);

		});

		//Bind Scroll Box-Shadow
		$('.sideBar,.content').on("scroll",fixScroll);

		//Box widget Head Buttons
		$('.box-widget-head .btn.btn-mini').live("click",function(){
			var cls = $(this).find('i')[0].className; //Get classname of icon in button
				
			//Based on classname determine the task to be executed
			console.log(cls=='icon-chevron-up');
			if( cls === 'icon-chevron-up' ){
				var bb = $(this).parent().parent().parent()[0],
					bbody = $(bb).find('.box-widget-body')[0],
					bfooter = $(bb).find('.box-widget-footer')[0];

				bb.classList.add('box-widget-hide');

				$(bbody).slideUp(300);
				$(bfooter).hide();
			}
			if ( cls == 'icon-chevron-down' ){
				var bb = $(this).parent().parent().parent()[0],
					bbody = $(bb).find('.box-widget-body')[0],
					bfooter = $(bb).find('.box-widget-footer')[0];
				bb.classList.remove('box-widget-hide');

				$(bbody).slideDown(300);
				$(bfooter).show();
			}
			if( cls == 'icon-remove' ){
				var bb = $(this).parent().parent().parent()[0];
				$(bb).fadeOut();
			}
		});

		//Bind Tooltips
		$("a[rel='tooltip']").tooltip({
			trigger:'hover',
			placement:'top'
		});

		//This button is shown only when screen size falls below 767px
		$('.subHead .menuButton').on("click",function(){

			$('.sideBar').slideToggle(400);

		});



});

//Update Sidebar Active tab using this function
function updateSidebar(item){
	var target = $(".sideBar>ul>li[data-link='"+item+"']>figure:first-child")[0];
	//console.log(item,target);
	var ac = $('.sideBar > ul >li.active')[0];
	$(target).parent().addClass('active');
	$(ac).removeClass('active');
}

//This function is responsible for ajax loading of pages and the default actions that run everytime a new page is loaded
function loadPage(page){
	$.ajax({
		url:"pages/"+page.toString()+".html",
		cache:false,
		success: function(data){
			$(".content").empty();
			$(".content").html(data);
			$(".content").hide().fadeIn();
			updateSidebar(page);
			updateBreadCrumbs();		//Update the BreadCrumbs
			notification("You're in "+ page,"blue",2000);
		}
	}).done(function(){
		//This is the execution chain for different pages.
		//Note: Sub Pages are also defined here 
		//Functions used in this switch statement are defined in a new object named "chain"
		//this object contains all functions that you want to load when a specific page is initialized
		switch(page){
			case 'dashboard': chain.dashboard();
							  break;
			case 'home'     : chain.home();
			                  break;
			case 'portfolio': chain.portfolio();
			 				  break;
			case 'blog'     : chain.blog();
							  break;
			case 'social'   : chain.social();
							  break;
			case 'members'  : chain.members();
							  break;			
			case 'photos'  	: chain.photos();	//Note: Lightbox plugin can be initialized in chain.photos function.
							  break;
			case 'videos'  	: chain.videos();	//Note: Flowplayer functions and config can be  initialized in chain.video function.
							  break;
			case 'books'  	: chain.books();	//Note: Books can be looked up ... and ajax functions for book information
												//      retreival can be defined here
							  break;

			case 'features' : chain.features();
							  break;
			case 'contact'  : chain.contact();		//Google maps for directions to your company address can be done in chain.contact function
							  break;
			default: console.log('Page loading chain not identified, Add a new chain in main.js under chain module.'); 
		}
	});
}

function loadSubPage(page){
	$.ajax({
		url:"pages/"+page.toString()+'.html',
		cache:false,
		success: function(data){
			$('.content').empty();
			$('.content').html(data);
		}
	}).done(function(){
		
	});
}



function fixLayout(){
	$('.content').css('height',getDocHeight()-99-40+'px');
	$('.sideBar').css('height',getDocHeight()-99-60+'px').show();
	$('.subHead .menuButton').hide();
	$('.subHead .welcome').show();

	var wid = $('.centerOnPage').css('width'),
		ml = '-'+$('.centerOnPage')[0].offsetWidth/2+'px';
	$('.centerOnPage').css({
		'margin-left':ml
	});

	if(getDocWidth()<="767"){
		$('.subHead .menuButton').show();
		$('.subHead .welcome').hide();
		$('.sideBar').css('height',"300px").hide();

	}

	fixScroll();
}

function fixScroll(){
	if($(this)[0].scrollTop>0){
		$('.subHead').css({
			'box-shadow':'0px 1px 4px 0px rgba(0,0,0,0.06)'
		});
	}
	else{
		$('.subHead').css({
			'box-shadow':'0px 0px 0px 0px rgba(0,0,0,0)'
		});
	}
    if($(this)[0].scrollHeight - $(this)[0].offsetHeight == $(this)[0].scrollTop){
        $('footer').css({
            'box-shadow':'0px 0px 0px 0px rgba(0,0,0,0)'
        });
    }
    else{
        $('footer').css({
            'box-shadow':'0px -1px 5px 0px rgba(0,0,0,0.06)'
        });
    }
}

function fixSearchPos(){
	var wid = $('.centerOnPage').css('width'),
		ml = '-'+$('.centerOnPage')[0].offsetWidth/2+'px';
	$('.centerOnPage').css({
		'margin-left':ml
	});
}


function genSamples(title){
	var sec = $("<section/>")[0],
		tit = $("<h3>").addClass('cTitle').text(title+" "+"__number__"),
		cont1 = $("<p>").text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tempus nulla a lacus blandit vehicula viverra risus vehicula."),
		cont2 = $("<p>").text("Curabitur ullamcorper leo sit amet lectus fringilla sit amet mattis justo lobortis. Praesent semper justo quis nisi pharetra at mollis lectus auctor.");
		$(sec).append(tit).append(cont1).append(cont2).addClass('item');
	return sec;
}


function getDocHeight() {
    var D = document;
    return Math.max(
        Math.max(D.body.scrollHeight, D.documentElement.scrollHeight),
        Math.max(D.body.offsetHeight, D.documentElement.offsetHeight),
        Math.max(D.body.clientHeight, D.documentElement.clientHeight)
    );
}
function getDocWidth() {
    var D = document;
    return Math.max(
        Math.max(D.body.scrollWidth, D.documentElement.scrollWidth),
        Math.max(D.body.offsetWidth, D.documentElement.offsetWidth),
        Math.max(D.body.clientWidth, D.documentElement.clientWidth)
    );
}

function notify(_msg,_type,_time){
	window.setTimeout(function(){
		$('.notification').remove();
		var p = $("<p/>").text(_msg).addClass('notification stripe stripeS activeS').addClass(_type);
		$('header').append(p);
		var wid = parseInt($('.subHead')[0].offsetWidth/2-$(p)[0].offsetWidth/2);
		$(p).css('left',wid.toString()+'px');
		$(p).hide().fadeIn();
	},_time);
}





function updateBreadCrumbs(){
	$('.bcrumbs li:last-child').text($('.sideBar ul li.active figure').text());
}


var ninja = document.createElement('div');
$(ninja).on("tablesLoaded",function(){
	$('table').tablesorter();
});


function updateAutoComplete(_source){
	$('#searchInput').typeahead({
		source: _source,
		items: 8
	});
}

function trToArray(_tbodyelement){
	var jso=[];
	$(_tbodyelement).find('tr').each(function(index){ 
		jso.push($(this).find('td')[0].textContent);
	});
	return jso;
}



/*---------------------------------------------------------------------------------------------------
------------------------------  NOTIFICATIONS MODULE ------------------------------------------------
--------------- TUSHAR KANT SAHAY Copyright 2012 , nanu.clickity@gmail.com --------------------------
---------------------------------------------------------------------------------------------------*/

function notification(_message, _notificationType, _timeOut){
	$('.notification').remove();
	var p = $("<p/>").text(_message).addClass('notification stripe stripeS activeS').addClass(_notificationType);
	$('header').append(p);
	var wid = parseInt($('.subHead')[0].offsetWidth/2-$(p)[0].offsetWidth/2);
	$(p).css('left',wid.toString()+'px');
	$(p).hide().fadeIn();
	window.setTimeout( function(){
		$('.notification').fadeOut();
	},parseInt(_timeOut));
}





virgin.fn.jsonLength = function(object){
	var _ll=0;
	for(item in object){
		_ll++;
	}
	return _ll;
}




/*BROWSER SHARE PIE CHART*/

virgin.fn.drawBrowsersChart = function() {

	var data = google.visualization.arrayToDataTable([
  		['Browser', 'Visitors'],
  		['Chrome',    42],
  		['Firefox',   22],
  		['IE',  18],
  		['Maxthon', 5],
  		['Lunascape', 3],
  		['Others', 12]
	]);

	var options = {
  		legend: {position:'right',textStyle:{color:'#00AFDB',fontSize:'10'}},
  		is3D: true
	};

	var chart = new google.visualization.PieChart(document.getElementById('browsers_dashboard_chart'));
	chart.draw(data, options);
}

virgin.fn.drawVisitorsChart = function(){
	var wrapper = new google.visualization.ChartWrapper({
    	chartType: 'ColumnChart',
    	dataTable: [['', 'Germany', 'USA', 'Brazil', 'Canada', 'France', 'RU'],
                	['', 700, 300, 400, 500, 600, 800]],
   		options: {'title': 'Countries'},
    	containerId: 'visitors_dashboard_chart'
  	});
  	wrapper.draw();
}

virgin.fn.drawGeoCharts = function(){
	var data = google.visualization.arrayToDataTable([
	    ['Country', 'Popularity'],
	    ['Germany', 200],
	    ['United States', 300],
	    ['Brazil', 400],
	    ['Canada', 500],
	    ['France', 600],
	    ['RU', 700]
	]);

	var geomap = new google.visualization.GeoMap(document.getElementById('geo_dashboard_chart'));
  	geomap.draw(data, null);
}

virgin.fn.drawGaugeChart = function() {
  gaugeData = google.visualization.arrayToDataTable([
    ['Engine', 'Torpedo'],
    [120, 80]
  ]);

  gauge = new google.visualization.Gauge(document.getElementById('gauge_dashboard_chart'));
  gaugeOptions = {
      min: 0,
      max: 280,
      yellowFrom: 200,
      yellowTo: 250,
      redFrom: 250,
      redTo: 280,
      minorTicks: 5
  };
  gauge.draw(gaugeData, gaugeOptions);
}

virgin.fn.drawDashboardCharts = function(){
	virgin.fn.drawBrowsersChart();
	virgin.fn.drawVisitorsChart();
	virgin.fn.drawGaugeChart();

}


virgin.portfolio.fillPortfolioItems = function(){
	//Get JSON file and render portfolio contents from it.
	//if you want to add an item to this list, just add one more entry to portfolio-items.json file.
	$.ajax({
		url: 'portfolio-items.json',
		cache: false,
		success: function(data){
			virgin.portfolio.items = data.items;
			$(ninja).trigger('loadPortfolioItems');
		}
	});
	
}

function loadPortfolioItemDetails(item,output){
	// item varible holds the json object
	// while output variable tells the function to render Markdown/HTML.

	//The item description can be stored both as a separate html file or as a markdown file
	//Give proper paths in portfolio-items.json
	//While Calling this function the output variable can have two values --- 'markdown' and 'html'.
	$('.mdContent').empty();

	switch(output){
		case 'markdown': $.get(item.linkMarkDown,function(data){

							var html = virgin.mdConvert.makeHtml(data);
							$('.mdContent').html(html);
						 });	
						 break;
		case 'html': 	 $.get(item.linkHtml,function(data){
							$('.mdContent').html(data);
						 });
						 break;
		default: console.log('This format is not Supported');
	}
}


//Shadow element to trigger various functions
var ninja  = document.createElement("div");

$(ninja).on('loadPortfolioItems',function(){
	for(k in virgin.portfolio.items){
		var item = virgin.portfolio.items[k];
		var li = $('<li/>').addClass('portfolioItem').attr('data-key',item.key).attr('data-link',item.linkMarkdown.toString());
		var h4 = $("<h4/>").text(item.title.hBig);
		var img = $('<img/>').attr('src',item.imageLink.toString());
		$(li).append(img).append(h4);
		$('.portfolioItems').append(li);
	}
	console.log('Loaded Items');
});


//Bind The Click Function for portfolio items
$('.portfolioItem').live("click",function(){
	$.ajax({
		url: $(this).attr('data-link'),
		cache:false,
		success: function(data){
			console.log(data);
			var cvt = virgin.mdConvert.makeHtml(data);
			$('.mdContent').empty().append(cvt);
		}

	});
});

//Get JSON Object from Key
function getJSONObj(obj,keyname){
	for(item in obj){
		if(obj[item].key == keyname ){
			return obj[item];
			break;
		}
	}
}

virgin.members = {}; 	//This stores the json object for members list.
//This function loads members from members.json
//For easy editing of json files... you can use http://jsoneditoronline.org
virgin.loadMembers = function(){

	$.ajax({
		url:'data/members.json',
		cache:false,
		success: function(data){
			var len = virgin.fn.jsonLength(data);
			virgin.members = data;
			for(k in data){
				var item = data[k],
					ull = $('<ul/>').addClass('info unstyled'),
					member = $("<li/>").addClass('row-fluid')
										.append($("<img/>").attr('src',item.imagelink))
										.append(ull).attr('data-key',item.key);
				var name = $("<li/>").addClass('name').text(item.name),
					post = $("<li/>").addClass('post').text(item.post),
					stars = $("<li/>").addClass('stars');

					$(member).find('.info').append(name).append(post).append($("<ul/>").addClass('unstyled btn-group rating sharp'));
					$(stars).append(function(){
						for(var i=0;i<5;i++){
							var stt = $("<li/>").addClass('btn btn-mini').html("<i class='icon-white icon-star-empty'></i>");
							$(member).find('.info ul').append(stt);
						}
						var allstt = $(member).find('.info ul li.btn');
						for(var j=0; j< parseInt(item.stars); j++){
							var _star = allstt[j];
							$(_star).find('i').removeClass('icon-star-empty').addClass('icon-star');
						}
					});

				$('.memberList').append(member);
				k++;
			}
		}
	});
}





/*EXECUTION CHAINS*/
//This is the main object where you should define functions that you want executed.
//e.g. You can define the execution chains in this function.
//Note.. If you want to add new module... just read the function below... and add your own chain in a similar manner.

var chain = {
	dashboard: function(){
		virgin.fn.drawDashboardCharts();
		console.log('Time');
	},
	home: function(){
		console.log('Loaded Home');
	},
	portfolio: function(){
		virgin.portfolio.fillPortfolioItems();
		console.log("Loaded Portfolio");
	},
	blog: function(){
		console.log('Blog Items');
	},
	social: function(){
		console.log('Social Feeds');
	},
	members: function(){
		virgin.loadMembers();
		console.log('Members List');
	},
	features: function(){
		console.log('Features Page Loaded');
	},
	photos: function(){
		console.log('Photo Gallery');
	},
	videos: function(){
		console.log('Video Gallery');
	},
	books: function(){
		console.log('Books Gallery');
	},
	contact: function(){
		console.log("Contacts Page");
	}
};



//This function toggles commandline
//To display it again press ` button.
function toggleCommandWindow(){
	$('.commandWindow').fadeToggle(400);
}



//Keypress Events
$(document).on('keypress',function(e){
	var code = e.keyCode ? e.keyCode : e.which;
	code = parseInt(code);
	switch(code){
		case 96: toggleCommandWindow();break;		//Bind CommandLine to `
		case 13: //Bind Enter KeyPress for CommandLine
				 if( $(".commandWindow").css('display') !="none"){
				 	eval( $("#commandInput")[0].value );	//Execute the command entered
				 	toggleCommandWindow();	//Hide commandline after command execution
				 }break;
		default: console.log(code);break;
	}

});	



/* COMMANDLINE FUNCTIONS */
function goto(page){
	loadPage(page);
}
function play(musicJSONObj){
	/*
	Music JSON Object must be passed in the following format
	{
		
		title: "Sample Music",
		artist: "Artist",
		album: "Album",
		link: "/path/to/mp3"

	}

	*/

	virgin.audio.src = musicJSONObj.link;
}