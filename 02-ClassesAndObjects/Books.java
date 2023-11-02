public class Books {
    int pages;
    String author;
    String title;
    int pagesRead = 0;

    public void read(int pagesToRead) 
    {
        pagesRead = pagesRead + pagesToRead;
    }
    public void showCurrentPage()
    {
        System.out.println("You are on page " + pagesRead);
    }

    public void showBookInfo()
    {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPages: " + pages);
    }
}
