package Library;

import java.util.Scanner;
//search by name
//search by author
//issue book
//return book

public class LibraryMS {

    String uname;
    String pass;

    public static void main(String[] args) {

        LibraryMS lms=new LibraryMS();
        Library l=new Library();
        User u=new User();

        Scanner sc=new Scanner(System.in);

        System.out.println("enter your user name and password");
        lms.uname=sc.nextLine();
        lms.pass=sc.nextLine();

        int i=0;

        if (u.check(lms.uname, lms.pass)) {

            while (i == 0) {

                System.out.println("See all books in library enter 1");
                System.out.println("Search books by a Name or Author enter 2");
                System.out.println("Return a book enter 3");
                System.out.println("Issue a book enter 4");
                System.out.println("For exit enter 5");

                int input = sc.nextInt();

                switch (input) {

                    case 1:

                        l.display();
                        System.out.println("Issue a book enter 1");
                        System.out.println("For go back enter 2");
                        input = sc.nextInt();

                        switch (input) {

                            case 1:
                                l.issueBook();
                                break;
                            case 2:
                                break;
                        }

                        break;

                    case 2:

                        System.out.println("For search by Name enter 1");
                        System.out.println("For search by Author enter 2");
                        input = sc.nextInt();

                        switch (input) {

                            case 1:
                                l.search_by_book();
                                break;
                            case 2:
                                l.search_by_author();
                                break;
                        }

                        break;

                    case 3:

                        l.returnBook();
                        break;

                    case 4:

                        l.issueBook();
                        break;

                    case 5:

                        i = input;
                        System.out.println("thanks");
                        break;
                }
            }

            l.uib(lms.uname);
        }

        else  {

            System.out.println("unauthorized user");
        }

    }
}
