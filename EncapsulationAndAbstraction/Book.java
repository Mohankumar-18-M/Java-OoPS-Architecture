package EncapsulationAndAbstraction;

public class Book  {
	
	private String Name;
	private double Price;
	private int QuantityInStock;
	private Author author;
	
	Book(String Name,Author author,double Price,int QuantityInStock){
		this.Name = Name;
		this.author = author;
		this.Price = Price;
		this.QuantityInStock = QuantityInStock;
	}
	
	public String getName() {
		return Name;
	}
	public Author author() {
		return author;
	}
	public double Price() {
		return Price;
	}
	public int QuantityInStock() {
		return QuantityInStock;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setPrice(double Price) {
		this.Price = Price;
	}
	public void setQuantityInStock(int QuantityInStock) {
		this.QuantityInStock = QuantityInStock;
	}
	
	void display() {
		System.out.println("Book name : "+Name);
		author.Author_display();
		System.out.println("Price ₹:"+Price);
		System.out.println("Quantity in stock : "+QuantityInStock);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("Mohan","mohankumar@gmail.com",'M');
		Book book1 = new Book("Five point someone",author,599.99,100);
		book1.display();
//		book1.author.name    error not visible;
//		book1.setPrice(299.99);
//		book1.display();
		
		
		

	}

}
