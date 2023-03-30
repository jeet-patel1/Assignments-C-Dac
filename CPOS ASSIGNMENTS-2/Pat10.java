import java.util.Scanner;
class Pat10{

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<=n;i++)
	{   


       
	      
		    for(int j=1;j<=(n-i);j++)
		    System.out.print(" " );	
			
			for(int k=1;k<=n;k++)
		    System.out.print("*");
		
		 
			 
			
		  System.out.println(" \n ");
    }
	




}

}