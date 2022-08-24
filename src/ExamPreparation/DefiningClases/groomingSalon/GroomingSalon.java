package ExamPreparation.DefiningClases.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity){
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
    public void add(Pet pet){
        if(this.data.size() < this.capacity){
            this.data.add(pet);
        }
    }
    public boolean remove(String name){
        for (Pet pet : data) {
            if(pet.getName().equals(name)){
                return this.data.remove(pet);
            }
        }return false;
    }
    public int getCount(){
        return this.data.size();
    }

    public Pet getPet(String name, String owner){
        if(this.data.size() == 0){
            return null;
        }else{
            for (Pet pet : data) {
                if(pet.getName().equals(name) && pet.getOwner().equals(owner)){
                    return pet;
                }
            }
        }return null;
    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("The grooming salon has the following clients:").append(System.lineSeparator());
        for (Pet pet : data) {
            builder.append(pet.getName()).append(" ").append(pet.getOwner()).append(System.lineSeparator());
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }
}
