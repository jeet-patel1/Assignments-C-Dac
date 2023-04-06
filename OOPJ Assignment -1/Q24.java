class Q24{

public static void main(String[] args)
{
      // float value into String
       float f=45674f;
       String str=Float.toString(f);
       System.out.println("The converted string str ="+str);

     // Float value into Float instance.
       Float ft = Float.valueOf(f);
       System.out.println("The Instance of Float class is ft="+ft);


     // String instance into Float instance.
       String s="234233";
       Float flt = Float.valueOf(s);
       System.out.println("The Instance of Float class from string s ="+s+" is flt="+flt);

     // float value into  hexadecimal string.
      float k=636f;
      
      String h_str=Float.toHexString(k);
      System.out.println("The hexadecimal representation of float k="+k+"  is "+h_str);
      


}

}