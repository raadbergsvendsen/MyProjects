package BaselineOpg1.Menuvalg;

import java.util.Scanner;

public class Menuvalg
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Menuvalg menuvalg = new Menuvalg();
        menuvalg.menuOptions();


    }

    public String menuOptions()
    {
        String scannerChoice;
        Scanner scanner = new Scanner(System.in);


        System.out.println("1: Beregn");
        System.out.println("2: Udksriv");
        System.out.println("3: Hjælp");

        scannerChoice = scanner.next();
        System.out.println(scannerChoice);

        if (!scannerChoice.equals("1") && !scannerChoice.equals("2") && !scannerChoice.equals("3"))
        {
            System.out.println("Wrong number!");
        }

        else if (scannerChoice.equals("1"))
        {
            System.out.println("Velkommen til Beregnsafdelingen");
        }else  if (scannerChoice.equals("2"))
        {
            System.out.println("Hvad vil du udskrive?");
        }else if (scannerChoice.equals("3"))
        {
            System.out.println("Beskriv dit problem");
        }
        return scannerChoice;
    }
}
