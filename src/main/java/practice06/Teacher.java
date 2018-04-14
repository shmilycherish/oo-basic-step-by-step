package practice06;

import static com.google.common.base.Joiner.on;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Teacher extends Person {
    private final int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = 0;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return on(" ").join(asList(super.introduce(), format("I am a Teacher. I teach %s.", getTeachClass())));
    }

    private String getTeachClass() {
        return this.klass == 0 ? "No Class" : format("Class %s", this.getKlass());
    }
}
