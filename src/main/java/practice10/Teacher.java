package practice10;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.google.common.base.Joiner.on;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Teacher extends Person {
    private  Set<Klass> classes = new HashSet<>();

    public Teacher(int id, String name, int age, Set<Klass> klasses) {
        super(id, name, age);
        this.classes = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return on(" ").join(asList(super.introduce(), format("I am a Teacher. I teach %s.", getTeachClass())));
    }

    public String introduceWith(Student student) {
        return on(" ").join(asList(super.introduce(), format("I am a Teacher. %s", teachStudent(student))));
    }

    public Set<Klass> getClasses() {
        return this.classes;
    }

    public boolean isTeaching(Student student) {
        return this.classes.contains(student.getKlass());
    }

    private String getTeachClass() {
        return this.classes.size() == 0 ? "No Class" : format("Class %s",
                on(", ").join(this.classes.stream().map(klass -> klass.getNumber()).sorted().collect(Collectors.toList())));
    }

    private String teachStudent(Student student) {
        return isTeaching(student) ? format("I teach %s.", student.getName()) : format("I don't teach %s.", student.getName());
    }

}
