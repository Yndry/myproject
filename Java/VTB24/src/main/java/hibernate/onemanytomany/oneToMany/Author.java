package hibernate.onemanytomany.oneToMany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue

    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "author") //Обратная ссылка
    private List<Book> book; //Список книг автора

}
