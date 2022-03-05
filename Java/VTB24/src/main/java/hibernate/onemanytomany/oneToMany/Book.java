package hibernate.onemanytomany.oneToMany;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    String name;

    @OneToMany
    @JoinColumn(name = "author_id") // найдем Автора книги по author_id внешнего ключа таблицы @Table(name = "books")
    Author author;



}
