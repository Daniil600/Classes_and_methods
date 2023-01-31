import java.util.Objects;

public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int yearPublication;

    public Book(String nameBook, Author nameAuthor, int yearPublication){
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearPublication = yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getNameAuthor() {
        return nameAuthor;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass())
            return false;
        Book book = (Book) other;
        return yearPublication == book.yearPublication && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearPublication);
    }

    @Override
    public String toString() {
        return "nameBook ='" + nameBook + "\n" +
                ", yearPublication=" + yearPublication;
    }
}