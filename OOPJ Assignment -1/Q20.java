class Q20{


public static void main(String[] args)
{

// int value into String
 long l=456744223;
 String str=Long.toString(l);
 System.out.println("The converted string str ="+str);

// long value intoLong instance.
 Long ln = Long.valueOf(l);
 System.out.println("The Instance of long class is ln="+ln);


// String instance into Long instance.
 String s="234233";
 Long lng = Long.valueOf(s);
 System.out.println("The Instance of Long class from string s ="+s+" is lng="+lng);

// int value into binary, octal and hexadecimal string.
long k=636363;
String o_str=Long.toOctalString(k);
     System.out.println("The octal representation of int k="+k+"  is "+o_str);
String h_str=Long.toHexString(k);
     System.out.println("The hexadecimal representation of int k="+k+"  is "+h_str);
String b_str=Long.toBinaryString(k);
     System.out.println("The octal representation of int k="+k+"  is "+b_str);







}






}