import java.util.Scanner;
class PP4{

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<=n;i++)
	{    
	     for(int j=1;j<=(n-i);j++)
		 {
		    System.out.print("  " );
		    
		 
		 }
	
	     for(int k=1;k<=i;k++)
		    System.out.print(k+" ");
			
		 for(int k=(i-1);k>=1;k--)
	     System.out.print(k+" ");
			
			
		  System.out.println(" ");
	
	
	
	
	}



}

}