package Library.csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User {

    String line1 = "";
    String[] data1;

    public static String login_id;
    public static String login_name;

    String u_id,u_name,password,u_address,gender;
    int phone;

    ArrayList<User> users=null;
    BufferedReader read_uses_csv = null;

    Library l=new Library();

    User() throws IOException {}

    User(String u_id,String password,String u_name,String gender,String u_address,int phone) throws IOException {
        this.u_id=u_id;
        this.password=password;
        this.u_name=u_name;
        this.gender=gender;
        this.u_address=u_address;
        this.phone=phone;
    }

    @Override
    public String toString() {

        return "User ID='" + u_id + '\'' +
                ", User=" + u_name + '\''+
                ", Gender='" + gender + '\'' +
                ", Address='" + u_address + '\'' +
                ", Phone=" + phone ;
    }

    public void display_users() throws IOException {

        read_uses_csv=new BufferedReader(new FileReader("users.csv"));

        System.out.println("----------------------------------------------------------------");

        System.out.println("User Id       User Name         Gender     Address      phone");

        while ((line1 = read_uses_csv.readLine()) != null) {

            data1 = line1.split(",");
            System.out.printf("%-13s %-20s %-7s %-12s %-10s \n", data1[0], data1[2], data1[3],data1[4],data1[5]);

        }
        read_uses_csv.close();

        System.out.println("----------------------------------------------------------------");
    }

    public boolean user_check(String u_id,String password) throws IOException {

        read_uses_csv=new BufferedReader(new FileReader("users.csv"));

        while ((line1 = read_uses_csv.readLine()) != null) {

            data1 = line1.split(",");

            String u=data1[0];
            String p=data1[1];

            login_id=data1[0];
            login_name=data1[2];

            if(u.equals(u_id) & p.equals(password)) {

                read_uses_csv.close();
                return true;

            }

        }

        read_uses_csv.close();
        return false;

    }



//    public static void main(String[] args) throws IOException {
//        User u=new User();
//        u.display_users();
//        Scanner sc= new Scanner(System.in);
//        System.out.println("u_id and pass");
//        String id=sc.nextLine();
//        String pass= sc.nextLine();
//        if (u.user_check(id,pass)){
//            System.out.println("authorieze");
//        }
//        else {
//            System.out.println("not");
//        }

//    }


}


