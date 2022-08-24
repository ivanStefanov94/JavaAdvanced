package ExamPreparation.DefiningClases.guild;

public class Player {
    private String name;
    private String clazz;
    private String rank;
    private String description;

    public Player(String name, String clazz){
        this.name = name;
        this.clazz = clazz;
        this.rank = "Trial";
        this.description = "n/a";
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public String getDescription() {
        return description;
    }

    public String getRank() {
        return rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Player ").append(getName()).append(": ").append(getClazz()).append(System.lineSeparator());
        builder.append("Rank: ").append(getRank()).append(System.lineSeparator());
        builder.append("Description: ").append(getDescription());
        return builder.toString();
    }
}
