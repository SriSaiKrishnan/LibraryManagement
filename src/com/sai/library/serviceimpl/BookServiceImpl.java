/**
 * 
 */
package com.sai.library.serviceimpl;

import java.util.ArrayList;

import com.sai.library.model.Book;
import com.sai.library.service.IBookService;

/**
 * @author sv
 *
 */
public class BookServiceImpl implements IBookService {

	ArrayList<Book> booksDB = new ArrayList<Book>();

	public BookServiceImpl() {

	}

	public Book getName(String Name) {

		for (Book book : booksDB) {
			if (book.getBookName().contains(Name))
				return book;
		}
		return null;
	}

	public void addBook(String Name, String ISBN) {

		booksDB.add(new Book(Name, ISBN));
	}

	public void removeBook(Book book) {
		booksDB.remove(book);
	}

	public void removeBook(String Name) {
		booksDB.remove(booksDB.indexOf(getName(Name)));
	}

	public void displayBook() {
		if (booksDB.isEmpty()) {
			System.out.println("No Books Available");
		}
		System.out.println();
		for (Book book : booksDB) {
			System.out.println(book.bookName + " : " + book.ISBN);
		}
	}

	public void updateBookName(String Name, String UpName, String ISBN) {
		int index = booksDB.indexOf(getName(Name));
		for (Book book : booksDB) {
			if (book.getBookName().contains(Name)) {
				booksDB.set(index, new Book(UpName, ISBN));
			} else {
				System.out.println("No Books Available");
			}
		}
	}

}
