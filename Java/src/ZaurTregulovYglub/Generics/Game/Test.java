package ZaurTregulovYglub.Generics.Game;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scooler scooler1 = new Scooler("Vaniya", 10);
        Scooler scooler2 = new Scooler("Petiya", 12);
        Students students1 = new Students("Petr", 20);
        Teams<Scooler> team1 = new Teams("boysSculler");
        Teams<Scooler> teams3 = new Teams("Boys2");
//        team1.newPartisipants(scooler1);
//        team1.newPartisipants(scooler2);
        Teams<Students> teams2 = new Teams("StudentTeam");
        team1.playWith(teams3);





    }
}
