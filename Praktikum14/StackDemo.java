import java.util.Stack; [cite: 19]

public class StackDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Dasar Pemrograman"); [cite: 20]
        Book book2 = new Book("7145", "Hafalah Shalat Delisa"); [cite: 20]
        Book book3 = new Book("3562", "Muhammad Al-Fatih"); [cite: 20]

        Stack<Book> books = new Stack<>(); [cite: 20]
        books.push(book1); [cite: 20]
        books.push(book2); [cite: 20]
        books.push(book3); [cite: 20]

        Book temp = books.peek(); [cite: 21]
        if (temp != null) { [cite: 21]
            System.out.println("Peeked book: " + temp.toString()); [cite: 21]
        }

        Book temp2 = books.pop(); [cite: 21]
        if (temp2 != null) { [cite: 21]
            System.out.println("Popped book: " + temp2.toString()); [cite: 21]
        }
        System.out.println();

        System.out.println("Books remaining in stack:");
        for (Book book : books) { [cite: 22]
            System.out.println(book.toString()); [cite: 22]
        }
        System.out.println();

        System.out.println("Books directly printed (for debugging): " + books); [cite: 23]
        System.out.println();

        System.out.println("Position of book1 in stack (from top, 1-based): " + books.search(book1)); [cite: 24]
        System.out.println("Position of book2 in stack (from top, 1-based): " + books.search(book2)); [cite: 24]
        System.out.println("Position of book3 in stack (from top, 1-based): " + books.search(book3)); [cite: 24]
        System.out.println();
    }
}