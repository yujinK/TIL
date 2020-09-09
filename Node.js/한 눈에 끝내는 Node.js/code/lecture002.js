var a = 1;
b = 2;

console.log("a:" + a);
console.log("b:" + b);

var c = 3, d = 10;
var str1 = "Hello";
var str2 = "World!";
var str3 = null;

console.log("c:" + c);
console.log("d:" + d);
console.log(str1);
console.log(str2);
console.log(str3);


var str1 = "Hello";
var str2 = "World!";
var str3 = null;

str3 = str1 + " ";	//"Hello "
console.log(str3);

str3 = str3 + str2;	//"Hello World!"
console.log(str3);


var a = 1, b = 2, c = 3, d = 4;

a += 1;	//a = a + 1
b -= 1;	//b = b - 1
c *= 2;	//c = c * 2
d /= 2;	//d = d / 2

console.log("a:" + a);
console.log("b:" + b);
console.log("c:" + c);
console.log("d:" + d);