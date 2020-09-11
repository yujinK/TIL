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