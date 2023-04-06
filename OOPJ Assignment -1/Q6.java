class Q6
{

  

public static void main(String args[])
{
 
 // boolean value into String
  boolean b1 = false;
  String str = Boolean.toString(b1);
  System.out.println("The converted string from boolen is str ="+str);




//  boolean value into Boolean instance.
boolean b2 = true;
Boolean bool = Boolean.valueOf(b2);
System.out.println("The instance b2 of type Boolean from boolean represents :"+b2);





// String value into boolean value

String s3 = "true";
boolean b4=Boolean.parseBoolean(s3);
System.out.println("we get boolean b4 value ="+b4+" from the string s3="+s3);

String s4 = "i am string and  i am class ";
boolean b5=Boolean.parseBoolean(s4);
System.out.println("we get boolean b5 value ="+b5+" from the string s4="+s4);


// String value into Boolean instance

String s2="true";
Boolean b3 = Boolean.valueOf(s2);
System.out.println("The instance  of type Boolean from String s2="+s2+" represents b3 :"+b3);





}


}



