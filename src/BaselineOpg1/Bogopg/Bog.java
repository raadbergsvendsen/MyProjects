package BaselineOpg1.Bogopg;

public class Bog
{
    Bog(String isbn, String title, int year)
    {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
    }

    private String isbn; // = 1234;
    private String title; // = "Learn how to code";
    private int year; //= 1994;

    String getIsbn()
    {
        return isbn;
    }

    public String toString()
    {
        return "ISBN: " + isbn + " Title: " + title + " Year: " + year;
    }



}
