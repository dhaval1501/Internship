package Library.csv;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Library {

     String line = "";
     String[] data;

     String line2="";
     String[] data2;

    String line3="";
    String[] data3;

     String r_id,r_name,r_b_id,r_b_name,r_a_name,i_date,due_date;
     String id,b_name,author;
     int a_quantity,t_quantity;

    LocalDate local_date=LocalDate.now();
    LocalTime local_time=LocalTime.now();
//    LocalDate id;
//    String td;

    DateTimeFormatter format_t = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter format_d = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter format_rd = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    String date=format_d.format(local_date);
    String time= format_t.format(local_time);

    LocalDate date1 = LocalDate.parse(date);
    LocalDate return_date = date1.plusDays(5);
    String r_date=format_rd.format(return_date);

//    User user=new User();
    LinkedHashSet<Book> books = null;
    ArrayList<String> issued_csv=null;
    ArrayList<IssuedBook> issuedBooks_a=null;

    //    Library() {
//        Book b1 = new Book(1,"Java","Dhaval",4);
//        books.add(b1);
//        Book b2 = new Book(2,"Java1","Dhaval1",4);
//        books.add(b2);
//    }
    BufferedReader books_csv = null;
    BufferedWriter writer_book_csv=null;
    BufferedWriter append_issued_book=null;
    BufferedReader read_issued_book=null;
    BufferedWriter write_issued_book=null;



    public Library() throws IOException {}

//    public void writeBookCsv() throws FileNotFoundException {
//
//        PrintWriter out = new PrintWriter(books_csv);
//
//        for (Book book : books) {
//            out.println(book.b_id+","+book.b_name+","+book.author+","+book.quantity);
//            out.println(book);
//        }
//        out.close();
//    }

//    public void readBookCsv() throws IOException {
//        String line="";
//        while ((line= String.valueOf(books_csv.readLine())) !=null){
//            String[] data=line.split(",");
//        }
//    }

    public void display_books() throws IOException {

        books_csv=new BufferedReader(new FileReader("books.csv"));

        System.out.println("-----------------------------------------------------------");

        System.out.println("Book Name       Author Name       Quantity");

        while ((line = books_csv.readLine()) != null) {

            data = line.split(",");
            System.out.printf("%-15s %-20s  %-15s \n", data[1], data[2], data[3]);

        }
        books_csv.close();

        System.out.println("-----------------------------------------------------------");
    }

    public void search_by() throws IOException {

        books_csv=new BufferedReader(new FileReader("books.csv"));

        int count=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a book name or author name");
        String book_a_name = sc.nextLine();

        String book_a_name1 = book_a_name.toLowerCase().trim().replaceAll("\\s", "");


        System.out.println("-----------------------------------------------------------");

        System.out.println("Book Name       Author Name       Quantity");

        while ((line = books_csv.readLine()) != null) {

            data = line.split(",");
            String search_book = data[1].toLowerCase().trim().replaceAll("\\s", "");
            String search_author = data[2].toLowerCase().trim().replaceAll("\\s", "");

            if (search_book.contains(book_a_name1) || search_author.contains(book_a_name1)) {

                System.out.printf("%-15s %-20s  %-15s \n",data[1],data[2],data[3]);
                count++;
            }

        }

        if (count==0){

            System.out.println("Book not found");
        }
        books_csv.close();

        System.out.println("-----------------------------------------------------------");

    }

    public void issue_books() throws IOException {

        books=new LinkedHashSet<>();

        int count=0;
        books_csv=new BufferedReader(new FileReader("books.csv"));
        append_issued_book=new BufferedWriter(new FileWriter(new File("issuedbooks.csv"),true));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a book name");
        String book_name = sc.nextLine();

        String book_name1 = book_name.toLowerCase().trim().replaceAll("\\s", "");

        System.out.println("-----------------------------------------------------------");

        while ((line = books_csv.readLine()) != null) {

//            User u=new User();
            data = line.split(",");

            id=data[0];
            b_name=data[1];
            author=data[2];
            a_quantity=Integer.parseInt(data[3]);
            t_quantity=Integer.parseInt(data[4]);

            Book b1=new Book(id,b_name,author,a_quantity,t_quantity);
            books.add(b1);
            String bc= b1.b_name;
            String bc1= bc.toLowerCase().trim().replaceAll("\\s", "");

            if (bc1.equals(book_name1) & b1.a_quantity>0) {
                System.out.println("Book issued on "+ local_date +" at "+ time);
                System.out.println("your return date is " + return_date);
                count++;
                b1.a_quantity--;
                System.out.println(b1);

                append_issued_book.write(User.login_id+","+User.login_name+","+id+","+b_name+","+author+","+date+","+r_date+"\n");
                append_issued_book.close();

            }

        }

        books_csv.close();

        writer_book_csv= new BufferedWriter(new FileWriter("books.csv"));

        for (Book book:books){

            writer_book_csv.write(book.b_id+","+book.b_name+","+book.author+","+book.a_quantity+","+book.t_quantity+"\n");
        }

        writer_book_csv.close();


        if(count==0){

            System.out.println("Book is not available");
        }

        System.out.println("-----------------------------------------------------------");

    }

    public void return_book() throws IOException, ParseException {

        books=new LinkedHashSet<>();
        issued_csv=new ArrayList<>();
        issuedBooks_a=new ArrayList<>();

        int count=0;
        read_issued_book=new BufferedReader(new FileReader("issuedbooks.csv"));
        books_csv=new BufferedReader(new FileReader("books.csv"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a book name");
        String book_name = sc.nextLine();

        String book_name1 = book_name.toLowerCase().trim().replaceAll("\\s", "");

        System.out.println("-----------------------------------------------------------");



        while ((line = books_csv.readLine()) != null) {

            data = line.split(",");

            id=data[0];
            b_name=data[1];
            author=data[2];
            a_quantity=Integer.parseInt(data[3]);
            t_quantity=Integer.parseInt(data[4]);

            Book b1=new Book(id,b_name,author,a_quantity,t_quantity);
            books.add(b1);
            String bc= b1.b_name;
            String bc1= bc.toLowerCase().trim().replaceAll("\\s", "");

            if (bc1.equals(book_name1) & b1.a_quantity<t_quantity) {
                System.out.println("Book returned "+ local_date +" at "+ time);
                count++;
                b1.a_quantity++;
                System.out.println(b1);
            }

        }
        books_csv.close();

        writer_book_csv= new BufferedWriter(new FileWriter("books.csv"));

        for (Book book:books){

            writer_book_csv.write(book.b_id+","+book.b_name+","+book.author+","+book.a_quantity+","+ book.t_quantity+"\n");
        }

        writer_book_csv.close();

        while ((line2=read_issued_book.readLine()) !=null){

//            User u=new User();

            data2=line2.split(",");

            r_id=data2[0];
            r_name=data2[1];
            r_b_id=data2[2];
            r_b_name=data2[3];
            r_a_name=data2[4];
            i_date=data2[5];
            due_date=data2[6];

            IssuedBook iBook=new IssuedBook(r_id,r_name,r_b_id,r_b_name,r_a_name,i_date,due_date);
            issuedBooks_a.add(iBook);




            String r_book=r_b_name.toLowerCase().trim().replaceAll("\\s", "");

            if(r_id.equals(User.login_id) & r_book.equals(book_name1) ){

                LocalDate localDate = LocalDate.parse(due_date);

                if (return_date.isAfter(localDate)){

                    System.out.println("You are returning late you have to pay 500 penalty");
                }

                issuedBooks_a.remove(iBook);
            }

        }

        read_issued_book.close();

        write_issued_book= new BufferedWriter(new FileWriter("issuedbooks.csv"));

        for (IssuedBook ib:issuedBooks_a){

            write_issued_book.write(ib.r_id1+","+ib.r_name1+","+ib.r_b_id1+","+ib.r_b_name1+","+ib.r_a_name1+","+ib.i_date1+","+ib.due_date1+"\n");
        }

        write_issued_book.close();


        if(count==0){

            System.out.println("Are you returning wrong book ");
        }

        System.out.println("-----------------------------------------------------------");

    }

    public void book_user_have() throws IOException {

        read_issued_book=new BufferedReader(new FileReader("issuedbooks.csv"));

        int count=0;

        System.out.println("-----------------------------------------------------------");

        System.out.println("User ID    User Name      Book ID     Book Name    Author Name     Issued Date     Due Date");

        while ((line3 = read_issued_book.readLine()) != null) {

            data3 = line3.split(",");
            String s_u_id=data3[0];

            if (s_u_id.equals(User.login_id)) {

                System.out.printf("%-10s %-17s %-10s %-10s %-15s %-15s %-15s \n",data3[0],data3[1],data3[2],data3[3],data3[4],data3[5],data3[6]);
                count++;
            }

        }

        if (count==0){

            System.out.println("You not borrowed any books");
        }
        read_issued_book.close();

        System.out.println("-----------------------------------------------------------");

    }



//    public static void main (String[]args) throws IOException {
//        Library l = new Library();
//        l.book_user_have();
//            l.writeBookCsv();
//            l.readBookCsv();
//        l.search_by();
//        l.issue_books();
//        l.display_books();
//        l.return_book();
//        l.display_books();

//
//        Scanner sc= new Scanner(System.in);
//
//        int i=0;
//        while (i==0) {
//            System.out.println("1 or 2 ,3");
//            int c= sc.nextInt();
//
//            switch (c) {
//                case 1:
//                    l.issue_books();
//                    break;
//                case 2:
//                    l.display_books();
//                    break;
//                case 3:
//                    i=1;
//                    break;
//
//            }
//        }




//    }
}
