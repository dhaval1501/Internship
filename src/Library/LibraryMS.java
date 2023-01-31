package Library;

import java.util.LinkedHashSet;
import java.util.Scanner;
//search by name
//search by author
//issue book
//return book
public class LibraryMS {

    public static void main(String[] args) {
        Library l=new Library();

        int i=0;
        Scanner sc=new Scanner(System.in);

        while (i==0) {
            System.out.println("See all books in library enter 1");
            System.out.println("Search book by a Name or Author enter 2");
            System.out.println("Return a book enter 3");
            System.out.println("For exit enter 4");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    l.display();
                    System.out.println("Issue a book enter 1");
                    System.out.println("For go back enter 2");
                    input=sc.nextInt();
                    switch (input){
                        case 1:
                            System.out.println("thanks");
                            break;
                        case 2:
                            System.out.println("t");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("For search by Name enter 1");
                    System.out.println("For search by Author enter 2");
                    input=sc.nextInt();
                    switch (input){
                        case 1:
                            System.out.println("book by name");
                            break;
                        case 2:
                            System.out.println("book by author");
                            break;
                    }
                break;
                case 3:
                    System.out.println("book returned");
                break;
                case 4:
                    i=input;
                    System.out.println("thanks");
                break;
            }
        }

    }
}
