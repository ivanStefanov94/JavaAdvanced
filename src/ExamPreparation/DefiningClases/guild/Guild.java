package ExamPreparation.DefiningClases.guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    private List<Player> roster;
    private String name;
    private int capacity;

    public Guild(String name, int capacity){
        this.roster = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void addPlayer(Player player){
        if(this.roster.size()< this.capacity){
            roster.add(player);
        }
    }
    public boolean removePlayer(String name){
        for (Player player : roster) {
            if(player.getName().equals(name)){
                return this.roster.remove(player);
            }
        }return false;
    }
    public void promotePlayer(String name){
        for (Player player : roster) {
            if(player.getName().equals(name) && player.getRank().equals("Trial")){
                    player.setRank("Member");

            }

        }
    }
    public void demotePlayer(String name){
        for (Player player : roster) {
            if(player.getName().equals(name) && !player.getRank().equals("Trial")){
                player.setRank("Trial");

            }
        }
    }
    public int count(){
        return this.roster.size();
    }

    public Player[]  kickPlayersByClass(String clazz){
        int counter = 0;

        for (Player player : roster) {
            if(player.getClazz().equals(clazz)){
                counter++;
            }
        }
        Player[] array = new Player[counter];

        int index = 0;

        for (Player player : roster) {
            if(player.getClazz().equals(clazz)){
                array[index++] = player;
            }
        }
        for (Player player : array) {
            this.roster.remove(player);
        }
        return array;
    }

    public String report(){
        StringBuilder builder = new StringBuilder();
        builder.append(System.lineSeparator()).append("Players in the ExamPreparation.DefiningClases.guild: ").append(this.name).append(":").append(System.lineSeparator());
        for (Player player : roster) {
            builder.append(player).append(System.lineSeparator());
        }


        return builder.toString();
    }
}
