document.write(fib(4000000));

function fib(n){
	var thesum = 0;
	var a = 0;
	var b = 1;
	var c = a + b;
	while (a < n){
		if (a % 2 == 0){
			thesum += a;
		}
		a = b, b = c, c = a + b;
		
		document.write("a = ", a,  "<br />");
		document.write("b = ", b,  "<br />");
	}
	return thesum;
}