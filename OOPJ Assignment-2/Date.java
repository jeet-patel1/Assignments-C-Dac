import java.util.Scanner ;

class Date 
{
    int day , month , year ;

    Date( int day , int month , int year )
    {
           this.day=day ;
           this.month=month ;
           this.year=year ;
    }

    public boolean isValid()
    {
        if ( this.month <= 12 && this.month > 0 && this.year > 0)
        {   int t = this.month ;
            if( t==1 || t==3 || t==5 || t==7 || t==8 || t==10 || t==12 )
            {  if(this.day == 31 ) 
               return true ;
               else 
               return false ;
            } 
            else if ( t ==4 || t==6 || t==9 || t==11 )
            {  
               if (this.day == 30 ) 
               return true ;
               else  
               return false ;
            }
            else 
            { 
              if(this.isLeapYear())
              { 
                if(this.day == 29 ) return true ;
                else return false ;}
              else
              { if(this.day == 28 ) return true ;
                else return false ;}
            }
        }
        else 
        return false ; 
    }

    public boolean isLeapYear()
    { 
      
         if(this.year % 100 == 0 )
         {

            if( this.year % 400 == 0)
            { 
            System.out.println(" Given Year "+ this.year +" is a leap year ");
            return true ;
            }
            else 
            {
            System.out.println(" Given Year "+ this.year +" is a Not a leap year ");
            return false ;
            }

         }
         else 
         {

            if( this.year % 4 == 0 )
            {
            System.out.println(" Given Year "+ this.year +" is a leap year ");
            return true ;
            }
            else 
            { 
            System.out.println(" Given Year "+ this.year +" is a Not a leap year ");
            return false ; 
            }

         }
        
         
    }


    public void getNextDay()
    {    int t = this.month ;
         int day = this.day , month = this.month , year = this.year ;
         if( t==1 || t==3 || t==5 || t==7 || t==8 || t==10 || t==12 )
         {
               if( this.day <= 30 )
               day++ ;
               else
               {
                    if( this.month == 12 )
                    { 
                      month = 1 ;
                      day = 1 ;
                      year++ ;
                    }
                    else
                    {
                        day = 1 ;
                        month = 1 ;
                    }
               }
         }
         else if (  t ==4 || t==6 || t==9 || t==11 )
         {
                   if ( this.day <= 29 )
                   day++ ;
                   else
                   {
                        day = 1 ;
                        month++ ;
                   }


         }
         else
         {
                   if ( this.day <= 27 )
                   day++ ;
                   else
                   {
                        day = 1 ;
                        month++ ;
                   }
         }
         System.out.printf("The next day Date is : ");
         System.out.printf("%2d / %2d / %4d ",day , month , year );
    }




    public void getPreviousDay()
    {    int t = this.month ;
         int day = this.day , month = this.month , year = this.year ;
         if( t==1 || t==3 || t==5 || t==7 || t==8 || t==10 || t==12 )
         {
               if( this.day != 1 )
               day-- ;
               else
               {
                    if( this.month == 1 )
                    { 
                      month = 12 ;
                      day = 31 ;
                      year-- ;
                    }
                    else
                    {
                       if( this.month == 3 )
                       {
                           if( this.isLeapYear())
                           {
                              day = 29 ;
                              month-- ;
                           }
                           else
                           {
                            day = 28 ;
                           month-- ;
                           }
                       }
                       else if ( this.month == 8 )
                       {
                           day = 31 ;
                           month-- ;
                       }
                       else 
                       {
                           month-- ;
                           day = 30 ;
                       }
                    }
               }
         }
         else if (  t ==4 || t==6 || t==9 || t==11 )
         {
                   if ( this.day == 1 )
                   {
                          day=31 ;
                          month--;
                   }
                   else
                   {
                        day-- ;
                   }


         }
         else
         {
                   if ( this.day == 1 )
                   {   
                         day=31 ;
                         month-- ;
                   }
                   else
                   day-- ;
         }
         System.out.printf("The Previous day Date is : ");
         System.out.printf("%2d / %2d / %4d ",day , month , year );
    }



    // Entry point method
    public static void main( String[] args )
    {
    Date d1 = new Date(1,1,1998);
    d1.getPreviousDay();
    d1.getNextDay();
    }
}