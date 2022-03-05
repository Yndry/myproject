package hibernate.onemanytomany.oneToOne;


import javax.persistence.*;

@Entity

@Table(name = "employe_info")

public class EmployInfo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    /**
     * Если этой ссылки не будет то будет однонаправленная связь
     */
    @OneToOne(mappedBy = "infoEmploy")
    // делаем обратную связь. в классе Perso есть ссылка на обьект EmployInfo под названием "infoEmploy"
Perso perso; //и чеез mappedBy = "infoEmploy" мы можем вытащить обьект Perso


    @Column(name = "name_info")
    String name;

}
