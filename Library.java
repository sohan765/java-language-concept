class Centrallibrary{
    String books [];
    int no_of_books;
    Centrallibrary(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addbook(String book){
        this.books[no_of_books++]=book;
        System.out.println(book+" has been added!");
    }
    void showavailablebook(){
        System.out.println("the available books are : ");
        for(String book : this.books){
            if(book== null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issuebook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println(book+"the book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("the book is not exist");
    }
    void returnbook(String book){
        addbook(book);
    }
}
public class Library{
    public static void main(String[] args) {
        Centrallibrary cl = new Centrallibrary();
        cl.addbook("Rich Dad and Poor Dad");
        cl.addbook("c++");
        cl.addbook("Data structure and algorithm");
        cl.showavailablebook();
        cl.issuebook("c++");
        cl.showavailablebook();
        cl.returnbook("c++");
        cl.showavailablebook();
    }
}