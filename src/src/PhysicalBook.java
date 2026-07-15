import java.util.HashMap;

public class PhysicalBook extends Book{
    private int itemsInStock;

    public PhysicalBook(String title, String author, int id, String genre, int price, int itemsInStock){
        super(title, author, id, genre, price);
        this.itemsInStock=itemsInStock;

    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }


    public boolean compare(int quantity){
        if(quantity>this.getItemsInStock())
            return false;
            else
                return true;
    }




}
