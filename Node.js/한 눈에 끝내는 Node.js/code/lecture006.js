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


var fs = require('fs');

// 비동기적 읽기
fs.readFile('hello.txt', 'utf8', function(err, data) {
   console.log('비동기적 읽기 ' + data); 
});

// 동기적 읽기
var text = fs.readFileSync('hello.txt', 'utf8');
console.log('동기적 읽기 ' + text);


var fs = require('fs');

var data = 'fs.writeFile test';

fs.writeFile('text1.txt', data, 'utf8', function(err) {
    console.log('비동기적 파일 쓰기 완료');
});

fs.writeFileSync('text2.txt', data, 'utf8');
console.log('동기적 파일 쓰기 완료');


var fs = require('fs');

// 파일 읽기(동기적)
try {
    var data = fs.readFileSync('notexist.txt', 'utf8');	// 파일이 없는데 읽으려 함
    console.log(data);
} catch(err) {
    console.log('동기적 ' + err);
}

// 파일 읽기(비동기적)
fs.readFile('notexist.txt', 'utf8', function(err, data) {	// 존재하지 않는 파일 읽기
    if (err) {
        console.log('비동기적 ' + err);	// 읽기 실패
    } else {
        console.log(data);	// 읽기 성공
    }
})


var EventEmitter = require('events');

var custom_event = new EventEmitter();

custom_event.on('call', function() {
    console.log('이벤트 콜');
});

custom_event.emit('call');


var EventEmitter = require('events');

var custom_event = new EventEmitter();

custom_event.on('call', function() {
    console.log('이벤트 콜');
});

custom_event.removeAllListeners();

custom_event.emit('call');