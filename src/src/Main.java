//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		Book b1=new PhysicalBook("Dracula","Bram Stoker",1,"Horror",300,10);
		Book b2=new Ebook("Beloved","Toni Morrison",2,"Fiction",300);
		Book b3=new PhysicalBook("Lolita", "Vladimir Nabokov",3,"Fiction",400,20);
		Book b4=new Ebook("Dune","Frank Herbert",4,"Fantasy",400);
		System.out.println(b1.getBookHashMap());
		Cart a= new Cart();


		}

}