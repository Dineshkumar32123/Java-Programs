public class Bag {
    String bag_color;
    int bag_price;
     Book b;
    Bag(String color,int price){
        this.bag_color=bag_color;
        this.bag_price=bag_price;
    }
    public  void addBook(String book_name,int book_id,int book_price){
//        System.out.println("Book is adding...");
        b=new Book(book_name,book_id,book_price);
        System.out.println("Book added successfully...");
    }
    public void removebook(){
        b=null;
        System.out.println("Book removed...");
    }
    public void getBookName(){
        System.out.println("The name of the book is: "+b.book_name);
    }
}