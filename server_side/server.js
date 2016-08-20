var express = require('express');
var app = express();
var fs = require("fs");
var https = require('https');
var jsdom = require("jsdom");



app.get('/listGames', function (req, res) {
   fs.readFile( __dirname + "/" + "games.json", 'utf8', function (err, data) {
       console.log( "respond to listGames request" );
       res.end( data );
   });
})




function getCityFromLatLng(id, lat, lng, callback){
	var targetURL = "http://www.mapquestapi.com/geocoding/v1/reverse?key=8bLbxDVT61TKxA6U2j0gkyIq5lUGzb2S&callback=renderReverse&location=";
	
	// do city parse/call here
	var request = require('request');
		request({
			url : targetURL + lat + "," + lng
			},
			function (error, response, body) {
		 		var parsed = [];
		 		try{

					var myRegexp = /((\"locations.*)\]\})/g;
					var match = myRegexp.exec(body);
					match[0] = match[0].slice(0,-1);
					match[0] = match[0].slice(0,-1);
					var jsonToParse = "{" + match[0];
					var result = JSON.parse(jsonToParse);
					result = JSON.stringify(result["locations"][0]["adminArea5"]);

					if (result != null){
		  				result=result.slice(1,result.length);
		  				result = result.substring(0, result.length - 1);	
		  			}
		  			var gameRow = {
						"id" : id, 
						"city" : result
					};
					callback(gameRow);

		 		} catch (e) {
    				console.log(e);
    				callback({
						"id" : id, 
						"city" : null
					});
				}	
				
			}  
		); 
}



app.get('/cities', function (req, res) {
   // First read existing games.
   fs.readFile( __dirname + "/" + "games.json", 'utf8', function (err, data) {
       var games = JSON.parse( data );
       var cities = [];
       var requests = 0;

		function done() {
	       console.log( "respond to /cities request" );
	       res.end( JSON.stringify(cities));
   		}

       	for(var i = 0; i < games.length; i++)
		{	

			requests++;

			
			console.log(games[i]["id"]);
		  	getCityFromLatLng(games[i]["id"], games[i]["lat"],games[i]["lng"],function(result){
		  		
		  		console.log(result);
		  		cities.push(result);
		  		requests--;
		  		if (requests == 0){
		  			done();	
		  		} 
		  		
		  	}); 
		}


   });
})

app.get('/:id', function (req, res) {
   // First read existing games.
   fs.readFile( __dirname + "/" + "games.json", 'utf8', function (err, data) {
       var games = JSON.parse( data );
       var game;
       	for(var i = 0; i < games.length; i++)
		{
		  if(games[i].id == req.params.id)
		  {
		    game = games[i];
		  }
		}

       // var game = games[req.params.id];
       console.log( "respond to /:id request with id: " +req.params.id );
       res.end( JSON.stringify(game));
   });
})





var server = app.listen(3000, function () {

  var host = server.address().address
  var port = server.address().port

  console.log("listening at http://%s:%s", host, port)

})