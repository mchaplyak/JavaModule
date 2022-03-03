package lesson2.classes.cw;

import java.util.Objects;

public class Comics extends Book {
    private boolean isColor;

    public Comics() {
    }

    public Comics(int length, String title, String author, int numOfPages, boolean isColor) {
        super(length, title, author, numOfPages);
        this.isColor = isColor;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "isColor=" + isColor +
                '}';
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Comics comics = (Comics) o;
        return isColor == comics.isColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isColor);
    }

    @Override
    public void print() {
        System.out.println("Comics is printed");
    }
}
