package library;

public class Book {
    private int id;
    private String title;
    private String author;
    private int publishedYear;
    private String genre;
    private String status;

    public Book(int id, String title, String author, int publishedYear, String genre, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.genre = genre;
        this.status = status;
    }

    public Book() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getGenre() {
        return genre;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                ", genre='" + genre + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
