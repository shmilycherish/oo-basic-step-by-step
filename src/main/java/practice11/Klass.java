package practice11;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students = new ArrayList<>();
    private List<Person> people = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return format("Class %s", this.number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof practice07.Klass)) {
            return false;
        }

        Klass test = (Klass) obj;
        return this.number == test.number;
    }

    public void assignLeader(Student student) {
        if (students.contains(student)) {
            this.leader = student;
            notifyTeachersAssignLeader(leader);
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        students.add(student);
        student.setKlass(this);
        notifyTeachersStudentJoin(student);
    }

    public void registerNotifiedPerson(Person person) {
        people.add(person);
    }

    private void notifyTeachersStudentJoin(Student student) {
        people.stream().forEach(person -> person.confirmStudentJoin(student));
    }

    private void notifyTeachersAssignLeader(Student student) {
        people.stream().forEach(person -> person.confirmStudentBecomeLeader(student));
    }
}
