public class Bag {
    String color;
    double bprice;
    Book b; //has a relationship

    Bag(String color,double bprice)
    {
        this.color=color;
        this.bprice=bprice;
    }

    //adding book
    public void addBook(String bname,int bid,double price) throws Exception
    {
        b = new Book( bname,bid, price);
        System.out.println("Book adding!....");
        Thread.sleep(1000);
        System.out.println("Book added successfully!!!..");
    }

    //removing book
    public void removeBook() throws Exception
    {
        b = null;
        System.out.println("Book removing!....");
        Thread.sleep(1000);
        System.out.println("Book removed successfully!!.");
    }

    //get book name
    public void getBookName() throws Exception
    {
        System.out.println("*****data fetching from server!....*****");
        Thread.sleep(1000);
        System.out.println("Book Name: " + b.bname);
    }

}