import javax.persistence.*;
@Entity
@Table (name = "Catalogs")
public class Catalog {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "title")
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Catalog() {
    }

    public Catalog(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
