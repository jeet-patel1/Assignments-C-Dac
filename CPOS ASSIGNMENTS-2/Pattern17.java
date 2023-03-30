import java.util.Scanner;
class Pattern17 {

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
     int k=1;
    for(int i=1;i<=n;i++)
	{    
	     for(int j=n;j>=(n-i+1);j--)
		 {
		    System.out.print((k++)+ "  " );
		    
		 
		 }
	
	     
		  System.out.println(" ");
	
	
	
	
	}



}

}