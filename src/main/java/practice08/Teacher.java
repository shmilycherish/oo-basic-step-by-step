package practice08;

import static com.google.common.base.Joiner.on;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Teacher extends Person {
    private final Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = null;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return on(" ").join(asList(super.introduce(), format("I am a Teacher. I teach %s.", getTeachClass())));
    }

    public String introduceWith(Student student) {
        return on(" ").join(asList(super.introduce(), format("I am a Teacher. %s", teachStudent(student))));
    }

    private String getTeachClass() {
        return this.klass == null ? "No Class" : this.klass.getDisplayName();
    }

    private String teachStudent(Student student) {
        return this.klass.equals(student.getKlass()) ? format("I teach %s.", student.getName()) : format("I don't teach %s.", student.getName());
    }
}
