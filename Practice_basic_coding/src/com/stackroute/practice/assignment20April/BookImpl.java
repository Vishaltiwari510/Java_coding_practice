package com.stackroute.practice.assignment20April;

import com.stackroute.practice.assignment20April.Author;
import com.stackroute.practice.assignment20April.Book;

public class BookImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("Charles Darwin","Darwin");
     Book book = new Book(1123,"The Voyage of the Beagle",author, "FICTION",120);
    
   Author  author1 = new Author("JL Baird","Baird");
    Book book1 = new Book(1123,"Mocking Bird",author1,"FICTION",45);
    
    Author author2 = new Author("TS Elliot","Elliot");
    Book book2 = new Book(1123,"Jane Eyre",author2,"FICTION",35);
    
    Book[] books = new Book[]{book,book1,book2};
   BookStore bookStore = new BookStore("Just Read","1256", books);
  
     //Display book details before discount is calculated
     System.out.println("The book details before discount : ");
     for(int i=0; i<books.length; i++) {
    	 books[i].displayBookDetails();
     }
     
     //Calculate discount on the books by calling the methods
//   System.out.println(bookStore.calculateDiscount(books[0],25f));  
//   System.out.println(bookStore.calculateDiscount(books[1],25f));  
//   System.out.println(bookStore.calculateDiscount(books[2],25f));  
     for(int i=0; i<books.length; i++) {
    	 bookStore.calculateDiscount(books[i],25f);
     }
     //Display book details after discount is calculated
     System.out.println("The book details after discount : ");
     for(int i=0; i<books.length; i++) {
    	 books[i].displayBookDetails();
     }
	}

}
