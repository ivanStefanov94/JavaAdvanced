package ExamPreparation.DefiningClases.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;
    private int capacity;

    public University(int capacity){
        this.students = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount(){
        return this.students.size();
    }
    public String registerStudent(Student student) {
        String text = "";

        if(this.students.size() < capacity){
            if(getStudents().contains(student)){
            text = "Student is already in the ExamPreparation.DefiningClases.university";
        }
        else if(!getStudents().contains(student)){
            this.students.add(student);
            text = String.format("Added student %s %s", student.getFirstName(), student.getLastName());
        }}else{
            text = "No seats in the ExamPreparation.DefiningClases.university";
        }
        return text;
    }



    public String dismissStudent(Student student){
        StringBuilder builder = new StringBuilder();

            if(getStudents().contains(student) && getStudents().contains(student)){
                builder.append("Removed student " ).append(student.getFirstName()).append(" ").append(student.getLastName());
                getStudents().remove(student);
            }else{
                builder.append("Student not found");
            }
        return builder.toString();
    }
    public Student getStudent(String firstName, String lastName){
        if (this.students.size() == 0){
            return null;
        }else{
        for (Student datum : students) {
            if(datum.getFirstName().contains(firstName) && datum.getLastName().contains(lastName)){
                return datum;
            }
        }
        } return null;
    }
    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        for (Student datum : students) {
            builder.append("==Student: First Name = ").append(datum.getFirstName()).append(", Last Name = ")
                    .append(datum.getLastName()).append(", Best Subject = ").append(datum.getBestSubject())
                    .append(System.lineSeparator());
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }

}
