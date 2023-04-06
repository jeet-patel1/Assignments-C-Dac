class Q33{


public static void main(String[] args)
{

     /*  Pass integer, float and double value from command line. Parse 
         it appropriately and perform arithmetic operations (+,-,*,/)
         on it. Here you can you switch case.  */

         int a = Integer.parseInt(args[0]);
         float f = Float.parseFloat(args[1]);
         double d = Double.parseDouble(args[2]);


         System.out.println("summation of given values is :"+(double)(a+f+d));

         System.out.println("substraction  of given values a - b - f is :"+(double)(a-f-d));

         System.out.println("multiplication  of given values is a*f*d :"+(double)(a*f*d));

         System.out.println("division of given values is (a/b)/c:"+(double)((a/f)/d));







}








}