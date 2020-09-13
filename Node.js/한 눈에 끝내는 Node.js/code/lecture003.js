/**
 * 객체지향이란?
 */
var park_ji_sung = {
    name: "Park Ji Sung",
    height: 178,
    weight: 70,
    position: "RW",
    team: "Queen's Park Rangers"
};

console.log(park_ji_sung.team);
// "Queen's Park Rangers"


/**
 * 객체지향의 요소
 */
var SoccerPlayer = function() {};

SoccerPlayer.prototype = {
    name: String,
    age: Number,
    height: Number,
    weight: Number,
    position: String,
    team: String
};

var park_ji_sung = new SoccerPlayer();

park_ji_sung.name = "Park Ji Sung";
park_ji_sung.age = 31;
park_ji_sung.height = 178;
park_ji_sung.weight = 70;

console.log(park_ji_sung);


function Man() {
    this.name = "Anonymous";
    this.gender = "Man";
    this.Run = function() {
        return this.name + " is running!";
    }
    this.Sleep = function() {
        return this.name + " is sleeping!";
    }
}

function SoccerPlayer() {
    this.base = new Man();
    this.name = "Anonymous Soccer Player";
    this.Run = function() {
        return this.base.Run();
    }
    this.Pass = function() {
        return this.name + " is passing to other player!";
    }
}

SoccerPlayer.prototype = new Man();
var player = new SoccerPlayer();

console.log(player.name);
// "Anonymous Soccer Player"

console.log(player.gender);
// "Man"

console.log(player.Run());
// "Anonymous is running!"

console.log(player.Pass());
// "Anonymous Soccer Player is passing to other player!"

console.log(player.Sleep());
// "Anonymous Soccer Player is slepping!"


/**
 * 생성자
 */
function SoccerPlayer(name, position) {
    this.name = name;
    this.position = position;
    this.whatIsYourName = function() {
        return "My name is " + this.name;
    };
    this.whatIsYourPosition = function() {
        return "My position is " + this.position;
    };
}

var player = new SoccerPlayer("Park Ji Sung", "Wing Forward");
console.log(player.whatIsYourName());
// "My name is Park Ji Sung"
console.log(player.whatIsYourPosition());
// "My position is Wing Forward"

console.log(player.constructor);
// Function: SoccerPlayer

var player2 = new player.constructor("Koo Ja Cheol");
console.log(player2.name);
// "Koo Ja Cheol"


console.log(player instanceof SoccerPlayer);
// true

console.log(player instanceof Object);
// true


/**
 * 스코프와 호이스팅
 */
var global_scope = 'global';	// 전역 스코프

var local_function = function() {
    var local_scope = 'goorm';	// 지역 스코프
    console.log(global_scope);	// 전역 스코프 참조 가능
    console.log(local_scope);	// 지역 스코프 참조 가능
};

console.log(local_scope);		// 지역 스코프이기 때문에 에러 발생


var a = 1;

function outer() {
    var b = 2;
    console.log(a);	//1
    
    function inner() {
        var c = 3;
        console.log(b);
        console.log(a);
    }
    
    inner();		// 2 1
}
outer();

console.log(c);		// c is not defined


var text = 'global';

function foo() {
    console.log(text);
}

function bar() {
    var text = 'bar';
    foo();
}

bar();


var text = 'global';

function foo() {
    console.log(text);
}

function bar() {
    text = 'bar';
    foo();
}

bar();



function foo() {
    console.log(a);	// undefined
    var a = 100;
    console.log(a);	// 100
}

foo();


var num = 1;

function foo() {
    var num = 2;
    
    function bar() {
        console.log(num);
    }
    return bar;
}

var baz = foo();
baz();


function f(arg) {
	var n = function() {
		return arg; 
	}
	arg++;
	return n; 
}

var m = f(123); 
console.log(m());


function f() {
    var a = [];
    var i;
    
    for (i = 0; i < 3; i++) {
        a[i] = function() {
            return i;
        }
    }
    return a;
}

var b = f();

console.log(b[0]());	// 3
console.log(b[1]());	// 3
console.log(b[2]());	// 3


function f() {
    var a = [];
    var i;
    
    for (i = 0; i < 3; i){
        a[i] = (function(x) {
            return function() {
                return x;
            }
        })(i);
    }
    return a;
}

var b = f();

console.log(b[0]());	// 0
console.log(b[1]());	// 1
console.log(b[2]());	// 2