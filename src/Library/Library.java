package Library;

import java.util.LinkedHashSet;

public class Library {
    LinkedHashSet<Book> books = new LinkedHashSet<>();
    Library() {
        Book b1 = new Book("java", "dhaval", 4);
        books.add(b1);
        Book b2 = new Book("java1", "dhaval1", 4);
        books.add(b2);
        Book b3 = new Book("java2", "dhaval2", 4);
        books.add(b3);
        Book b4 = new Book("java3", "dhaval3", 4);
        books.add(b4);
        Book b5 = new Book("java4", "dhaval4", 4);
    }

         public void display(){
            for (Book book : books) {
                System.out.println(book);
            }
    }
}



