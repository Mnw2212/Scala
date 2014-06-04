def QuickSort(xs: Array[Int])
{
  def swap(i: Int, j:Int)
  {
    val t = xs(i);
    xs(i) = xs(j);
    xs(j) = t;
  }

  def sort(l:Int,r:Int)
  {
    val pivot = xs((1+r)/2)
    var i=1;
    var j=r;
    while(i<=j)
    {
      while(xs(i) < pivot) i += 1;
      while(xs(j) > pivot) j -= 1;
      if(i<=j)
      {
         i+=1
         j-=1
      }
    }
    if(1<j) sort(1,j)
    if(j<r) sort(i,r)
  }
  sort(0, xs.length - 1)
}
