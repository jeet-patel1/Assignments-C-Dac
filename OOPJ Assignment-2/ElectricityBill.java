import java.util.Scanner;

class ElectricityBill{

        private String customerName ; 
        private double unitsconsumed , billAmount ;
        
        Scanner scan = new Scanner(System.in);
        ElectricityBill()
        {
              this( "PoPoya Vroom " , 100 );
        }

        ElectricityBill( String customerName , double unitsconsumed )
        {
            this.customerName=customerName;
            this.unitsconsumed=unitsconsumed;
        }

        private void setUnitsConsumed( int  unitsconsumed )
        {
            this.unitsconsumed = unitsconsumed;
        }


        public void calculateBillAmount()
        {    
            
             System.out.println(" Enter the units consumed ");
             int x = scan.nextInt();
             this.setUnitsConsumed(x);
             
             if( this.unitsconsumed < 0 )
             this.unitsconsumed = -this.unitsconsumed ;

             if(this.unitsconsumed >= 300)
             this.billAmount = 1900 + (this.unitsconsumed-300)*10;
             else if ( this.unitsconsumed <= 100 )
             this.billAmount = 100*this.unitsconsumed;
             else
             this.billAmount = 500 + ( this.unitsconsumed - 100 )*7 ;
        

        System.out.println(" Customer name : " + this.customerName);
        System.out.println(" Units Consumed  : " + this.unitsconsumed);
        System.out.println(" Bill Amount : " + this.billAmount);
        
        }



        public static void main( String [] args ) 
        {

              ElectricityBill e1 = new ElectricityBill ( " Lendy Gaga" , 420 );
              e1.calculateBillAmount();


        }






}