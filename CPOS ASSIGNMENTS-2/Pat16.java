import java.util.Scanner;
class Pat16 {

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<=n;i++)
	{    
   		 for(int p=n-i;p>=1;p--)
		 System.out.print( " " );
		 
		 
		 System.out.print( "*" );
		 
		 
	     for(int j=2;j<=i && i!=n ;j++)
		 {
		    if(j<i)
			System.out.print( " " );
		
		    if(j==i)
			System.out.print( "*" );
		    
		 
		 }
	
	     if(i==n)
		 
			 for(int k=1;k<n;k++)System.out.print( "*" );
		 
		  System.out.println(" \n");
	
	
	
	
	}



}

}