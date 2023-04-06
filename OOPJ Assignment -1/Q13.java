class Q13{

public static void main(String [] args)
{

  // short value into String
      short s = 354;
      String str = Short.toString(s);
      System.out.println(" The string value of short s ="+s+"  is str="+str);


  //short value into Short instance.
      Short sh = Short.valueOf(s);
      System.out.println("The instance of short consists short value inside it as sh="+sh);


  //String instance into Short instance
      String st = new String();
      st = "3453";
      Short shrt = Short.valueOf(st);
      System.out.println("The short instance from the string instance is shrt="+shrt);


}






}