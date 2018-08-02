//window.document.write('Hey there.');
//alert('Hello'); //everything that you dont mention '.' for , belongs to window

function  display() {
	var hd=document.getElementById('helloDiv');
	hd.innerHTML='Clicked......';
}
function greetings() {
	alert(document.loginform.username.value); // document.form.control is
												// proper hierarchy. we are
												// violating it here so we wont
												// get box so right click on
												// browser and inspect and
												// console.
	sum(7, 3);
	sum('7', '3');
}

function sum(num1, num2) { // no need of return type

	alert(num1 + num2);
	var result = num1 + num2;   //with var makes it local
	alert(result);
}

var myFunc = function(var1, var2) { // pointer to function
	return (var1 + var2);
}
var sum = myFunc(10, 20);
alert(sum);




function test1() {
	var v1=1;
}

test1();

function test2() {
	alert(v1);
}
test2();
