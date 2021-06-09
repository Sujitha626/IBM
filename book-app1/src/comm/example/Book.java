package comm.example;

import java.util.Random;
/**
 * Base Class : Book
 * Author : Sujitha
 *Organization : AI Graduate
 **/

public class Book {
	public String author;
	public float costPrice;
	public float salePrice;
	public String title;
	public int pages;
	public Book(String au, float cp, float sp, String tl, int pg) {
		author = au;
		costPrice = cp;
		salePrice = sp;
		title = tl;
		pages = pg;
	}
	public float netProfit()
	{
		return(salePrice - costPrice);
	}
	public float getTax()
	{
		return(0.3f*this.netProfit());
	}
	

}
