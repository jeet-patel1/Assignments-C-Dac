import java.util.Scanner;
class PP1{

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<=n;i++)
	{    
	     for(int j=1;j<=(n-i);j++)
		 {
		    System.out.print(" " );
		    
		 
		 }
	
	     for(int k=1;k<=i;k++)
		    System.out.print(i+" ");
			
			
		  System.out.println(" ");
	
	
	
	
	}



}

}