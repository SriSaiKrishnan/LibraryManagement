/**
 * 
 */
package com.sai.library;

import com.sai.library.service.IBookService;
import com.sai.library.serviceimpl.BookServiceImpl;

/**
 * @author sv
 *
 */
public class BookMainApplication {

	public static IBookService bookService = new BookServiceImpl();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Sai's Library");
		
		System.out.println();
		
		bookService.displayBook();

		bookService.addBook("English", "E001");
		bookService.addBook("Tamil", "T002");

		System.out.println("+++++++++++++++++ After Adding the Book ++++++++++++++++");
		bookService.displayBook();

		bookService.removeBook("English");

		System.out.println();

		System.out.println("+++++++++++++++++ After Removing the Book ++++++++++++++");
		bookService.displayBook();

		bookService.updateBookName("Tamil", "Tam", "TAM001");

		System.out.println();

		System.out.println("+++++++++++++++++ After Updating the Book ++++++++++++++");
		bookService.displayBook();
	}

}
