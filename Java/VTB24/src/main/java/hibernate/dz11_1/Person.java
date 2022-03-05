package hibernate.dz11_1;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "persons")
@NoArgsConstructor

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    int id;

    @Column (name = "name")
    String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Order> orders;

    @Override
    public String toString() {
        return super.toString();
    }
}
