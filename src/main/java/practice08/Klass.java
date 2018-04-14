package practice08;

import static java.lang.String.format;

public class Klass {
    private int number;
    private Student leader;

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
        this.leader = student;
    }

    public Student getLeader() {
        return leader;
    }
}