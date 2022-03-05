package hibernate.onemanytomany.oneToOne;

import javax.persistence.*;

@Entity
@Table(name = "employey")

public class Perso {
    @Id
    @GeneratedValue

    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "info_id") // "info_id" - имя внешнего ключа в таблице employey клсаа Perso
    EmployInfo infoEmploy; // по столбцу с внешним ключем в нашей таблице info_id выдерним обьект EmployInfo из базы

    @Column(name = "name")
    private String name;

}
