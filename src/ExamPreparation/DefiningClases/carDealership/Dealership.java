package ExamPreparation.DefiningClases.carDealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private List<Car> data;
    private String name;
    private int capacity;

    public Dealership(String name, int capacity){
        this.data = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void add(Car car){
        if(this.data.size() < this.capacity){
            this.data.add(car);
        }
    }
    public boolean buy(String manufacturer, String model){
        for (Car car : this.data) {
            if(car.getManufacturer().contains(manufacturer) && car.getModel().contains(model)){
                return this.data.remove(car);
            }
        }
        return false;
    }
    public Car getLatestCar(){
        if(this.data.size() == 0){
            return null;
        }else{
            return this.data.stream()
                    .max((car1, car2) -> Integer.compare(car1.getYear(), car2.getYear()))
                    .get();
        }
    }
    public Car getCar(String manufacturer, String model){
        if (this.data.size() == 0){
            return null;}
       else{
        for (Car car : data) {
            if(car.getManufacturer().contains(manufacturer) && car.getModel().contains(model)){
                return car;
            }
        }} return null;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("The cars are in a car ExamPreparation.DefiningClases.vetClinic.dealership ").append(this.name).append(":").append(System.lineSeparator());
        for (Car datum : data) {
            builder.append(datum.toString()).append(System.lineSeparator());
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }
}
