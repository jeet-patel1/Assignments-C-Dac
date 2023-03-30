import java.util.Scanner;

class Array{




   public static void main(String [] args)
   {
         
		 Scanner scan=new Scanner(System.in);
		 
		 
			

		 System.out.println("enter the size of an array");
		 int size=scan.nextInt();
         int[]  Arr = new int[size];
		 for(int i=0; i<size; i++)
		 {
			 System.out.println("enter the number"+i+" element");
			 Arr[i]=scan.nextInt();
         }			
				
				
					
		     char ch;
		    
			do{
				
			    System.out.println(" Enter 1--> if you want to print an entire array. \nEnter 2--> if you want to find the max value in  the array. \nEnter 3--> if you want to find the min value in  the array. \nEnter 4--> if you want to find an element in the array. \n	");
                int menu=scan.nextInt();
			switch(menu)
			{
			    
				case 1:  System.out.println(" Arrray element with index are given below.\n");
				        for(int x:Arr)
			             {   
						     System.out.print(x+"\t");
			             }
						 System.out.println(" \n enter Y to continue in the main menu");
						 ch=scan.next().charAt(0);
				         break;
				 
				 
				 
				 case 2: int max = Arr[0];
				         for(int i=1; i<size; i++)
			             {   
						     if(Arr[i]>max)
							 max=Arr[i];
			             }	
						 System.out.println("The maximum value in the array is "+ max);
				         System.out.println("enter Y to continue in the main menu");
						 ch=scan.next().charAt(0);
						 break;
				 
				 
				 case 3: int min=Arr[0];
				         for(int i=1; i<size; i++)
			             {   
						     if(Arr[i]<min)
							 min=Arr[i];
			             }	
						 System.out.println("The minimum value in the array is "+ min);
				         System.out.println("enter Y to continue in the main menu");
						 ch=scan.next().charAt(0);
						 break;
				 
				 
				 case 4: System.out.println("Enter the element you want to find");
				         int element = scan.nextInt();
						 
						 for(int i=0; i<size; i++)
			             {   
						     if(element==Arr[i])
							 { System.out.println("Given element is in the " +i+ "-index number");
							 break;}
							 
							 if(i==(size-1))
							 System.out.println("Given Element is not available in the array");
			             }
                         System.out.println("enter Y to continue in the main menu");
						 ch=scan.next().charAt(0);						 
				         break;
						 
						 
			    default: System.out.println("Invalid input , Dear !");
			             System.out.println("enter Y to continue in the main menu");
						 ch=scan.next().charAt(0);
			
			}
			
			}while(ch=='Y');
   
   
   
   
   
   
   }








}