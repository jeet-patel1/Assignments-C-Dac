class Q17{

public static void main(String[] args)
{

/* Write a program to convert state of Integer instance into byte, 
      short, int, long, float and double.   */

      Integer ins =143223;


       byte b= ins.byteValue();
       System.out.println("The byte value of Integer is b="+b);

       short s = ins.shortValue();
       System.out.println("The short value of Integer is s="+s);

       int i = ins.intValue();
       System.out.println("The int value of Integer is i="+i);

       long l = ins.longValue();
       System.out.println("The long value of Integer is l="+l);

       float f = ins.floatValue();
       System.out.println("The float value of Integer is f="+f);

       double d = ins.doubleValue();
       System.out.println("The double value of Integer is d="+d);



}

}