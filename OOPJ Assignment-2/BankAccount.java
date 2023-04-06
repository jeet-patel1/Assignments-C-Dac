import java.util.Scanner;

class BankAccount
{
      private long  accNo ;
      private String accName ;
      private double balance ;

      static long codeId = 5007050000l ;
    

      Scanner scan = new Scanner(System.in);

      BankAccount()
      {
            this.balance = 0 ;
            codeId += 1 ; 
            this.accNo = codeId ;
      }
    

      public void createAcc(  )
      {     

      
            System.out.print(" Provide your name for the accpunt details \n \n Acc. Holder Name :  ");
            scan.nextLine();
            this.accName = scan.nextLine() ;
            System.out.println("Youe Account No. :  "+ this.accNo +"\n " );
      }

      private boolean verifyAccno()
      {
            System.out.println("Enter the account number ");
            System.out.print("Account No. : ");
            long a = scan.nextLong();
            if( a == this.accNo )
            return true ;
            else
            { 
              if( this.accName ==  null )
              System.out.println("You haven't created account yet.");
              else
              System.out.println("Given Account number is wrong !!! ");
              return false ;
            }
      }

      public void deposit( )
      {
            
            if( this.verifyAccno())
           { 
             System.out.print("Amount to be deposited : ");
             double d = scan.nextDouble();
             this.balance += d ;
             System.out.println(d +" Rs. added into the account no. "+this.accNo+ " successfully !!");
           }
            
      }

      public void withdraw(  )
      {     
            if( this.verifyAccno())
           { 
            
            System.out.print("Amount to be withdrawn : ");
            double d = scan.nextDouble();    
            if(d >= this.balance)
            {this.balance -= d ;
            System.out.println(d +" Rs. withdrawn from the account no. "+this.accNo+ " successfully !!");
            }
            else
            System.out.println(" Amount is insufficient to be withdrawn !!!");

           }

      }

      public void showBalance()
      {     
            if( this.verifyAccno() )
            System.out.print("Balance : " + this.balance );
      }


      public void accInfo()
      {
            if( this.verifyAccno())
            {
                System.out.println(" Account Holder Name : " + this.accName );
                System.out.println(" Account Balance : " + this.balance );
            }

      }

      public void menuList()
      {
             boolean choice = true ;
             while ( choice )
             {
                  System.out.println(" Press     Discription \n    1      To create a new account \n    2      To deposit the money\n    3      To withdraw money\n    4      To Show Balance\n    5      To Show Account Holder Info.\n    0      To Exit");
                  int option = scan.nextInt();
                  switch ( option )
                  {
                         case 1 : this.createAcc();
                                  break ;

                         case 2 : this.deposit();
                                  break ;

                         case 3 : this.withdraw();
                                  break ;

                         case 4 : this.showBalance();
                                  break ;

                         case 5 : this.accInfo();
                                  break ;

                         case 0 : choice = false ;
                                  break ; 

                        default : System.out.println("Invalid  Responce !!  Try again ..."); 
                                          

                  } 



             }
      }



      // entry point method 
      public static void main(String[] args)
      {
              
            BankAccount b1 = new BankAccount();
            b1.menuList();


            



      }











}