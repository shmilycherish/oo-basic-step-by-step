package practice11;

import static java.lang.String.format;

public abstract class Person {
    private int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return format("My name is %s. I am %s years old.", this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }

        Person test = (Person) obj;
        return this.id == test.id;
    }

    public abstract void confirmStudentBecomeLeader(Student student);

    public abstract void confirmStudentJoin(Student student);
}
