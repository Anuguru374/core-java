class NcrAndNps
{
 double fact(double n)
 {er
   double f=1;
   {
     for(int i=1; i<=n; i++)
	 {
	   f=f*i;
	 }
	 return f;
   }
   
   public static void main(String arg[])
   {
     NcrAndNps a=new NcrAndNpr();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter value n");
	  int n=sc.nextInt();
	  System.out.println("enter value r");
	  int r=sc.nextInt();
	  
	  if(n>=r)
	  {
	    double com=a.fact(n)/(a.fact(n-r)*a.fact(r));
		double per=a.fact(n)/a.fact(n-r);
		System.out.println("the value of "+n+"p"+r+" is:" +per);
		System.out.println("the value of "+n+"c"+r+" is:" +com);
	  }
	  
	  else
	  System.out.println("plz enter n>=r");
	  
	
   }
 }
