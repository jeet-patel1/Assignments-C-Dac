

import java.util.Scanner;

class Shape{
      static final double PI=3.14;
      double rad , base , length , width , height;
	  
	  void c_Area()
	  { System.out.println( "THE AREA OF YOUR CIRCLE IS "+ rad*rad*PI);}
	  
	  
	  void s_Area()
	  { System.out.println( "THE AREA OF YOUR SQUARE IS "+ length*length);}
	  
	  
	  void t_Area()
	  { System.out.println( "THE AREA OF YOUR TRIANGLE IS "+(height*base)/2) ;}
	  
	  
	  void r_Area()
	  { System.out.println( "THE AREA OF YOUR RECTANGLE IS "+ length*width);}


      public static void main(String [] args)
	  {
	  
	      Shape Triangle = new Shape();
		  Shape Circle = new Shape();
		  Shape Rectangle = new Shape() , Square = new Shape();
	  
	    char flag;
		 
		do
		{  
		  System.out.println( "enter \n1 --> To Count the Area of Triangle\n  2 --> To Count the Area of Circle \n 3 --> To Count the Area of Square \n 4 --> To Count the Area of Rectangle.");
		   Scanner sc=new Scanner(System.in);
		  int choice = sc.nextInt();
		 switch(choice)
		    {
		        case 1: System.out.println("enter the base triangle base and height respectively");
				        Triangle.base = sc.nextDouble();
		                Triangle.height = sc.nextDouble();
		                Triangle.t_Area();
                        break;
						
			    case 2: System.out.println("enter the radius of circle");
				        Circle.rad = sc.nextDouble();
						Circle.c_Area();
						break;
						
				case 3: System.out.println("enter the length of Square");
		                Square.length = sc.nextDouble();
						Square.s_Area();
						break;
						
			    case 4: System.out.println("enter the length and width of rectanle respectively");
		                Rectangle.length = sc.nextDouble();
		                Rectangle.width = sc.nextDouble();
						Rectangle.r_Area();
						break;
		 
		        default: System.out.println("Invalid choice , You moron !");
		  
	  
	  
		    }
			
			 System.out.println("enter 'Y' if you want to continue with  the program \n or enter any key to exit.");
		     flag = sc.next().charAt(0);
		} while(flag =='Y');
	  }


}