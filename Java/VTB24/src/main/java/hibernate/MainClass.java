package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Catalog.class)
                .buildSessionFactory();
        Session session = null;

        try {

//           CREAT
//            session = factory.getCurrentSession();
//            hibernate.Catalog catalog = new hibernate.Catalog("Harry Potter #1");
//            session.beginTransaction();
//            session.save(catalog);
//            session.getTransaction();
//            session.getTransaction().commit();

            //READ
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            hibernate.Catalog catalog = session.get(hibernate.Catalog.class, 1L);
//            session.getTransaction().commit();
//            System.out.print(catalog);

            //UPDATE
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            hibernate.Catalog catalog = session.get(hibernate.Catalog.class, 1L);
//            catalog.setTitle("New name");
//

            //Получение списка обьектов
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            List<hibernate.Catalog> catalogList = session.createQuery("from hibernate.Catalog").getResultList();
//            List<hibernate.Catalog> catalogList1 = session.createQuery("from hibernate.Catalog c where c.title = :title").setParameter("title", "Volkodav").getResultList();
//            System.out.println(catalogList1);
//            session.getTransaction().commit();

            //Update Value Меняем все title на "A" и удаляем 3-ю запись
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("update Catalog set title = 'A'").executeUpdate();
            session.createQuery("delete from Catalog where id = 3").executeUpdate();
            session.getTransaction().commit();

/**
 * session.remove(ctalog); - удаляем обьект из базы
 * session.detach(catalog); - отвязываем обьект от Hibernate
 * session.persist(catalog); - говорим Hibernate следить за обьектом
 * session.merge(catalog) - если сделали remove обьекта до его коммита, то можно его вернуть
 */
//

        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
