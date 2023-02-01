package Library;

public class Book {

    String b_name,author;
    int quantity;
    Book(String b_name,String author,int quantity){
        this.b_name=b_name;
        this.author=author;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return
                "Name='" + b_name + '\'' +
                        ", Author='" + author + '\'' +
                        ", Quantity=" + quantity;
    }
}


