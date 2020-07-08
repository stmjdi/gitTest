package com.spring.demo.vo;

public class BooklistVO {
	private String bid;
	private String title;
	private String author;
	private String publisher;
	private String pubdate;
	private String isbn;
	private String bcategory;
	private String blocation;
	private String bcount;
	private String descrip;
	private String bpages;
	private String willdel;
	
	public BooklistVO() {}
	
	public BooklistVO(String bid, String title, String author, String publisher, String pubdate, String isbn,
			String bcategory, String blocation, String bcount, String descrip, String bpages, String willdel) {
		super();
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.isbn = isbn;
		this.bcategory = bcategory;
		this.blocation = blocation;
		this.bcount = bcount;
		this.descrip = descrip;
		this.bpages = bpages;
		this.willdel = willdel;
	}

	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBcategory() {
		return bcategory;
	}
	public void setBcategory(String bcategory) {
		this.bcategory = bcategory;
	}
	public String getBlocation() {
		return blocation;
	}
	public void setBlocation(String blocation) {
		this.blocation = blocation;
	}
	public String getBcount() {
		return bcount;
	}
	public void setBcount(String bcount) {
		this.bcount = bcount;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getBpages() {
		return bpages;
	}
	public void setBpages(String bpages) {
		this.bpages = bpages;
	}
	public String getWilldel() {
		return willdel;
	}
	public void setWilldel(String willdel) {
		this.willdel = willdel;
	}

	@Override
	public String toString() {
		return "BooklistVO [bid=" + bid + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", pubdate=" + pubdate + ", isbn=" + isbn + ", bcategory=" + bcategory + ", blocation=" + blocation
				+ ", bcount=" + bcount + ", descrip=" + descrip + ", bpages=" + bpages + ", willdel=" + willdel + "]";
	}
	
}
