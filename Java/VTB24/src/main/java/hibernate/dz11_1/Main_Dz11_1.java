package hibernate.dz11_1;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class Main_Dz11_1 {

    public static void main(String[] args) {
        List<Order> orders;
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(OrderKey.class)
                .buildSessionFactory();
        Session session = null;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter comand: ");

            while (sc.hasNext()) {
                String command = sc.nextLine();
                if (command.equals("exit")) {
                    break;
                }
                String[] commandParts = command.split(" ");

                switch (commandParts[0]) {

                    //by Person1 Product1
                    case "/buy":
                        System.out.println("/buy");
                        session = factory.getCurrentSession();
                        session.getTransaction();

                        Person person = (Person) session.createQuery("FROM Person p WHERE p.name = :name").
                                setParameter("name", commandParts[1]).getSingleResult();

                        Product product = (Product) session.createQuery("FROM Product p WHERE p.name = :name").
                                setParameter("name", commandParts[2]).getSingleResult();

                        OrderKey orderKey = new OrderKey();
                        orderKey.setPerson_id(person.getId());
                        orderKey.setProduct_id(product.getId());

                        Order order = new Order();
                        order.setOrderKey(orderKey);
                        order.setPrice(product.getPrice());

                        session.save(order);

                        session.getTransaction().commit();
                        System.out.println("Saved the next order: " + order.toString());
                        System.out.print("Enter new comand: ");
                        break;

                    //ShowProductsByPerson Person1
                    case "/ShowProductsByPerson":
                        System.out.println("/ShowProductsByPerson");
                        session = factory.getCurrentSession();
                        session.beginTransaction();
                        person = (Person) session.createQuery("FROM Person p WHERE p.name = :name")
                                .setParameter("name", commandParts[1]).getSingleResult();
                        orders = person.getOrders();
                        orders.forEach(o -> System.out.println("Products for " + person.getName() +
                                ": " + o.getProduct().toString()));

                        session.getTransaction().commit();
                        System.out.print("Enter new command: ");
                        break;

                    //findPersonsByProductTitle Product1
                    case "/findPersonsByProductTitle":
                        System.out.println("/findPersonsByProductTitle");
                        session = factory.getCurrentSession();
                        session.beginTransaction();

                        product = (Product) session.createQuery("FROM Product  p WHERE p.name = :name")
                                .setParameter("name", commandParts[1]).getSingleResult();

                        orders = product.getOrders();
                        orders.forEach(o -> System.out.println("Person for " + product.getName() + ": " + o.getPerson().toString()));

                        session.getTransaction().commit();
                        System.out.println("Enter new command: ");
                        break;

                    // /RemovePerson Person_2
                    case "/RemovePerson":
                        System.out.println("/RemovePerson");
                        session = factory.getCurrentSession();
                        session.beginTransaction();

                        person = (Person) session.createQuery("FROM Person p WHERE p.name = :name")
                                .setParameter("name", commandParts[1]).getSingleResult();

                        session.delete(person);
                        System.out.println("Remove - " + person.toString());

                        session.getTransaction().commit();
                        System.out.println("Enter new command: ");
                        break;

                    // /RemoveProduct
                    case "/RemoveProduct":
                        session = factory.getCurrentSession();
                        session.beginTransaction();

                        product = (Product) session.createQuery("FROM Product p WHERE p.name = :name")
                                .setParameter("name", commandParts[1]).getSingleResult();

                        session.delete(product);
                        System.out.println("Remove product - " + product.toString());
                        System.out.println("Enter new command: ");
                        break;
                    default:
                        break;
                }
            }
        }finally {
            factory.close();
            session.close();
        }
    }
}
