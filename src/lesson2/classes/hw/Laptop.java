package lesson2.classes.hw;

import java.util.Objects;

public class Laptop extends PC{
    private int quantityOfPorts;
    private double weight;

    public Laptop() {
    }

    public Laptop(String processor, int ramGb, boolean gpuIsInteger, int quantityOfPorts, double weight) {
        super(processor, ramGb, gpuIsInteger);
        this.quantityOfPorts = quantityOfPorts;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "quantityOfPorts=" + quantityOfPorts +
                ", weight=" + weight +
                '}';
    }

    public int getQuantityOfPorts() {
        return quantityOfPorts;
    }

    public void setQuantityOfPorts(int quantityOfPorts) {
        this.quantityOfPorts = quantityOfPorts;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return quantityOfPorts == laptop.quantityOfPorts && Double.compare(laptop.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantityOfPorts, weight);
    }
}
