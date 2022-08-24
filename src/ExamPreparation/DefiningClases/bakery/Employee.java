package ExamPreparation.DefiningClases.bakery;

public class Employee {
    private String name;
    private int age;
    private String country;

    public Employee(String name, int age, String county){
        this.name = name;
        this.age = age;
        this.country = county;
    }
    @Override
    public String toString(){
        return String.format("Employee: %s, %d (%s)", getName(), getAge(), getCountry());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
