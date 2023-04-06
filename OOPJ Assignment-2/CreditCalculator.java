import java.util.Scanner ;

class CreditCalculator
{
     
int creditHistory ;
double creditUtilization ;
boolean paymentHistory ;

CreditCalculator()
{
    this.creditHistory = 0 ;
    this.creditUtilization = 0 ;
    this.paymentHistory = true ; 
}


// setters method
public void setcreditHistory( int x )
{
     this.creditHistory = x ;
}
public void setCreditUtilization(double d )
{
    this.creditUtilization=d ;
}
public void setpaymentHistory( boolean b)
{
    this.paymentHistory=b ;
}


// getters method
public int getcreditHistory()
{
    return this.creditHistory ;
}
public double getcreditUtilization()
{
    return this.creditUtilization ;
}
public boolean getpaymentHistory()
{
    return this.paymentHistory ;
}

// method to calculate the credit score
public int calculateCreditScore()
{   
    int creditScore ;
    if(this.paymentHistory)
    creditScore = (this.creditHistory*15)+(int)(this.creditUtilization*30)+55 ;
    else
    creditScore = (this.creditHistory*15)+(int)(this.creditUtilization*30)+35 ;
  return creditScore ;

}


// Entry point method
public static void main(String [] args)
{
    CreditCalculator c = new CreditCalculator();
    c.setcreditHistory(23);
    c.setCreditUtilization(57.8);
    c.setpaymentHistory(false);

    System.out.println("the ctredit score is : "+ c.calculateCreditScore() );  

}



}