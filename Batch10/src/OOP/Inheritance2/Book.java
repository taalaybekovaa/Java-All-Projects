package OOP.Inheritance2;

public class Book {

    String title;
    double price;
    int pageNumber;

    public Book(String title, double price, int pageNumber) {
        this.title = title;
        this.price = price;
        this.pageNumber = pageNumber;
    }

    public void info(){
        System.out.println(title+"---"+price+"---"+pageNumber);
    }
    public int listen() {
        System.out.println("Ypu are listening the book");
        return pageNumber--;
    }
    public Book(){

    }
        }


