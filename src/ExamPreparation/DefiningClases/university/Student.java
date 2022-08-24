package ExamPreparation.DefiningClases.university;

public class Student {
    public String firstName;
    public String lastName;
    public String bestSubject;

    public Student(String firstName, String lastName, String bestSubject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bestSubject = bestSubject;
    }

    public String getBestSubject() {
        return bestSubject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString(){
        return String.format("Student: %s %s, %s", getFirstName(), getLastName(), getBestSubject());
    }
}
