import java.util.Scanner;
class Pattern18 {

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<=n;i++)
	{    
	     for(int j=1;j<=n-i+1;j++)
		 {
		    System.out.print((char)(j+64) );
		    
		 
		 }
	
	     
		  System.out.println(" ");
	
	
	
	
	}



}

}