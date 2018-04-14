package practice06;

import static java.lang.String.format;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {

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
}
