package zaurTregulov.generics.game;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Student_Vova", 22);
        Student student1 = new Student("Student_Yana", 19);

        Schooler schooler = new Schooler("Schooler_Petya", 13);
        Schooler schooler1 = new Schooler("Schooler_Nastya", 10);

        Employ employ = new Employ("Employ_Petr", 43);
        Employ employ1 = new Employ("Employ _Vasiliy", 40);

        Team<Schooler> schoolerTeam = new Team<>("Drakoni");
        schoolerTeam.AddNewParticipant(schooler);
        schoolerTeam.AddNewParticipant(schooler1);

        Team<Student> studentTeam = new Team<>("StudentTeam");
        studentTeam.AddNewParticipant(student);
        studentTeam.AddNewParticipant(student1);

        Team<Employ> employTeam = new Team<>("EmployTeam");
        employTeam.AddNewParticipant(employ);
        employTeam.AddNewParticipant(employ1);

        Schooler schooler3 = new Schooler("Schooler_Vaniya", 10);
        Schooler schooler4 = new Schooler("Schooler_Nas", 11);
        Team<Schooler> schoolerTeam1 = new Team<>("Oduvanchiki");
        schoolerTeam.WinnerTeam(schoolerTeam1);


    }
}
