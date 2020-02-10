package BaselineOpg1.Bogopg;

import java.util.ArrayList;

public class Biblotek
{
    public Biblotek()
    {
        biblo = new ArrayList<Bog>();
    }

    public static void main(String[] args)
    {
        Biblotek biblotek = new Biblotek();
        Bog bog1 = new Bog("1234", "Learn how to code", 1994);
        Bog bog2 = new Bog("5678", "Did it work?", 1995);
        biblotek.addBog(bog1);
//        biblotek.addBog(bog2);
        biblotek.checkBook(bog1);
        biblotek.checkBook(bog2);
        System.out.println(biblotek.checkBook(bog1));
        System.out.println(bog1.toString());
        System.out.println(biblotek.checkBook(bog2));
        System.out.println(bog2.toString());
    }

    private ArrayList<Bog> biblo;

    public void addBog(Bog arrayBog)
    {
        biblo.add(arrayBog);
    }

    public boolean checkBook(Bog bogTest)
    {
        int size = biblo.size();
        for (int i = 0; i < size; i++)
        {
            Bog element = biblo.get(i);
            if (element.getIsbn().equals(bogTest.getIsbn()))
            {
                return true;
            }
        }
        return false;
    }
}
