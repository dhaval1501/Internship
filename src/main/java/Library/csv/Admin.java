package Library.csv;

import java.io.IOException;

public class Admin {

    String a_id,a_name,a_password,a_address,a_gender;
    int a_phone;

    Admin(String a_id,String a_password,String a_name,String a_gender,String a_address,int a_phone) throws IOException {
        this.a_id=a_id;
        this.a_password=a_password;
        this.a_name=a_name;
        this.a_gender=a_gender;
        this.a_address=a_address;
        this.a_phone=a_phone;
    }
}
