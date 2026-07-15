import java.util.ArrayList;

public class Cart {
    private ArrayList<Book> booksInCart;
    private int totalPrice;
    private int numberOfItemsInCart;

    public Cart(){
        this.booksInCart=new ArrayList<Book>();
        this.totalPrice=0;
        this.numberOfItemsInCart=0;
    }

    public Cart(ArrayList<Book> booksInCart, int totalPrice, int numberOfItemsInCart){
        this.booksInCart=booksInCart;
        this.totalPrice=totalPrice;
        this.numberOfItemsInCart=numberOfItemsInCart;
    }

    public void addToCart(Book book, int quantity){
        if(book instanceof PhysicalBook){
            if(!(((PhysicalBook) book).compare(quantity))){
                this.booksInCart.add(book);
                this.totalPrice+=book.getPrice();
                this.numberOfItemsInCart++;
            }

        }
        else {
            this.booksInCart.add(book);
            this.totalPrice += book.getPrice();
            this.numberOfItemsInCart++;
        }
    }

    public void setBooksInCart(ArrayList<Book> booksInCart) {
        this.booksInCart = booksInCart;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setNumberOfItemsInCart(int numberOfItemsInCart) {
        this.numberOfItemsInCart = numberOfItemsInCart;
    }

    public ArrayList<Book> getBooksInCart() {
        return booksInCart;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getNumberOfItemsInCart() {
        return numberOfItemsInCart;
    }

}
