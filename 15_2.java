class Account 
{
    String custname;
    int accno;

    Account() 
    {
        custname = "";
        accno = 0;
    }

    Account(String custname, int accno) 
    {
        this.custname = custname;
        this.accno = accno;
    }
}

class SavingAccount extends Account 
{
    double savingbal;
    double minbal;

    SavingAccount(String custname, int accno, double savingbal, double minbal) 
    {
        super(custname, accno);
        this.savingbal = savingbal;
        this.minbal = minbal;
    }
}

class AccountDetail extends SavingAccount 
{
    double depositamt;
    double withdrawalamt;

    AccountDetail(String custname, int accno, double savingbal, double minbal, double depositamt, double withdrawalamt) 
    {
        super(custname, accno, savingbal, minbal);
        this.depositamt = depositamt;
        this.withdrawalamt = withdrawalamt;
    }

    void displayDetails() 
    {
        System.out.println("Customer Name: " + custname);
        System.out.println("Account Number: " + accno);
        System.out.println("Saving Balance: " + savingbal);
        System.out.println("Minimum Balance: " + minbal);
        System.out.println("Deposit Amount: " + depositamt);
        System.out.println("Withdrawal Amount: " + withdrawalamt);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        AccountDetail ad = new AccountDetail("John Doe", 123456, 5000.0, 1000.0, 2000.0, 1500.0);
        ad.displayDetails();
    }
}

