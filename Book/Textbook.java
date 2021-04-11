package Book;

public class Textbook extends Book{
    int gradeLevel;
   
    public int getGradeLevel()
    {
        return gradeLevel;
    }

    public void setGradeLevel(int level)
    {
        gradeLevel = level;
         System.out.println("The grade level is: " + gradeLevel);
    }
}