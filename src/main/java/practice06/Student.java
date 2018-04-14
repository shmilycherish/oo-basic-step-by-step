package practice06;

import static com.google.common.base.Joiner.on;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Student extends Person {
    private final int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return on(" ").join(asList(super.introduce(), format("I am a Student. I am at Class %s.", this.klass)));
    }
}
