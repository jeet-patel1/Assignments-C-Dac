class Q29{

public static void main(String[] args)
{
     /* .Write a program to convert state of Double instance into byte, 
        short, int, long, float and double.   */


        
       Double dbl =1433.34d;


       byte b= dbl.byteValue();
       System.out.println("The byte value of Double is b="+b);

       short s = dbl.shortValue();
       System.out.println("The short value of Double is s="+s);

       int i = dbl.intValue();
       System.out.println("The int value of Double is i="+i);

       long l = dbl.longValue();
       System.out.println("The long value of Double is l="+l);

       float f = dbl.floatValue();
       System.out.println("The float value of Double is f="+f);

       double d = dbl.doubleValue();
       System.out.println("The double value of Double is d="+d);

     



}



}