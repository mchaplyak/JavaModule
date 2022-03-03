package lesson2.classes.hw;

import java.util.Objects;

public class Ultrabook extends Laptop{
    private double mmThin;

    public Ultrabook() {
    }

    public Ultrabook(String processor, int ramGb, boolean gpuIsInteger, int quantityOfPorts, double weight, double mmThin) {
        super(processor, ramGb, gpuIsInteger, quantityOfPorts, weight);
        this.mmThin = mmThin;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "mmThin=" + mmThin +
                '}';
    }

    public double getMmThin() {
        return mmThin;
    }

    public void setMmThin(double mmThin) {
        this.mmThin = mmThin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ultrabook ultrabook = (Ultrabook) o;
        return Double.compare(ultrabook.mmThin, mmThin) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mmThin);
    }
}
