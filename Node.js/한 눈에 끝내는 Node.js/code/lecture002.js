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


var a = 2, b = 1, c = 6, d = 8;

console.log(a > b);		//true
console.log(b >= c);	//false
console.log(c <= 10);	//true
console.log(d < 10);	//true


var a = 2, b = 1, c = 6;

console.log(a == 1);		//false
console.log(b != c);		//true
console.log(true && false);	//false
console.log(false || true);	//true
console.log(!false);		//true


var a = 2, b = 1;

(a > b)? (console.log("a is bigger than b")):(console.log("a is smaller than b"));
// a is bigger than b


var int_data = 1;
var float_data1 = Number('1.0');
var float_data2 = new Number('4.1254');

typeof int_data		// "number"
typeof float_data1	// "number"
typeof float_data2	// "object"

console.log((255).toString(10));	// "255"
console.log((255).toString(16));	// "ff"
console.log((255).toString(8));		// "377"
console.log((255).toString(2));		// "11111111"


var character1 = 'a';
var character2 = "b";
var string1 = "Double Quotations";
var string2 = 'Single Quotation Anyway';
var string3 = new String("String Object");

typeof string1;	// "string"
typeof string3;	// "object"

string2[4];		// "l"

console.log(string2.charAt(4));	// "l"
console.log(string3[1]);		// "t"
console.log(string1.length);	// 17
console.log(string1.toUpperCase());	// "DOUBLE QUOTATIONS"
console.log(string2.toLowerCase());	// "single quotation anyway"
console.log(string3.indexOf('g'));	// 5
console.log(string3.indexOf('x'));	// -1


var result1 = new Boolean();
var result2 = true;

typeof result1;	// "object"
typeof result2;	// "boolean"

console.log(Boolean("test"));	//true
console.log(Boolean(""));		//false
console.log(Boolean({}));		//true


var array1 = [1, 2, 3];
var array2 = new Array(1, 2);

array2.push(3);		
//3

var array3 = new Array(3);
array3;				
//[undefined x 3]

typeof array1;		
//"object"

array1.toString();	
//"1,2,3"

array1.valueOf();
//[1, 2, 3]

array1.length;
//3

array1[1];
//2

array1.length = 5;
//5

array1;
//[1, 2, 3, undefined x 2]

console.log(array2.push("new1"));
//4

console.log(array2.push("new2"));
//5

array2;
//[1, 2, 3, "new1", "new2"]

array3 = new Array(4, 2, 1, 3, 0);
//[4, 2, 1, 3, 0]

console.log(array3.sort());
//[0, 1, 2, 3, 4]


var a = 3;
var result = '';
if (a > 2) {
    result = 'a is greater than 2';
}
else if (a == 2) {
    result = 'a is 2';
}
else {
    result = 'a is smaller than 2';
}

console.log(result);
//"a is greater than 2"


var a = 1;
var result = '';

switch (a) {
    case 1:
        result = 'Number 1';
        break;
    case 2:
        result = 'Number 2';
        break;
    default:
        result = 'I do not know what number';
        break;
}

console.log(result);
// "Number 1"


var array = new Array();

for (var i=0; i<10; i++) {
    array.push(i);
}

console.log(array.toString());
// "0,1,2,3,4,5,6,7,8,9"


var a = ['a', 'b', 'c', 'x', 'y', 'z'];
var result = '';

for (var i in a) {
    result += 'index:' + i + ', value:' + a[i] + '\n';
}

console.log(result);
// "index:0, value:a
// index:1, value:b
// index:2, value:c
// index:3, value:x
// index:4, value:y
// index:5, value:z"


var i = 0;

while (i < 10) {
    i++;
}

console.log(i);
//10


var i = 0;

do {
    i++;
} while (i < 10)

console.log(i);
//10


var i = 10;
for (; i>0; i--) {
	console.log(i);
}

var array = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1];

for (var j in array) {
	console.log(array[j]);
}

var k = 10;
while (k > 0) {
	console.log(k--);
}


function sum(a, b) {
    var c = a + b;
    return c;
}

console.log(sum(1, 2));
//3


function sum(a, b) {
    var c = a + b;
    return c;
}

var add = sum;
typeof add;
//"function"

add(1, 2);
//3

var student = {
    name : 'goorm',
    age : 20
}

console.log(student.name);

delete student.name;
// true

console.log(student.name);
// undefined

delete student;
// false

delete not_exist;
// true

console.log(student.age);


var f = function(a) {
    return "This is anonymous function!";
};

console.log(f());
// "This is anonymous function!"


function one() {
    return 1;
}

var two = function() {
    return 2;
}

function invoke_and_add(a, b) {
    return a() + b();
}

console.log(invoke_and_add(one, two));
// 3