package lesson2.classes.cw;

import lesson2.interfaces.Instrument;

import java.util.Objects;

public class Trumpet implements Instrument {

    private String diameter;

    public Trumpet() {
    }

    public Trumpet(String diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Trumpet is play");
    }


    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter='" + diameter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return Objects.equals(diameter, trumpet.diameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter);
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }
}
