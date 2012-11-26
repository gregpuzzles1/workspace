var n = 2520;
var on_off = 1;
while(on_off == 1){
	var smallest = evenlyDivisible(n);
	if(smallest != 1){
		document.write(smallest);
		on_off = 0;
	}
	else{
		n += 2520;
	}
}

function evenlyDivisible(n){
	// Checks if number (n) is evenly divisible by the numbers 1-20.
	var counter = 0;
	for(var i = 1; i <= 20; i++){
		if(n % i == 0){
			counter += 1;
			if(counter == 20){
				return n;
			}
		}
		else{
			return 1;
			}
	}
}