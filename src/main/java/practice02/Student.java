package practice02;

import static java.lang.String.format;

public class Student {
    private final String name;
    private final int age;
    private final int klass;

    public Student(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return format("I am a Student. I am at Class %s.", this.klass);

    }
}
