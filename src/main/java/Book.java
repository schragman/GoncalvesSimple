package main.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b")
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String title;
	private Float price;
	@Column(length = 2000)
	private String description;
	private String isbn;
	private Integer nbOfPages;
	private Boolean illustrations;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNbOfPages() {
		return nbOfPages;
	}
	public void setNbOfPages(Integer nbOfPages) {
		this.nbOfPages = nbOfPages;
	}
	public Boolean getIllustrations() {
		return illustrations;
	}
	public void setIllustrations(Boolean illustrations) {
		this.illustrations = illustrations;
	}
	public Long getId() {
		return id;
	}




}
