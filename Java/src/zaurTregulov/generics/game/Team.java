package zaurTregulov.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Partisipant>{
    private String name;
    private List<T> partisipantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public void AddNewParticipant (T partisipant) {
        partisipantList.add(partisipant);
        System.out.println("V komandu " + this.name + "Dobavlen partisipant " + partisipant.getName());
    }
    public void WinnerTeam (Team<T> team) {
        String winner;
        Random random = new Random();
        int r = random.nextInt(2);
        if (r == 0) winner = this.name;
        else winner = team.name;
        System.out.println(winner);
    }

}
