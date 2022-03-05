package hibernate.onemanytomany.manyToMany.oneToMany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    String name;

    @ManyToMany
    @JoinTable(name = "books_author",
    joinColumns = JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id")) // найдем Автора книги по author_id внешнего ключа таблицы @Table(name = "books")
    List<Author> authors;



}
