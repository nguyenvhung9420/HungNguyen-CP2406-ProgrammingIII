
public class BookArray {
    public static void main(String[] args) {
        Book[] bookArray = new Book[10];
        int counter = 0;
        for (Book aBook: bookArray) {
            if (counter % 2 == 0) {
                bookArray[counter] = new Fiction("Book" + counter);
            } else {
                bookArray[counter] = new NonFiction("Book" + counter);
            }
            counter++;
        }

        for (Book aBook: bookArray) {
            System.out.println(aBook.toString());
        }
    }
}
