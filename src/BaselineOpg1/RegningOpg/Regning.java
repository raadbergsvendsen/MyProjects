package BaselineOpg1.RegningOpg;

public class Regning
{
    public static void main(String[] args)
    {
        Regning regning = new Regning();
        regning.mathMethode(10, 6);

    }

    public void mathMethode(int y, int x)
    {
        if (y > 0 && y <= 50 && x > 0 && x <= 50)
        {

            System.out.println(y + x);
            System.out.println(y - x);
            System.out.println(y / x);
            System.out.println(y * x);

        }else
        {
            try
            {
                System.out.println("You went over the limit");
            } catch (IllegalArgumentException ignored)
            {

            }
        }
    }
}
