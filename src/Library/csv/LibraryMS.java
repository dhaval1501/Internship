package Library.csv;


import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class LibraryMS {

    String uname;
    String pass;

    public static void main(String[] args) throws IOException, ParseException {

       LibraryMS libraryMS=new LibraryMS();
       Library library=new Library();
       User user=new User();

        Scanner sc=new Scanner(System.in);

        System.out.println("enter your user name and password");
        libraryMS.uname=sc.nextLine();
        libraryMS.pass=sc.nextLine();

        int i=0;

        if (user.user_check(libraryMS.uname, libraryMS.pass)) {

            while (i == 0) {

                System.out.println("See all books in library enter 1");
                System.out.println("Search books by a Name or Author enter 2");
                System.out.println("Issue a book enter 3");
                System.out.println("Return a book enter 4");
                System.out.println("You want to know how many books you borrowed enter 5");
                System.out.println("For exit enter 6");

                int input = sc.nextInt();

                switch (input) {

                    case 1:
                        library.display_books();

                        break;

                    case 2:
                        library.search_by();

                        break;

                    case 3:

                        library.issue_books();
                        break;

                    case 4:

                        library.return_book();

                        break;
                    case 5:

                        library.book_user_have();
                        break;

                    case 6:

                        i = input;
                        System.out.println("Thanks");
                        break;
                }
            }

        }

        else  {

            System.out.println("Unauthorized user");
        }

    }
}

