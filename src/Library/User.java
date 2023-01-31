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

    public boolean check(String uname,String pass) {
        for (User user : users) {
            String u=user.u_name;
            String p=user.password;
            if(u.equals(uname) & p.equals(pass)) {
                return true;
            }
        }
        return false;
    }

}
