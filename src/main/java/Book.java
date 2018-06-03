@Entity
@NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b")
public class Book {

	@Id @GeneratedValue
	private Long id
	@Column(nullable = false)
	private String title;
	private Float price;
	@Column(length = 2000)
	private String description;
	private String isbn;
	private Integer nbOfPages;
	private Boolean illustrations;


}
