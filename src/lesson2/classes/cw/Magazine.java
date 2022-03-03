package lesson2.classes.cw;

import lesson2.interfaces.Printable;

import java.util.Objects;

public class Magazine extends Book {
    private String country;

    public Magazine() {
    }

    public Magazine(int length, String title, String author, int numOfPages, String country) {
        super(length, title, author, numOfPages);
        this.country = country;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + country + '\'' +
                '}';
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(country, magazine.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), country);
    }

    @Override
    public void print() {
        System.out.println("Magazine is printed");
    }
}
