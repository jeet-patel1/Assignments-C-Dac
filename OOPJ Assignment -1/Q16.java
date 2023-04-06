class Q16{

public static void main(String[] args)
{
// int value into String
 int i=456743;
 String str= Integer.toString(i);
 System.out.println("The converted string str ="+str);

// int value into Integer instance.
 Integer inst = Integer.valueOf(i);
 System.out.println("The Instance of integer class is inst="+inst);


// String instance into Integer instance.
 String s="234233";
 Integer in = Integer.valueOf(s);
 System.out.println("The Instance of integer class from string s ="+s+" is inst="+in);

// int value into binary, octal and hexadecimal string.
int k=636363;
String o_str= Integer.toOctalString(k);
     System.out.println("The octal representation of int k="+k+"  is "+o_str);
String h_str= Integer.toHexString(k);
     System.out.println("The hexadecimal representation of int k="+k+"  is "+h_str);
String b_str= Integer.toBinaryString(k);
     System.out.println("The octal representation of int k="+k+"  is "+b_str);





}





}