package OOP.Inheritance2;

public class JavaBook extends Book {

    public JavaBook (String Title, double price, int pageNumber ){
       super();
    }
  public JavaBook(){

}

    @Override
    public void info() {
        super.info();
    }

    @Override
    public int listen() {
        System.out.println("You are listening Java book");
        return super.listen();
    }

    @Override
    public String toString() {
        return super.toString();
    }



    public static void main(String[] args) {
        Book book = new Book("Blue book", 19.99, 500);
        JavaBook javaBook= new JavaBook();
        javaBook.pageNumber= 400;
        System.out.println(javaBook.pageNumber);
        JavaBook javaBook1= new JavaBook("Java Book",49.99, 400);
        System.out.println(javaBook1.pageNumber);





    }



}
