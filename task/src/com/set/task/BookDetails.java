package com.set.task;

public class BookDetails implements Comparable<BookDetails> {
private int Bid;
private String name;
private String Author;
private double price;
public BookDetails(int bid, String name, String author, double price) {
	super();
	Bid = bid;
	this.name = name;
	Author = author;
	this.price = price;
}
public int getBid() {
	return Bid;
}
public void setBid(int bid) {
	Bid = bid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public double getPrice() {
	return price;
}
@Override
public String toString() {
	return "BookDetails [Bid=" + Bid + ", name=" + name + ", Author=" + Author + ", price=" + price + "]";
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public int compareTo(BookDetails o) {
	if (this.price>o.price) return -1;
	else if(this.price<o.price) return 1;
	return 0;
}
@Override
public boolean equals(Object obj) {
	System.out.println("in equals");
	if(this==obj)
		return true;
		if(obj==null||obj.getClass()!=this.getClass())
		return false;
	BookDetails bookObj=(BookDetails)obj;
	System.out.println(bookObj.name+"na"+this.name+"id"+bookObj.Bid+ "55"+this.Bid);
	return (bookObj.name==this.name||bookObj.Bid==this.Bid);
}
@Override
public int hashCode() {
	System.out.println("in HashCode");
	return this.Bid;
}


}
