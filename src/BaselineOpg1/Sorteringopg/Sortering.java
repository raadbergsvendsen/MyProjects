package BaselineOpg1.Sorteringopg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sortering
{
    public static void main(String[] args)
    {
        Sortering sortering = new Sortering();
        sortering.sortText();

    }

    public void sortText()
    {
        Scanner scanner = new Scanner(System.in);
        String[] arraySort = new String[5];
        for (int i = 0; i < arraySort.length; i++)
        {
            arraySort[i] = scanner.next();
        }

        Arrays.sort(arraySort);

        for (int i = 0; i < arraySort.length / 2; i++)
        {
            String temp = arraySort[i];
            arraySort[i] = arraySort[arraySort.length - 1 - i];
            arraySort[arraySort.length - 1 - i] = temp;
        }

        for (String s: arraySort)
        {
            System.out.println(s);
        }

    }
}
