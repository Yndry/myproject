package ZaurTregulovYglub.reflectionPackage;

import zaurTregulov.generics.game.Employ;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionEx1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
/**
 * Создадим обьект класса class
 */
        Class empClass = Class.forName("ZaurTregulovYglub.reflectionPackage.Employee"); // указываем имя нашего пакета
        //Если б класс был в отдельном файле то писали бы ZaurTregulovYglub.reflectionPackage.nameClass
        //     где nameClass - это имя класса
        //обьект empClass теперь является нашим классом Emplee


//        /**
//         * Второй вариант создания
//         */
//        Class empClass2 = Employee.class;
//
//        /**
//         * Третий вариант создания
//         */
//        Employee emp = new Employee(); //создадим обьект класса Emploee
//        Class empClass3 = emp.getClass();

        /**
         *Можем получить поле класса Emploee с помощью созданного обьекта
         */

        Field someFild = empClass.getField("age"); //указали поле если мы его знаем
        /**
         * теперь обьект someField стал полем "age"
         *Мы можем узнать тип этого поля
         */

        System.out.println("У поля age тип " + someFild.getType());

        /**
         * Узнаем информацию сразу о всех полях
         */

        Field[] infoField = empClass.getFields(); //getFields - возвращает массив типа Fields
        for (Field field : infoField) {
            System.out.println("Type of: " + field.getName() + " = " + field.getType());
        }
        /**
         * нет поля prived для его отображения есть метод
         */
        System.out.println("------------");
        Field[] allField = empClass.getDeclaredFields(); // возвращает массив всех полей в том числе и privet
        for (Field fieldAll : allField) {
            System.out.println("Type of: " + fieldAll.getName() + " = " + fieldAll.getType());
        }
        System.out.println("------");

        /**
         * Доступ к конкретному одному методу
         */

       Method someMethod = empClass.getMethod("outnameSorname"); //someMetod теперь стал методом "outnameSorname"
        System.out.println(someMethod.getName() + someMethod.getReturnType() + Arrays.toString(someMethod.getParameterTypes()));
        // getParameterTypes() возвращает массив типа class

        System.out.println("----------");
        /**
         * Информация о всех методах класса Emploee
         */
        Method[] arrayMetod = empClass.getDeclaredMethods();
        for(Method infMethod : arrayMetod) {
            System.out.println("Name method- " + infMethod.getName() + " : " +
                    "Return Type Method- " + infMethod.getReturnType());
        }
    }
}


class Employee {
    public String name;
    public int age;
    private String sorname;

    public Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, String sorname) {
        this.name = name;
        this.age = age;
        this.sorname = sorname;
    }

    public void outnameSorname() {
        System.out.println("name is: " + this.name + " sourname is: " + this.sorname);
    }

    private void plusAge100() {
        System.out.println("Age + 100 = " + (this.age + 100));
    }

    public int getAge() {
        return age;
    }

    public String getSorname() {
        return sorname;
    }

    public void setSorname(String sorname) {
        this.sorname = sorname;
    }
}
