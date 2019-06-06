
public abstract class Book {
    String title;
    double price;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Title: " + title + " Price: " + price;
    }

    abstract void setPrice();
}
