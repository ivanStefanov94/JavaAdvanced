package ExamPreparation.DefiningClases.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Car> data;
    private String type;
    private int capacity;

    public Parking(String type, int capacity){
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    //add -> adds an entity(car) to the data(List) if there is an empty cell for the car
    public void add(Car car){
        if (this.data.size() < this.capacity){
            this.data.add(car);
        }
    }
    //remove-> removes the car by given manufacturer and model, if such exists
    // , and returns boolean
    public boolean remove(String manufacturer, String model){
        for (Car car : this.data) {
            if(car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)){
                return this.data.remove(car);
//                data.remove(car);
//                return true;
            }
        }
        return false;
    }
    //getLatestCar() –> returns the latest car (by year) or null if have no cars
    public Car getLatestCar(){
        if(this.data.size() == 0){
            return null;
        }
        else{
            //comparing in descending order(try with min)
            return this.data.stream()
                    .max((car1, car2) -> Integer.compare(car1.getYear(), car2.getYear()))
                    .get();
        }
    }

    //getCar(String manufacturer, String model) –> returns the car with the given manufacturer and model
    // or null if there is no such car.
    public Car getCar(String manufacturer, String model){
        if (this.data.size() == 0){
            return null;
        }else{
            for (Car car : data) {
                if(car.getManufacturer().contains(manufacturer) && car.getModel().contains(model)){
                    return car;
                }
            }
            return null;
        }
    }
    //getCount() – returns the number of cars.
    public int getCount(){
        return this.data.size();
    }
    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("The cars are parked in ").append(this.type).append(":").append(System.lineSeparator());
        for (Car car : data) {
            builder.append(car.toString()).append(System.lineSeparator());;
        }
        return builder.toString();
    }
}
