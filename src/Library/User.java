package Library;

import java.util.ArrayList;

public class User {
    String u_name,password;
    ArrayList<User> users=new ArrayList();

    User(String u_name,String password){
        this.u_name=u_name;
        this.password=password;
    }

    User (){
        User u1=new User("dhaval","dhaval123");
        users.add(u1);
        User u2=new User("dhaval1","dhaval1123");
        users.add(u2);
        User u3=new User("dhaval2","dhaval2123");
        users.add(u3);
        User u4=new User("dhaval3","dhaval3123");
        users.add(u4);
        User u5=new User("dhaval4","dhaval4123");
        users.add(u5);
    }

    @Override
    public String toString() {
        return
                u_name +" "+ password ;
    }

    LibraryMS lms1=new LibraryMS();

    public boolean check() {
        for (User user : users) {
            String u=u_name;
            String p=password;
            if(u==lms1.uname & p==password ){
                return true;
            }
        }
        return false;
    }


}
