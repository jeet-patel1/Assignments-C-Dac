import java.util.Scanner;
class Pat14 {

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
     
    for(int i=1;i<=(2*n-1);i++)
	{    

        for(int p=1;p<i && i<=n ;p++)
         System.out.print(" ");
		 
        for(int k=(n-i+1);k>=1 && i<=n ;k--)
	     System.out.print("* ");
         
	    for(int h=(2*n-i-1);h>=1 && i>n ;h--)
         System.out.print(" ");
	 
	 	for(int j=(i-n+1);j>=1 && i > n ;j--)
		System.out.print( "* " );   
	     
		  
    	 System.out.println(" \n");
	
	}



}

}