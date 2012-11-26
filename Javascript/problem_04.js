document.write(findLargest());

function findLargest(){
	var largest = 0;
	for(var i = 100; i < 1000; i++){
		for(var r = 100; r < 1000; r++){
			var x = (i * r).toString();
			var y = reverse(x);
			if(x == y){
				x = parseInt(x);
				if(x > largest){
					largest = x;
				}
			}
		}
	}
	return largest;
}

function reverse(s){
    return s.split("").reverse().join("");
}