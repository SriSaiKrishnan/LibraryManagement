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
	public String author;
	public int price;
	public String edition;
	public String status;
	public String dateOfPurchase;
	public int rackNo;

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

	public void setAuthor(String authorName) {
		author = authorName;
	}

	public String getAuthor() {
		return author;
	}

	public void setBookPrice(int bookPrice) {
		price = bookPrice;
	}

	public int getBookPrice() {
		return price;
	}

	public void setBookEdition(String bookEdition) {
		edition = bookEdition;
	}

	public void setStatus(String bookStatus) {
		status = bookStatus;
	}

	public String getBookStatus() {
		return status;
	}

	public void setdateOfPurchase(String purchaseDate) {
		dateOfPurchase = purchaseDate;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setRackNo(int rackNumber) {
		rackNo = rackNumber;
	}

	public int getRackNo() {
		return rackNo;
	}
}
