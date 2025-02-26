package Library.csv;

public class Book {

    String b_id,b_name,author;
    int a_quantity,t_quantity;

    Book(String b_id,String b_name,String author,int a_quantity,int t_quantity){
        this.b_id=b_id;
        this.b_name=b_name;
        this.author=author;
        this.a_quantity=a_quantity;
        this.t_quantity=t_quantity;
    }

    @Override
    public String toString() {
        return
                "Id='" + b_id +  '\'' +
                        ", Name='" + b_name + '\'' +
                        ", Author='" + author + '\'' +
                        ", Quantity=" + a_quantity ;
    }
}
