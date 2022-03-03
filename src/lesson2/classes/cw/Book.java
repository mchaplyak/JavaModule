package lesson2.classes.cw;

import lesson2.interfaces.Printable;

import java.util.Objects;

public class Book extends Papyrus implements Printable {
    private String title;
    private String author;
    private int numOfPages;

public Book() {
}

    public Book(int length, String title, String author, int numOfPages) {
        super(length);
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }

    public void setCountry(String country) {
        this.title = country;
    }

    public String getCountry() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return numOfPages == book.numOfPages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, author, numOfPages);
    }

    @Override
    public void print() {
        System.out.println("Book is printed");
    }
}
