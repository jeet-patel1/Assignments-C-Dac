import java.util.Scanner;
class Pattern13 {

public static void main(String[] args)
{   

     Scanner scan=new Scanner(System.in);
	 char n=scan.next().charAt(0);
    
    for(char i='A';i<=n;i++)
	{    
	     for(int j=1;j<(n-i+1);j++)
		 {
		    System.out.print(" " );
		    
		 
		 }
	
	     for(char k='A';k<=i;k++)
		    System.out.print(i+" ");
			
			
		  System.out.println(" ");
	
	
	
	
	}



}

}