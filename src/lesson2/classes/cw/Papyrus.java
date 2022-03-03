package lesson2.classes.cw;

import java.util.Objects;

public class Papyrus {
    private int length;

    public Papyrus() {
    }

    public Papyrus(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "length=" + length +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Papyrus papyrus = (Papyrus) o;
        return length == papyrus.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
