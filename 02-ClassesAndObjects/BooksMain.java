public class BooksMain {
    public static void main(String[] args) {
        Books book1 = new Books();
        book1.title = "O psie ktory jezdzil koleja";
        book1.author = "Roman Pisarski";
        book1.pages = 70;

        book1.showBookInfo();
        book1.showCurrentPage();
        book1.read(20);
        book1.showCurrentPage();

        Books book2 = new Books();
        book2.title = "Dzieci z Bullerbyn";
        book2.author = "Astrid Lindgren";
        book2.pages = 130;

        book2.showBookInfo();
        book2.showCurrentPage();
        book2.read(13);
        book2.showCurrentPage();
    }
}
