package BankOpgMath;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainTest
{
    public static void main(String[] args) throws IOException
    {
        BankAccount bankAccount = new BankAccount();
        RegisterBankAccount registerBankAccount = new RegisterBankAccount();
        AccountWriter accountWriter = new AccountWriter();


        ArrayList<BankAccount> accountArray = bankAccount.initAccount();

        registerBankAccount.registerAccount(accountArray);
        accountWriter.accountFileWriter(accountArray);





    }
}
