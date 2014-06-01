def Fibonacci(x: Int){
	var st=0;
	var ne=1;
	var value=0;
	var i=0;
	for( i <- 0 to x )
	{
		value = st+ne
		st=ne
		ne=value
		println(" Value of fib : "+value);
	}
}

Fibonacci(20)
