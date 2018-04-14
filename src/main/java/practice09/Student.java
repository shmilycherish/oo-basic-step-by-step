package practice09;

import static com.google.common.base.Joiner.on;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return on(" ").join(asList(super.introduce(), format("I am a Student. I am %s %s.", studentRole(), this.klass.getDisplayName())));
    }

    private String studentRole() {
        if (this == klass.getLeader()) {
            return "Leader of";
        }
        return "at";
    }
}
