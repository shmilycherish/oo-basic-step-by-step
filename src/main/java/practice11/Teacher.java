package practice11;

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
        registerToEachClass();
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

    public void confirmStudentJoin(Student student) {
        System.out.println(format("I am %s. I know %s has joined Class %s.", getName(), student.getName(), student.getKlass().getNumber()));
    }

    @Override
    public void confirmStudentBecomeLeader(Student student) {
        System.out.println(format("I am %s. I know %s become Leader of Class %s.", getName(), student.getName(), student.getKlass().getNumber()));
    }


    private void registerToEachClass() {
        classes.stream().forEach(klass -> klass.registerNotifiedPerson(this));
    }
}
