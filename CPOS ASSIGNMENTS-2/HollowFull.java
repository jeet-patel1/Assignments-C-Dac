import java.util.Scanner;
class HollowFull{

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
    
    for(int i=1;i<n;i++)
	{    
	     for(int j=1;j<=(n-i-1);j++)
		 System.out.print(" " );
		    
	     for(int k=1;k<=i;k++)
		 {  
		    if(k<i)
			System.out.print( "  " );
		
		    if(k==1 || k==i )
			System.out.print( "* " );
		 }
    
		  System.out.println(" ");
    
	    
	}
    
   
     	
		for(int k=n;k>=1;k--)
	    System.out.print( " *" );
        	

}

}