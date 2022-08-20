package com.stackroute.practice.assignment20April;

import com.stackroute.practice.assignment20April.Book;

public class BookStore {
String bookStoreName;
String bookStoreRegistrationId;
Book[] books;



public BookStore(String bookStoreName, String bookStoreRegistrationId, Book[] books) {
	super();
	this.bookStoreName = bookStoreName;
	this.bookStoreRegistrationId = bookStoreRegistrationId;
    this.books = books;
}

public float calculateDiscount(Book book, float discountPercentage) {
	if(book.genre.equals("FICTION")){
		   book.price = book.price-(discountPercentage/100)*book.price;
		   
	   }
	   return book.price;

}


}
