package Task_4;

public class Main {
    public static void main(String[] args) {

        Reader man = new Reader("Petya", 5777, "Psychology",
                "11-11-90", 123_45_67);

        man.takeBook();
        man.returnBook();

        man.takeBook("Brain", "Body", "Head", "Heart");
        man.takeBook(23);
        man.returnBook(2);
        man.returnBook("Head", "Heart");
    }
}
