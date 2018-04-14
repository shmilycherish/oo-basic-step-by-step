package practice07;

import static java.lang.String.format;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return format("Class %s", this.number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Klass)) {
            return false;
        }

        Klass test = (Klass) obj;
        return this.number == test.number;
    }
}
