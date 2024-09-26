package system.book;

public class book {
	String book_id;
	String book_name;
	String author;
	String press;
	int book_num;
	int book_remain;
	String sort_id;
	
	public book(String book_id,String book_name,String anthor,String press,int book_num,int book_remain,String sort_id) {
		this.book_id=book_id;
		this.book_name=book_name;
		this.author=anthor;
		this.press=press;
		this.book_num=book_num;
		this.book_remain=book_remain;
		this.sort_id=sort_id;		
	}
	public String getbook_id() {
		return book_id;
	}
	public String getbook_name() {
		return book_name;
	}
	public String getauthor() {
		return author;
	}
	public String getpress() {
		return press;
	}
	public int getbook_num() {
		return book_num;
	}
	public int getbook_remain() {
		return book_remain;
	}
	public String getsort_id() {
		return sort_id;
	}
	
}
