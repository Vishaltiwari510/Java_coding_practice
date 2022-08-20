package com.stackroute.practice.assignment20April;

public class Book {

	int ISBNNo;
	String bookName;
	Author author;
	String genre;
	float price;
	
	
	
	public Book(int iSBNNo, String bookName, Author author, String genre, float price) {
		super();
		ISBNNo = iSBNNo;
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}
	
	
	public void displayBookDetails() {
		System.out.println("ISBNNO: "+ISBNNo);
		System.out.println("bookName: "+bookName);
		System.out.println("authorName: "+author.authorName);
		System.out.println("genre: "+genre);
		System.out.println("price: "+price);
	}
	
	
}
