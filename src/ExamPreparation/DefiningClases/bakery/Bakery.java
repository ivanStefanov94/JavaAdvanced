package ExamPreparation.DefiningClases.bakery;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private List<Employee> employees;
    private String name;
    private int capacity;

    public Bakery(String name, int capacity){
        this.employees = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }
    public void add(Employee employee){
        if(this.employees.size() < this.capacity){
        employees.add(employee);}
    }
    public boolean remove(String name){
        for (Employee employee : this.employees) {
            if(employee.getName().equals(name)){
               return this.employees.remove(name);
            }
        }
        return false;
    }
    public Employee getOldestEmployee(){
        return employees.stream()
                .max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
                .get();
    }
    public Employee getEmployee(String name){
        for (Employee employee : employees) {
            if(employee.getName().contains(name)){
                return employee;
            }
        }return null;
    }

    public int getCount() {
        return this.employees.size();
    }
    public String report(){
        StringBuilder builder = new StringBuilder();
        builder.append("Employees working at Bakery ").append(this.name).append(":").append(System.lineSeparator());
        for (Employee employee : employees) {
            builder.append(employee.toString()).append(System.lineSeparator());
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }

}
