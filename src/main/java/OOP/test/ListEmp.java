package OOP.test;

import java.util.ArrayList;

public class ListEmp {
    public static void main(String[] args) {

        ArrayList<Emp> empList=new ArrayList<>();

        Emp e1=new Emp(1,"dhaval",15000);
        empList.add(e1);
        Emp e2=new Emp(1,"dhaval1",8000);
        empList.add(e2);
        Emp e3=new Emp(1,"dhaval2",9000);
        empList.add(e3);
        Emp e4=new Emp(1,"dhaval3",11000);
        empList.add(e4);
        Emp e5=new Emp(1,"dhaval4",12000);
        empList.add(e5);

        for (Emp e:empList){
            if(e.e_salary>10000){
                System.out.println(e);
            }
        }
    }

}
