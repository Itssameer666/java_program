//Create a class Book with title, author, and price. Create three objects and display all book details.
class Book{
void display(String title,String author,int price) {
    System.err.println("Title ="+title);
    System.err.println("Author ="+author);
    System.err.println("Price ="+price);
     
 }

}
public class ClassDemo1 {
    public static void main(String[] args) {
     Book b1=new Book();
     Book b2=new Book();
     Book b3=new Book();
     b1.display("Indumati", "Kishorilal goshwomi",299);
     b2.display("Godan", "Munsi premchand",199);
     b3.display("Gaban", "Munsi premchand",299);  
    }
    
}
