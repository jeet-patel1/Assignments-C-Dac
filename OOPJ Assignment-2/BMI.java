import java.util.Scanner;
class BMI
{
       private double height ;
       private double weight ;
       Scanner scan = new Scanner(System.in);

       // constructor
       BMI(){
            System.out.println("Inside constructor");

       }
       BMI(double h , double w)
       {   
           this.height=h;
           this.weight=w;
       }
       
    // getters method
       public double getHeight()
       {
             return this.height;
       }

       public double getWeight()
       {
             return this.weight;
       }

    // setters methods
       public void setHeight()
       {     System.out.println("Enter your height in meter.");
             this.height= scan.nextDouble();
       }
       public void setWeight()
       {     System.out.println("Enter your weight in kg.");
             this.weight=scan.nextDouble();
       }

    // BMI calculate method
    public void calculateBMI()
    {
        double bmi=this.getWeight()/(this.getHeight()*this.getHeight()) ;
        System.out.println("Your BMI as per given  height "+this.height+" and weight "+this.weight+" is: "+bmi);
    }


    // entry point method 
    public static void main(String[] args)
    {
          BMI person1 = new BMI();
          person1.setHeight();
          person1.setWeight();
          person1.calculateBMI();





    } 
}