package BaselineOpg1.GrassOpg;

import java.util.Scanner;

public class Grass
{



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double h = scanner.nextDouble();
        double m = scanner.nextDouble();
//        daysTo(h, m);  Dette kan man skippe ved at printe og kalde på samme tid.
        System.out.println(daysTo(h, m) + ": Days to cut");

    }

    public static int daysTo(double h, double m)
    {
        int count = 0;
        for (double i = h; i <= m; i += 0.8)
        {
            count++;
        }
        return count;
    }
}
