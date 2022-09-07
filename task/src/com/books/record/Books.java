package com.books.record;

public class Books {
		int bId;
	    String bookName;
	    double price;
	    double date;
	    public Books() {
	        System.out.println("Default");
	    }
	    public Books(int bId, String bookName, double price,double date) {
	        this.bId = bId;
	        this.bookName = bookName;
	        this.price = price;
	        this.date=date;
	    }
	    public void search(String name) {
	    	if(bookName.equalsIgnoreCase(name)) {
	    		 System.out.println(" | Book Id = " + bId + " | Book Name = " + bookName + " | Book Price = " + price + " |" + " | Date = " + date + " |");
	    	}
	    }
	    public double getDate() {
			return date;
		}
		public void setDate(double date) {
			this.date = date;
		}
		public int getbId() {
	        return bId;
	    }
	    public void setbId(int bId) {
	        this.bId = bId;
	    }
	    public String getBookName() {
	        return bookName;
	    }
	    public void setBookName(String bookName) {
	        this.bookName = bookName;
	    }
	    public double getPrice() {
	        return price;
	    }
	    public void setPrice(double price) {
	        this.price = price;
	    }
		public Double compareTo(Books b) {
			
			int compareQuantity = ((Books) b).getPrice(); 
			
			//ascending order
			return this.price - compareQuantity;
			
			//descending order
			//return compareQuantity - this.quantity;
			
		}
	    
	    public void display() {
	        System.out.println(" | Book Id = " + bId + " | Book Name = " + bookName + " | Book Price = " + price + " |" + " | Date = " + date + " |");

	   }

}
