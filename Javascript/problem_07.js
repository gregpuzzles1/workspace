var Problem_07 = 
{
		init: function()
		{
			document.write(Problem_07.isPrime(5));
			/*var swtch = 1;
			var number = 1;
			var primes = 1;
			document.write("AA =", Problem_07.isPrime(5));
			while(swtch == 1)
			{
				//document.write(isPrime(5));
				if(Problem_07.isPrime(number))
				{
					primes += 1;
					//document.write("primes = ", primes);
				}
				if(primes == 10001)
				{
					document.write("number = ", number);
					swtch = 0;
				}
				number += 2;
			}*/
		},
		
		isPrime: function(n)
		{
			var k = int(Math.sqrt(n));
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
				if(n % 2 == 0)
				{
					return false;
				}
			}
			return true;
		}
};

Problem_07.init();