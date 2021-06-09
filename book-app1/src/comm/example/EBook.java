package comm.example;
/** 
 * Sub Class : EBook
 * Author : Sujitha
 *Organization : AI Graduate
 **/

public class EBook {
	public static final String salePrice = null;
	public static final String costPrice = null;
	public final String author = null;
	public String dowloadSite;
	public int sizeMB;
	public String title;
	public EBook(String au, float cp, float sp, String tl, int pg, String ds, int sz) {
		super();
		dowloadSite = ds;
		sizeMB = sz;
		
	}
	public float pageSize(float pages)
	{
		return ((float)sizeMB/(float)pages);
		
	}
	public void printTitle(String title)
	{
		System.out.print("The title of this book is: "+title);
	}
	public float getTax()
	{
		return(0.3f*this.netProfit()+2);
	}
	public float netProfit() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
