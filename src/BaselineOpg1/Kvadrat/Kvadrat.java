package BaselineOpg1.Kvadrat;

public class Kvadrat
{
    public static void main(String[] args)
    {
        printSquare(5, '+');
    }

    public static void printSquare(int size, char symbol)
    {

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(symbol + "  ");
            }
            System.out.println(symbol + "  ");
        }
    }
}
