import java.util.Scanner ;

class TollBoothBill
{
     String vehicleType ;
     int numOfAxles ; 
     double distancetravelled ;
     private double  tollFee , totalAmountdue ; 

     Scanner scan = new Scanner(System.in);

     // menu option  using switch 
     public void showMenu()
     {    boolean choice = true ;
          while (choice)
          {
                System.out.println("Press   Discription \na. Enter vehicle type (car, van, bus, or truck)\nb. Enter number of axles\nc. Enter distance travelled\nd. Calculate toll fee\ne. Generate bil\nf. Exit");
                char option = scan.next().charAt(0);
                switch( option )
                {
                    case 'a' :  System.out.println("Enter the vehicle Type\n 1. Car\n2. Bus\n 3. Van\n 4. Truck");
                              
                              String x = scan.next();
                              if( x.equals("Car") || x.equals("Van")||x.equals("Bus")||x.equals("Truck") )
                              this.vehicleType=x;
                              else 
                              System.out.println("Put The Right spelled vehicle name ");
                              break ;
                              
                    case 'b' :  System.out.println("Enter the number of axles ");
                              this.numOfAxles = scan.nextInt();
                              break ;
                              
                    
                    case 'c' :  System.out.println("Enter the number of distance travelled ");
                              this.distancetravelled = scan.nextInt();
                              break ;

                    case 'd' : this.calculateTollFee() ;
                             break ;

                    case 'e' : this.generateBill() ;
                             break ;

                    case 'f' : choice = false ;
                             break ;

                    default : System.out.println(" Invalid choice !! Please try Again...");            
               }
          }
     }


     // method for calculating the toll fee 
     public void calculateTollFee()
     {
        
        if( this.vehicleType == "Car" || this.vehicleType == "Van" || this.vehicleType == "Bus")
        this.tollFee = 0.25*this.distancetravelled*this.numOfAxles ;
        else
        this.tollFee = 0.5*this.distancetravelled*this.numOfAxles ;

        System.out.println("Toll fee for "+ this.vehicleType +" as per travelled distance  "+this.distancetravelled+ " mile for "+this.numOfAxles+" is "+ this.tollFee) ;
     }


     // method for generating the bill
     public void generateBill()
     {
          this.totalAmountdue = 2 + this.tollFee ;
          System.out.println( "Vehicle Type : "+this.vehicleType+"\n Number Of Axles : "+this.numOfAxles+"\n Distance Travelled : "+this.distancetravelled+"\n Toll Fee : "+this.tollFee+"\n Total Amount Due : "+this.totalAmountdue) ;

     }


     public static void main(String[] args)
     {
             TollBoothBill tb = new TollBoothBill();
             tb.showMenu();


     }



}