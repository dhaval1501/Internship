package Library;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Library {

    LocalDate ld=LocalDate.now();
    LocalTime lt=LocalTime.now();

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter fmd = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    String d=fmd.format(ld);

    String t= fmt.format(lt);
    LocalDate date = LocalDate.parse(d);
    LocalDate rd = date.plusDays(5);
    ArrayList<String> uibl=new ArrayList<>();
    LinkedHashSet<Book> books = new LinkedHashSet<>();
    Library() {
        Book b1 = new Book("Java ", "Kathy Sierra", 4);
        books.add(b1);
        Book b2 = new Book("AI", "Anamitra Deshmukh", 4);
        books.add(b2);
        Book b3 = new Book("ML", "I A Dhotre", 4);
        books.add(b3);
        Book b4 = new Book("Data Mining", "Pranjali Deshpande", 4);
        books.add(b4);
        Book b5 = new Book("Core Java", "Dhaval Dhimar", 4);
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
        String bi1=bi.toLowerCase().trim().replaceAll("\\s", "");

        for (Book b: books){

            String bc= b.b_name;
            String bc1= bc.toLowerCase().trim().replaceAll("\\s", "");

            if (bc1.equals(bi1) & b.quantity>0){
                System.out.println("book isuued on "+ ld +" at "+ t);
                System.out.println("your retune date is " + rd);
                b.quantity--;
//                String ib=bc;
                uibl.add(bc);
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
        String bi1=bi.toLowerCase().trim().replaceAll("\\s", "");

        for (Book b:books){

            String sb=b.b_name.toLowerCase().trim().replaceAll("\\s", "");
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
        String bi1=bi.toLowerCase().trim().replaceAll("\\s", "");

        for (Book b:books){

            String sa=b.author.toLowerCase().trim().replaceAll("\\s", "");

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
        String bi1=bi.toLowerCase().trim().replaceAll("\\s", "");

        for (Book b:books) {

            String rb=b.b_name;
            String rb1=rb.toLowerCase().trim().replaceAll("\\s", "");

            if (rb1.equals(bi1) & b.quantity<4) {
                System.out.println("Book returned on "+ ld +" at "+ t);
                b.quantity++;
//                String rb=b.b_name;
                uibl.remove(rb);
                System.out.println(b);

                return;

            }

        }

        System.out.println("Are u returning wrong book ");
    }

    public void uib(String uname){

        System.out.println( uname +" issued book is " + uibl);
    }


}
