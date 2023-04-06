import java.util.Scanner;

class BookInventory{

    private String title , author , publisher , isbn ;
    private int year , quantity ;
    private double price ;

     Scanner scan = new Scanner(System.in);
    // constructors
    BookInventory()
    {    
        this("Core Java Mastery in 17 days "," Jeet Patel (renowned Java God )"," Pritesh bhai bhajiyawala & sons. co. ltd.","121314-POPOYA-96", 2004 ,10000 ,1699 );
    }
    BookInventory( String title ,String author , String publisher , String isbn , int year ,int quantity ,double price  )
    {     
          this.title=title;
          this.author=author;
          this.publisher=publisher;
          this.isbn=isbn;
          this.year=year;
          this.price=price;
          this.quantity=quantity;
    }


    // setters
    public void setTitle( String title )
    {
        this.title=title;
    }

     public void setAuthor( String author )
    {
        this.author=author;
    }

     public void setPublisher( String publisher )
    {
        this.publisher=publisher;
    }

     public void setIsbn( String isbn )
    {
        this.isbn=isbn;
    }

     public void setYear( int year )
    {
        this.year=year;
    }

     public void setPrice( double price )
    {
        this.price=price;
    }

     public void setQuantity( int quantity )
    {
        this.quantity=quantity;
    }



    // getters
     public String getTitle()
    {
         return this.title;
    }

     public String getAuthor()
    {
         return this.author;
    }

     public String getPublisher()
    {
        return this.publisher;
    }

     public String getIsbn()
    {
       return this.isbn;
    }

     public int getYear()
    {
        return this.year;
    }

     public double getPrice()
    {
        return this.price;
    }

     public int getQuantity()
    {
        return this.quantity;
    }

    

    // Business Logic methods
    public void increaseQuantity(int quantity )
    {
        this.quantity+=quantity;
    }

    public void decreaseQuantity(int quantity)
    {
        this.quantity-=quantity;
    }

    public double getInventoryValue()
    {   
        return this.price*this.quantity;
    }

    public void menuList()
    {   boolean choice = true ;
        while ( choice  ) 
        {
        System.out.println(" select      Discription n");
        System.out.println("   1         To Set the information of Book Inventory\n   2         To get the current info. of inventory \n   3         To increase the book quantity\n   4         To decrease the book quantity\n   5         To get the current inventory value\n   6         To exit the program");
        
        int option = scan.nextInt();

        switch( option )
        {
            case 1 :  System.out.print( " Title : " );
                      scan.nextLine();
                      String s = scan.nextLine();
                      this.setTitle(s);

                      System.out.print( " Author : ");
                      s = scan.nextLine();
                       this.setAuthor(s);

                      System.out.println( " Publisher : ");
                      s = scan.nextLine();
                      this.setPublisher(s);

                      System.out.println( " Isbn : ");
                      s = scan.nextLine();
                      this.setIsbn(s);


                      System.out.println( " Year : ");
                      int x = scan.nextInt();
                      this.setYear(x);

                      System.out.println( " Price : ");
                      double d = scan.nextDouble();
                      this.setPrice(d);

                      System.out.println( " Quantity : ");
                      x = scan.nextInt();
                      this.setQuantity(x);

                      choice = true ;
                      break ;
            
            case 2 :  System.out.println( " Title : " + getTitle() );
                      System.out.println( " Author : "+ getAuthor());
                      System.out.println( " Publisher : "+ getPublisher());
                      System.out.println( " Isbn : "+ getIsbn());
                      System.out.println( " Year : "+ getYear());
                      System.out.println( " Price : "+ getPrice());
                      System.out.println( " Quantity : "+ getQuantity());
                      choice = true ;
                      break ;
            
            case 3 :  System.out.print("How many books do you want to add ? :  ");
                      int added = scan.nextInt();
                      increaseQuantity( added );
                      System.out.println(added + " new books where added. ");
                      choice = true ;
                      break ;
                     
            case 4 :  System.out.print("How many books do you want to remove ? :  ");
                      int remove = scan.nextInt();
                      decreaseQuantity( remove );
                      System.out.println( remove  + " books where removed. ");
                      choice = true ;
                      break ;
            
            case 5 :  System.out.println("The current Book inventory value is "+ getInventoryValue() +" in rupees.");
                      choice = true ;
                      break ;

            case 6 :  choice = false ;
                      break ;         
        
            default : System.out.println(" Illegal choice !!!\n  Please choose again ...");
                           choice = true ;
                      
            }
        }
    
    }



    // entry point method
    public static void main (String[] args)
    {
         BookInventory b1 = new BookInventory();
         b1.menuList();

    }

}