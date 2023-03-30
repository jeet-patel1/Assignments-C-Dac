import java.util.Scanner;
class HollowInverted {

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<=n;i++)
	{    
	     
		 System.out.print("*");
		 
	     if(i==1)
		 {   for(int j=1;j<n;j++)
		     System.out.print( "*" );  }
         else
		 {
	         for(int j=1; j<=(n-i) ;j++)
		     {
				 if(j<(n-i))
			     System.out.print( " " );
		
		         if(j==(n-i))
			     System.out.print( "*" );}
		 }
	
	     
		 System.out.println(" ");
		 
		    
	
	
	
	
	}



}

}