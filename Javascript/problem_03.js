var Problem_03 = {

		init: function()
		{
			var number = 600851475143;
			var x = new Array;
			x = Problem_03.getListOfPrimes(number);

			for(var i = 0; i <= x.length; i++)
			{
				if(number % x[i] == 0)
				{
					document.write("x[i] = ", x[i], "<br \>");
				}
			}
		},
		
		int: function(a)
			{ return Math.floor(a); },

		getListOfPrimes: function(end)
		{
			var lstInt = new Array;
			lstInt.push(2);
			var sqI = Problem_03.int(Math.sqrt(end));
			for(var i = 3; i < sqI; i++)
			{
				if(Problem_03.isPrime(i))
				{
					lstInt.push(i);
				}
			}
			return lstInt;
		},

		isPrime: function(n)
		{
			var k = Problem_03.int(Math.sqrt(n));
			if(n == 1)
			{
				return false;
			}
			if(n == 2)
			{
				return true;
			}
			for(var i = 2; i <= k; i++)
			{
				if(n % i == 0)
				{
					return false;
				}
			}
			return true;
		}
};

Problem_03.init();