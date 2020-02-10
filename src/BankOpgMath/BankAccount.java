package BankOpgMath;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount
{
    private int accountNumber;
    private int regNumber;
    private String name;
    private String lastName;
    private int birthDay;
    private int mobileNumber;
    private int salary;
    private String address;
    private String email;
    private String secretQuestion;
    private String secretAnswer;
    private int saldo;

    BankAccount()
    {
    }

    int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public int getRegNumber()
    {
        return regNumber;
    }

    public void setRegNumber(int regNumber)
    {
        this.regNumber = regNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(int birthDay)
    {
        this.birthDay = birthDay;
    }

    public int getMobileNumber()
    {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getSecretQuestion()
    {
        return secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion)
    {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer()
    {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer)
    {
        this.secretAnswer = secretAnswer;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }

//    private invistmetions;

    BankAccount(int accountNumber, int regNumber, String name, String lastName, int birthDay, int mobileNumber, int salary, String address, String email, String secretQuestion, String secretAnswer, int saldo)
    {
        this.accountNumber = accountNumber;
        this.regNumber = regNumber;
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.address = address;
        this.email = email;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.saldo = saldo;
    }

    public Scanner theFile()
    {
        Scanner input = null;

        try
        {
            input = new Scanner(new File("C:\\Users\\raadver\\IdeaProjects\\Semester2\\src\\BankOpgMath\\BankAccounts"));
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return  input;
    }

    public ArrayList<BankAccount> initAccount()
    {
        Scanner input = theFile();
        ArrayList<BankAccount> accountArray = new ArrayList<>();

        int accountNumber = -1;
        int regNumber = -1;
        String name = "";
        String lastName = "";
        int birthDay = -1;
        int mobileNumber = -1;
        int salary = -1;
        String address = "";
        String email = "";
        String secretQuestion = "";
        String secretAnswer = "";
        int saldo = -1;

        while (input.hasNextLine())
        {
            String[] lineArray = input.nextLine().split(": ");

            if (lineArray[0].equalsIgnoreCase("Accountnumber"))accountNumber = Integer.parseInt(lineArray[1]);
            if (lineArray[0].equalsIgnoreCase("Regnumber"))regNumber = Integer.parseInt(lineArray[1]);
            if (lineArray[0].equalsIgnoreCase("Name"))name = lineArray[1];
            if (lineArray[0].equalsIgnoreCase("Lastname"))lastName = lineArray[1];
            if (lineArray[0].equalsIgnoreCase("Birthday"))birthDay = Integer.parseInt(lineArray[1]);
            if (lineArray[0].equalsIgnoreCase("Mobilenumber"))mobileNumber = Integer.parseInt(lineArray[1]);
            if (lineArray[0].equalsIgnoreCase("Salary"))salary = Integer.parseInt(lineArray[1]);
            if (lineArray[0].equalsIgnoreCase("Adress"))address = lineArray[1];
            if (lineArray[0].equalsIgnoreCase("Email"))email = lineArray[1];
            if (lineArray[0].equalsIgnoreCase("Secretquestion"))secretQuestion = lineArray[1];
            if (lineArray[0].equalsIgnoreCase("Secretanswer"))secretAnswer = lineArray[1];
            if (lineArray[0].equalsIgnoreCase("Saldo"))saldo = Integer.parseInt(lineArray[1]);

            if (accountNumber != -1 && regNumber != -1 && !name.equalsIgnoreCase("") && !lastName.equalsIgnoreCase("") && birthDay != -1 && mobileNumber != -1 && salary != -1 && !address.equalsIgnoreCase("") && !email.equalsIgnoreCase("") && !secretQuestion.equalsIgnoreCase("") && !secretAnswer.equalsIgnoreCase("") && saldo != -1);
            {
                BankAccount fileReader = new BankAccount(accountNumber, regNumber, name, lastName, birthDay, mobileNumber, salary, address, email, secretQuestion, secretAnswer, saldo);

                accountArray.add(fileReader);

                accountNumber = -1;
                regNumber = -1;
                name = "";
                lastName = "";
                birthDay = -1;
                mobileNumber = -1;
                salary = -1;
                address = "";
                email = "";
                secretQuestion = "";
                secretAnswer = "";
                saldo = -1;
            }
        }
        return accountArray;
    }
}
