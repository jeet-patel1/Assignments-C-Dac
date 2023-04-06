import java.util.Scanner;

class TelephoneBill
{
        private String customerName ;
        private String ContactNo ;
        private int numOfCall ;
        private double callDuration ;

        Scanner scan = new Scanner(System.in);
        public void setInfo()
        {
            System.out.println("Enter the customer name , phone nu. , num of calls and duration of calls consecutively.");
           
            this.customerName = scan.nextLine();
            this.ContactNo = scan.nextLine();
            this.numOfCall = scan.nextInt();
            this.callDuration = scan.nextDouble();
        
        }

        public void calculateBill()
        {   
            this.setInfo(); 
            double bill ;
            if( numOfCall > 100 )
            bill = 50 + (this.numOfCall - 100 )*0.25 ;
            else
            bill = this.numOfCall*0.5 ;

            bill = bill + 10 ;
            System.out.println("THe telephonic Bill is : " + bill +" $ ");

        }

    public static void main (String [] args)
    {
        TelephoneBill b1 = new TelephoneBill();
        b1.calculateBill();
    }

}