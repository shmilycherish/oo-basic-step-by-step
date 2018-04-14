package practice11;

import static com.google.common.base.Joiner.on;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        registerStudentToClass(this);
    }

    private void registerStudentToClass(Student student) {
        klass.registerNotifiedPerson(student);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return on(" ").join(asList(super.introduce(), format("I am a Student. I am %s %s.", studentRole(), this.klass.getDisplayName())));
    }

    @Override
    public void confirmStudentBecomeLeader(Student student) {
        System.out.println(format("I am %s. I am at Class %s. I know My classmates %s become Leader of the class.", getName(), getKlass().getNumber(), student.getName()));
    }

    @Override
    public void confirmStudentJoin(Student student) {
        System.out.println(format("I am %s. I am at Class %s. I know %s become our new classmate.", getName(), getKlass().getNumber(), student.getName()));
    }

    private String studentRole() {
        if (this == klass.getLeader()) {
            return "Leader of";
        }
        return "at";
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
