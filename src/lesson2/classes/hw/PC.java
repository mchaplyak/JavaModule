package lesson2.classes.hw;

import java.util.Objects;

public class PC {
    private String processor;
    private int ramGb;
    private boolean gpuIsInteger;

    public PC() {
    }

    public PC(String processor, int ramGb, boolean gpuIsInteger) {
        this.processor = processor;
        this.ramGb = ramGb;
        this.gpuIsInteger = gpuIsInteger;
    }

    @Override
    public String toString() {
        return "PC{" +
                "processor='" + processor + '\'' +
                ", ramGb=" + ramGb +
                ", gpuIsInteger=" + gpuIsInteger +
                '}';
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public boolean isGpuIsInteger() {
        return gpuIsInteger;
    }

    public void setGpuIsInteger(boolean gpuIsInteger) {
        this.gpuIsInteger = gpuIsInteger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PC pc = (PC) o;
        return ramGb == pc.ramGb && gpuIsInteger == pc.gpuIsInteger && Objects.equals(processor, pc.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ramGb, gpuIsInteger);
    }
}
