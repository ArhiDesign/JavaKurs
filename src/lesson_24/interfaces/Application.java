package lesson_24.interfaces;

public class Application {
    public static void main(String[] args) {

        Book book = new Book("M end M", "B");

        book.print();

        Printable book1 = new Book("F", "E");
        book1.print();

        Presentation presentation = new Presentation("Inheritance","Noname", "Inheritance in OPP",20);

        presentation.print();
        presentation.colorPrint();
    }
}
