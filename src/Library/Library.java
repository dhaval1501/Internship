package Library;

import java.util.LinkedHashSet;
import java.util.Scanner;

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

    public void issueBook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a book name");
        String bi=sc.nextLine();

        for (Book b: books){
            String bc= b.b_name;
            if (bc.equals(bi)){
                System.out.println(bc);
                System.out.println("book isuued");
                b.quantity--;
                return;
            }
        }

        System.out.println("book is not av");

    }

    public void search_by_book(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a book name");
        String bi=sc.nextLine();
        String bi1=bi.toLowerCase();
        for (Book b:books){
            if (b.b_name.equals(bi1)) {
                System.out.println(b);
                return;
            }
        }
        System.out.println("not av");
    }
    public void search_by_author(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a author name");
        String bi=sc.nextLine();
        String bi1=bi.toLowerCase();
        for (Book b:books){
            if (b.author.equals(bi1)) {
                System.out.println(b);
                return;
            }
        }
        System.out.println("not av");
    }
}



