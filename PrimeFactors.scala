def PrimeFactor(n: Int){
  while(n%2 == 0)
  {
    println("2");
    n=n/2;
  }
  var i=0;
  for( i <- 3 to sqrt(n))
  {
    while(n%i == 0)
    {
      println(i);
      n=n/i
    }
    i=i+2;
  }

  if(n>2)
  {
    println(n);
  }
}

PrimeFactor(20);
