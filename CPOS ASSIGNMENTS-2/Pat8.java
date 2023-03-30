import java.util.Scanner;
class Pat8{

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<=(2*n-1);i++)
	{   


       	if(i<=n)
	    {  
		    
			
			for(int k=1;k<=i;k++)
		    System.out.print("*");
		}
		 
		 
        else
        {
		   
	
	        for(int k=(2*n-i);k>=1;k--)
		    System.out.print("*");
		 
		 
		 
		 
		 
		 
		 
		 }		 
			
		  System.out.println(" \n ");
	
	
	
	
	}



}

}