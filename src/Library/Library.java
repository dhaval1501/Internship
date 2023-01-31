package Library;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Library {

    ArrayList<String> uibl=new ArrayList<>();
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

            if (bc.equals(bi) & b.quantity>0){
                System.out.println("book isuued");
                b.quantity--;
                String ib=bc;
                uibl.add(ib);
                System.out.println(b);
                return;
            }
        }

        System.out.println("Book is not available");

    }


    public void search_by_book(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a book name");
        String bi=sc.nextLine();
        String bi1=bi.toLowerCase().replaceAll("\\s", "");;;

        for (Book b:books){

            String sb=b.b_name.toLowerCase().trim();
            if (sb.equals(bi1)) {
                System.out.println(b);
                return;
            }

        }

        System.out.println("Book not available");

    }


    public void search_by_author(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a author name");
        String bi=sc.nextLine();
        String bi1=bi.toLowerCase().replaceAll("\\s", "");;

        for (Book b:books){

            String sa=b.author.toLowerCase().trim();

            if (sa.equals(bi1)) {
                System.out.println(b);
                return;
            }

        }

        System.out.println("not available");

    }


    public void returnBook(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book name");
        String bi=sc.nextLine();
        String bi1=bi.toLowerCase();

        for (Book b:books) {

            if (b.b_name.equals(bi1) & b.quantity<5) {
                System.out.println("book returned");
                b.quantity++;
                String rb=b.b_name;
                uibl.remove(rb);
                System.out.println(b);
                return;

            }

        }

        System.out.println("Are u returning wrong book ");
    }

    public void uib(String uname){
        System.out.println(uname +" issued book is " + uibl);
    }


}

