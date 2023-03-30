import java.util.Scanner;
class Pat12 {

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
     
    for(int i=1;i<=(2*n-1);i++)
	{    

         for(int k=(n-i+1);k>=1 && i<=n ;k--)
	     System.out.print("*");
         
	     for(int j=n;j<=(i+1) && i > n ;j++)
		 System.out.print( "*" );
		   
	   
	     
		  
    	 System.out.println(" \n");
	
	}



}

}