package ZaurTregulovYglub.Generics.Game;

import zaurTregulov.generics.game.Partisipant;
import zaurTregulov.generics.game.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teams <T extends Partisipants> {
    private String name;
    List<T> partisipants = new ArrayList<>();

    public Teams(String name) {
        this.name = name;
    }

    public void newParticipant(T participant) {
        partisipants.add(participant);
        System.out.println("V komandu " + this.name + " Dobavlen igrok " + participant.getName());
    }
    public void playWith(Teams<T> name) {

    }
}
