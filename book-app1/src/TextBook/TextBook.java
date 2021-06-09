package TextBook;

import comm.example.Book;
import comm.example.EBook;
/**
 *Test class : TestBook
 * Author : 001ZMY744
 *Organization : AI Graduate
 **/
public class TextBook
{
	@SuppressWarnings("static-access")
	public static void main(String[] args){                  // Main Method - Only this method gets executed
		//Create a Book object
		Book book1 = new Book("Gary Rich", 8.99f, 19.99f, "How to get rich", 100);   
		//Fetch Book Class specific fields from this book
		System.out.println("\n1) Book Details\n    1a) Author:  " + book1.author + " | cost price: "+ book1.costPrice +" | sale price:"
				+ book1.salePrice +" | pages: "+ book1.pages +" | title: " + book1.title+"\n");
		//Get Profit and Tax
		System.out.println("    1a) Author " + book1.author + " nets a per-book profit of $" + book1.netProfit() + " and a tax of $" + book1.getTax());
		//Create an e-book object
		EBook book2 = new EBook("Seth Devilin", 10f, 23f, "Bad habits that lead to success", 200, "Amazon", 80);
		//Fetch Book Class specific fields from this ebook
		System.out.println("\n2) EBook Details\n    2a) Author: Seth Devilin " + book2.author + " | cost price: 10.0 "+ book2.costPrice +" | sale price: 23.0"
				+ book2.salePrice +" | pages: 200"+ book2.salePrice +" | title: " + book2.title+"\n");
		//Get Profit and Tax
		System.out.println("    2b) Author Seth Devilin" + book2.author + " nets a per-book profit of $ 13.0" + book2.netProfit() + " and a tax of $ 5.9" + book2.getTax());
		//Get per page size
		System.out.println("\n    2c) Book \"Bad habits that lead to success" + book2.title + "\" has a per-page size of 0.4" + book2.pageSize(0) +" MB\n");
	}
}