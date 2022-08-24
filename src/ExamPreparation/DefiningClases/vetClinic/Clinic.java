package ExamPreparation.DefiningClases.vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private List<Pet> data;
    private int capacity;

    public Clinic(int capacity){
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }
    public void add(Pet pet){
        if(this.data.size() < capacity){
            data.add(pet);
        }
    }
    public boolean remove(String name){
        for (Pet pet : data) {
            if(pet.getName().contains(name)){
                return this.data.remove(pet);
            }
        }return false;

    }

    public Pet getPet(String name, String owner){
        for (Pet pet : data) {
            if(pet.getName().contains(name) && pet.getOwner().contains(owner) ){
                return pet;
            }
        }return null;
    }

    public Pet getOldestPet(){
        return this.data.stream()
                .max((pet1, pet2) -> Integer.compare(pet1.getAge(), pet2.getAge()))
                .get();
    }
    public int getCount(){
        return this.data.size();
    }
    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("The clinic has the following patients:").append(System.lineSeparator());
        for (Pet pet : data) {
            builder.append(pet.getName()).append(" ").append(pet.getOwner()).append(System.lineSeparator());
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }
}
