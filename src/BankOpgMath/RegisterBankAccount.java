package BankOpgMath;

import java.util.ArrayList;
import java.util.Scanner;

class RegisterBankAccount
{
    BankAccount newBankAccount = new BankAccount();

    public ArrayList<BankAccount> registerAccount(ArrayList<BankAccount> accountArray)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Accountnumber.");
        newBankAccount.setAccountNumber(s.nextInt());
        System.out.println("Regnumber.");
        newBankAccount.setRegNumber(s.nextInt());
        System.out.println("Name.");
        newBankAccount.setName(s.next());
        System.out.println("Lastname.");
        newBankAccount.setLastName(s.next());
        System.out.println("Birthday.");
        newBankAccount.setBirthDay(s.nextInt());
        System.out.println("Mobilenumber.");
        newBankAccount.setMobileNumber(s.nextInt());
        System.out.println("Salary.");
        newBankAccount.setSalary(s.nextInt());
        System.out.println("Adress.");
        newBankAccount.setAddress(s.next());
        System.out.println("Email.");
        newBankAccount.setEmail(s.next("[A-Z]+[a-zA-Z_]+@\\b([a-zA-Z]+.){2}\\b?.[a-zA-Z]+"));
        System.out.println("Secretquestion.");
        newBankAccount.setSecretQuestion(s.next());
        System.out.println("Secretanswer.");
        newBankAccount.setSecretAnswer(s.next());
        System.out.println("Saldo.");
        newBankAccount.setSaldo(s.nextInt());

        accountArray.add(newBankAccount);
        return accountArray;
    }
}
