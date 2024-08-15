package practices.practice06;

public class Book {
    String name;
    String author;
    int numOfPage;

    public Book(String name, String author, int numOfPage) {
        this.name = name;
        this.author = author;
        this.numOfPage = numOfPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numOfPage=" + numOfPage +
                '}';
    }
}
