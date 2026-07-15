import java.util.HashMap;

public abstract class Book {
    private String title;
    private String author;
    private int id;
    private String genre;
    private int price;
    private static final HashMap<Integer,Book> bookHashMap = new HashMap<>();
    private static int index=0;


    public Book(String title, String author, int id, String genre, int price) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.genre = genre;
        this.price = price;
        bookHashMap.put(index,this);
        index++;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
    public void removeFromBookHashMap() {
        Book.bookHashMap.remove(index,this);
    }

    public static void setIndex(int index) {
        Book.index = index;
    }

    public static int getIndex() {
        return index;
    }

    public HashMap<Integer, Book> getBookHashMap() {
        return Book.bookHashMap;
    }



}
