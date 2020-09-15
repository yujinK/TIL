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

// �񵿱��� �б�
fs.readFile('hello.txt', 'utf8', function(err, data) {
   console.log('�񵿱��� �б� ' + data); 
});

// ������ �б�
var text = fs.readFileSync('hello.txt', 'utf8');
console.log('������ �б� ' + text);


var fs = require('fs');

var data = 'fs.writeFile test';

fs.writeFile('text1.txt', data, 'utf8', function(err) {
    console.log('�񵿱��� ���� ���� �Ϸ�');
});

fs.writeFileSync('text2.txt', data, 'utf8');
console.log('������ ���� ���� �Ϸ�');


var fs = require('fs');

// ���� �б�(������)
try {
    var data = fs.readFileSync('notexist.txt', 'utf8');	// ������ ���µ� ������ ��
    console.log(data);
} catch(err) {
    console.log('������ ' + err);
}

// ���� �б�(�񵿱���)
fs.readFile('notexist.txt', 'utf8', function(err, data) {	// �������� �ʴ� ���� �б�
    if (err) {
        console.log('�񵿱��� ' + err);	// �б� ����
    } else {
        console.log(data);	// �б� ����
    }
})


var EventEmitter = require('events');

var custom_event = new EventEmitter();

custom_event.on('call', function() {
    console.log('�̺�Ʈ ��');
});

custom_event.emit('call');


var EventEmitter = require('events');

var custom_event = new EventEmitter();

custom_event.on('call', function() {
    console.log('�̺�Ʈ ��');
});

custom_event.removeAllListeners();

custom_event.emit('call');