package practice03;

public class Worker {
    private final String name;
    private final int age;

    public Worker(String name, int age) {

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
        return "I am a Worker. I have a job.";
    }
}
