package Book;

import java.util.Scanner;

public class CaseProblemNo1 {

    public static void main(String[] args) {
        String BookTitle;
        int BookPages, GradeLevel;

        Book b = new Book();
        Textbook t = new Textbook();
  
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the title of your book: ");
        BookTitle = input.nextLine();
        
        System.out.println("Enter the number of pages: ");
        BookPages = input.nextInt();
        
        System.out.println("Enter the grade level: ");
        GradeLevel = input.nextInt();
        
        b.setBookTitle(BookTitle);
        b.setBookPages(BookPages);
        b.displayBookInfo();
        t.setGradeLevel(GradeLevel);
    }
}
