class Q8
{

  

public static void main(String args[])
{    
     // byte value into String
     byte b1=12;
     String s= Byte.toString(b1);
     System.out.println("s ="+s);


     // byte value into Byte instance
       byte b2=122;
       Byte bi= Byte.valueOf(b2);
       System.out.println("The Byte instancve bi consists byte bi ="+bi);


     //  String instance into Byte instance
       String str=new String();
       str = "23";
       Byte byt= Byte.valueOf(str);
       System.out.println("Byte inmstance byt ="+byt);




}




}