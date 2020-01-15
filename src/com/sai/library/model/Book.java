/**
 * 
 */
package com.sai.library.model;

/**
 * @author sv
 *
 */
public class Book {

	public String bookName;
	public String ISBN;

	// constructor

	public Book() {

	}

	public Book(String bookName, String ISBN) {
		this.bookName = bookName;
		this.ISBN = ISBN;
	}

	// Getter and Setter

	public void setBookName(String Name) {
		bookName = Name;
	}

	public String getBookName() {
		return bookName;
	}

	public void setISBN(String number) {
		ISBN = number;
	}

	public String getISBN() {
		return ISBN;
	}
}
