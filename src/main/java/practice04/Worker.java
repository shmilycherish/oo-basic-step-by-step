package practice04;

import static com.google.common.base.Joiner.on;
import static java.util.Arrays.asList;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return on(" ").join(asList(basicIntroduce(), "I am a Worker. I have a job."));
    }
}
