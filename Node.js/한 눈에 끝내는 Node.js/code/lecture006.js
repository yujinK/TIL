console.log('process env property : ', process.env);
console.log('uptime method : ', process.uptime());


var os = require('os');
console.log(os.tmpdir());
console.log(os.type());

var cpus = os.cpus();

for (var i=0; i<cpus.length; i++) {
    console.log("CPU[" + (i+1) + "]");
    console.log("model: " + cpus[i].model);
    console.log("speed: " + cpus[i].speed);
}


var util = require('util');
var data = util.format('%d, %s, %j', 6, 'chapter', {content: 'module'});

console.log(data);
util.log('message');