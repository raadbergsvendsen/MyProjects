package BaselineOpg1.Arraylistopg;

import java.util.ArrayList;
import java.util.Scanner;

public class Baselineopgaver1
{
    public static void main(String[] args)
    {
        boolean test;
        ArrayList<String> strings = new ArrayList<>();
        strings.add("dummy");
        String bla = "bla";
        Scanner scanner = new Scanner(System.in);
        System.out.println("hey bruger, giv mig en string: ");
        bla = scanner.nextLine();


        test = arrayMetode(strings, bla);
        if (test)
        {
            System.out.println("Det lykkedes");
        }
        else
        {
            System.out.println("Din String er der allerede, så den er ikke tilføjet");
        }
        System.out.println(strings);
    }

    public static boolean arrayMetode(ArrayList<String> array, String str)
    {
        int size = array.size();
        for (int i = 0; i < size; i++)
        {
            String element = array.get(i);
            if (element.equals(str))
            {
                return false;
            }
        }
        array.add(str);
        return true;

    }
}
