package lesson2.classes.cw;

import lesson2.interfaces.Instrument;

import java.util.Objects;

public class Drum implements Instrument {

    private String size;

    public Drum() {
    }

    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Drums play");
    }


    @Override
    public String toString() {
        return "Drum{" +
                "size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return Objects.equals(size, drum.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
