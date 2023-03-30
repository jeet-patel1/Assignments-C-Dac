import java.util.Scanner;
class PP6{

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<=n;i++)
	{    
	     for(int j=1;j<i;j++)
    	 System.out.print(" " );
		 
	
	     for(int k=(n-i+1);k>=1;k--)
		 System.out.print("* ");
			
			
		 System.out.println(" ");
	
	
	
	
	}



}

}