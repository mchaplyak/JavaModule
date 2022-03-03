package lesson2.classes.hw;

import java.util.Objects;

public class Workstation extends Laptop {
    private String os;

    public Workstation() {
    }

    public Workstation(String processor, int ramGb, boolean gpuIsInteger, int quantityOfPorts, double weight, String os) {
        super(processor, ramGb, gpuIsInteger, quantityOfPorts, weight);
        this.os = os;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "os='" + os + '\'' +
                '}';
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Workstation that = (Workstation) o;
        return Objects.equals(os, that.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), os);
    }
}
