class Q21{

  public static void main(String [] args)
  {
         
      /* Write a program to convert state of Long instance into lne, 
         short, int, long, float and double.   */


         Long ln=1423232121l;


       byte b= ln.byteValue();
       System.out.println("The byte value of ln is b="+b);

       short s = ln.shortValue();
       System.out.println("The short value of ln is s="+s);

       int i = ln.intValue();
       System.out.println("The int value of ln is i="+i);

       long l = ln.longValue();
       System.out.println("The long value of ln is l="+l);

       float f = ln.floatValue();
       System.out.println("The float value of ln is f="+f);

       double d = ln.doubleValue();
       System.out.println("The double value of ln is d="+d);




  }






}