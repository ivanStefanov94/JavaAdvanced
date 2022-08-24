package ExamPreparation.DefiningClases.carDealership;

public class Car {
    private String manufacturer;
    private String model;
    private int year;

    public Car(String manufacturer, String model, int year){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString(){
        return String.format("%s %s (%d)", getManufacturer(), getModel(), getYear());
    }
}
