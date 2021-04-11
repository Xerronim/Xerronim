package Book; 

public class Book {
    String title;
    int pageNumber;
    
    void setBookTitle(String Btitle)
    {
        title = Btitle;
    }

    void setBookPages(int pages)
    {
        pageNumber = pages;
    }

    public String getBookTitle()
    {
        return title;
    }

    public int getBookPages()
    {
        return pageNumber;
    }

    public void displayBookInfo()
    {
        System.out.println("The book's title is: " + title);
        System.out.println("The number of pages is: " + pageNumber);
    }
}