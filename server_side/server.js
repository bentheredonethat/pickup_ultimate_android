var express = require('express');
var app = express();
var fs = require("fs");

app.get('/listGames', function (req, res) {
   fs.readFile( __dirname + "/" + "games.json", 'utf8', function (err, data) {
       console.log( "respond to listGames request" );
       res.end( data );
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

var server = app.listen(8081, function () {

  var host = server.address().address
  var port = server.address().port

  console.log("listening at http://%s:%s", host, port)

})