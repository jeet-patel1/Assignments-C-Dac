import java.util.Scanner;

class Rational
{

    public static void main(String[] args)
    {

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter two pair of rational number numerator and denominator respectively");

         long a = scan.nextInt();
         long b = scan.nextInt();
         long c = scan.nextInt();
         long d = scan.nextInt();

         long x=0 ;
         long y=0 ;

         

     Loop : 
     {
         boolean ch= true ;
       while (ch)
       { 
         System.out.println("enter\n 0.To Exit\n  1. for summation\n 2. for substraction \n 3. for multiplication \n 4. for division \n");
         int q = scan.nextInt();
         switch(q)
         {

            case 1 :  x = a*d + b*c ;
                      y = b*d ;
                      
                      break;

            case 2 :  x = a*d - b*c ;
                      y = b*d ;
                      break;

            case 3 : x = a*c ;
                     y = b*d ;
                     break;

            case 4 : x = a*d ;
                     y = b*c ;
                     break;

            case 0 : ch = false ;
                     break Loop ;       

            default : System.out.println("Invalid choice , you moron !!");

         }
          for ( int i=2 ; i <= x ; i++)
         {

              while( x%i==0 && y%i==0 )
              {
                      x=x/i ;
                      y=y/i ;
              }        
         }

         System.out.println(x+"/"+y);
         }
     }
    
         

        


    }
}