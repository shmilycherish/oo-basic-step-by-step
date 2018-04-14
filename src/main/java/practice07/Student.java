package practice07;

import static com.google.common.base.Joiner.on;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Student extends Person {
    private final Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass ;
    }

    @Override
    public String introduce() {
        return on(" ").join(asList(super.introduce(), format("I am a Student. I am at %s.", this.klass.getDisplayName())));
    }
}
