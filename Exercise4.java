class Author{
	private String name,email;
	private char gender;
	//constructor to initialize class variables
	public Author(String s,String id,char ch){
	this.name=s;
	this.email=id;
	this.gender=ch;	
	}
	//method to retrieve name of author
	public String getName(){
		return name;}
	//method to retrieve email of author
	public String getEmail(){
		return email;}
	//method to retrieve gender of author
	public char getGender(){
		return gender;}
	//method to set new email as name and gender of author cannot be changed
	public void setEmail(String s){
		this.email=s;}
	//method to print all details of author
	public String toString(){
		String set=Character.toString(this.gender);
		return name+" ("+set+") "+email;}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qty;
	//constructor to initialize variables
	public Book(String name, Author author,double price,int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
}
	//method to retrieve name of book
	public String getName(){
		return name;}
	//method to retrieve authors details
	public Author getAuthor(){
		return author;}
	//method to retrieve price of book
	public double getPrice(){
		return price;}
	//method to retrieve quantity
	public int getQuantity(){
		return qty;}
	//method to set price of book
	public void setPrice(double pr){
		this.price=pr;} 
	//method to set quantity of book
	public void setQuantity(int quan){
		this.qty=quan;}

	//method to print all the details of book including author details
	public String toString(){
		return "'"+name+"' by '"+author+"'"+" price is "+price;}


}

public class Exercise4{
	public static void main(String[] args){

	Author auth=new Author("Chetan Bhagat","chetan@software.com",'M');
	//Print details of author
	System.out.print("Details of author: "); 	
	System.out.println(auth);
	
	Book b1=new Book("2 States",auth,570,15);
	System.out.print("Details of book: "); 	
	System.out.println(b1);

	//Printing all values separately
	System.out.println("The name of the author is "+auth.getName());
	System.out.println("The gender of author is "+auth.getGender());
	System.out.println("The email of author is "+auth.getEmail());
	System.out.println("The name of the book is "+b1.getName());
	System.out.println("The price of the book is "+b1.getPrice());
	System.out.println("The quantity of book is "+b1.getQuantity());

	//checking the functionalities of setters
	auth.setEmail("chetanbhagat@software.com");
	System.out.println("The new email of author is "+auth.getEmail());
	b1.setPrice(650);
	System.out.println("The new price of the book is "+b1.getPrice());
	b1.setQuantity(30);
	System.out.println("The new quantity of book is "+b1.getQuantity());



}


}
