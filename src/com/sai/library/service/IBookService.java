package com.sai.library.service;

import com.sai.library.model.Book;

public interface IBookService {

	public void addBook(String bookName, String ISBN);

	public void removeBook(Book book);

	public void removeBook(String Name);

	public void displayBook();

	public void updateBookName(String Name, String UpName, String ISBN);
}
