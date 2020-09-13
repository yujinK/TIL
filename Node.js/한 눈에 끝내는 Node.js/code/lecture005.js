var server = require('http');

server.createServer(function(req, res) {
    res.writeHead(200, { 'Content-Type' : 'text/plain'});
    res.end("Hello node.js! \n");
}).listen(3000, 'localhost');

console.log('Server is running at http://localhost:3000/');


var EventEmitter = require("events").EventEmitter;
var evt = new EventEmitter();

evt.on("helloNode", function(str) {
    console.log("Hello! " + str);
});

setTimeout(function() {
    evt.emit("helloNode", "Node.js");
}, 3000);