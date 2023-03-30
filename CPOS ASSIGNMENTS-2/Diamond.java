import java.util.Scanner;
class Diamond{

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<=(n/2);i++)
	{    
	     for(int k=i; k<=(n/2) ;k++)
		 System.out.print("*");
		 
		 
		 for(int j=1; j<i ;j++)
		 System.out.print("  ");
		 
		 
		 for(int k=i; k<=(n/2) ;k++)
		 System.out.print("*");
		 
		 System.out.println();
	}	 
	
	
	for(int i=(n/2+1);i<=n;i++)	 
    {	
         for(int k = 1; k<=(i-n/2) ;k++)
		 System.out.print("*");
         
         for(int l=1;l<=(n-i) ;l++)
		 System.out.print("  ");
		 
		 for(int k = 1; k<=(i-n/2) ;k++)
		 System.out.print("*");
		 
		  
	     System.out.println();
	}



}

}