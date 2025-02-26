package OOP.test;

public class Emp {
    String e_name;
    int e_id,e_salary;

    public Emp( int e_id,String e_name, int e_salary) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_salary = e_salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "e_name='" + e_name + '\'' +
                ", e_id=" + e_id +
                ", e_salary=" + e_salary +
                '}';
    }
}
