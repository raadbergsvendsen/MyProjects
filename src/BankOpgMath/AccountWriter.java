package BankOpgMath;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AccountWriter
{
    public void accountFileWriter(ArrayList<BankAccount> accountArray) throws IOException
    {
        FileWriter fileWriter;
        fileWriter = new FileWriter("C:\\Users\\raadver\\IdeaProjects\\Semester2\\src\\BankOpgMath\\BankAccounts");

        for (int i = 0; i < accountArray.size(); i++)
        {
            fileWriter.write("Accountnumber: " + accountArray.get(i).getAccountNumber() + "\n");
            fileWriter.write("Regnumber: " + accountArray.get(i).getRegNumber() + "\n");
            fileWriter.write("Name: " + accountArray.get(i).getName() + "\n");
            fileWriter.write("Lastname: " + accountArray.get(i).getLastName() + "\n");
            fileWriter.write("Birthday: " + accountArray.get(i).getBirthDay() + "\n");
            fileWriter.write("Mobilenumber: " + accountArray.get(i).getMobileNumber() + "\n");
            fileWriter.write("Salary: " + accountArray.get(i).getSalary() + "\n");
            fileWriter.write("Adress: " + accountArray.get(i).getAddress() + "\n");
            fileWriter.write("Email: " + accountArray.get(i).getEmail() + "\n");
            fileWriter.write("Secretquestion: " + accountArray.get(i).getSecretQuestion() + "\n");
            fileWriter.write("Secretanswer: " + accountArray.get(i).getSecretAnswer() + "\n");
            fileWriter.write("Saldo: " + accountArray.get(i).getSaldo() + "\n");
        }
        fileWriter.close();
    }
}
