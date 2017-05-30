import java.util.*;
abstract class abstr{
    abstract int checkpin(int pin);
    abstract void checkbalance();
    abstract void withdrawl(int amount);
}

class SBI extends abstr
{
    int balance;
    int pin;
    int ver;

    SBI()
    {
        balance=50500;
        pin=1234;
    }

    int checkpin(int user_pin)
    {
        if(user_pin==pin)
        {
            ver=1;
            System.out.println("Verified, Welcome.");
        }
        else
        {
            ver=0;
            System.out.println("Incorrect pin.");
        }
        return ver;
    }

    void checkbalance()
    {
        System.out.println("Balance is: "+balance);
    }
    void withdrawl(int wid_amt)
    {
        if(wid_amt>balance)
        {
            System.out.println("Insufficient fund");
        }
        else if(wid_amt>10000)
        {
            System.out.println("Sorry limit is 10000");
        }
        else if(wid_amt%100!=0)
        {
            System.out.println("Sorry! Money can be dispenced in multiple of 100 only");
        }
        else
        {
            balance=balance-wid_amt;
            System.out.println("Updated balance is: "+balance);
        }
    }
}

class HDFC extends abstr
{
    int balance;
    int pin;
    int ver;

    HDFC()
    {
        balance=50500;
        pin=1234;
    }

    int checkpin(int user_pin)
    {
        if(user_pin==pin)
        {
            ver=1;
            System.out.println("Verified, Welcome.");
        }
        else
        {
            ver=0;
            System.out.println("Incorrect pin.");
        }
        return ver;
    }

    void checkbalance()
    {
        System.out.println("Balance is: "+balance);
    }
    void withdrawl(int wid_amt)
    {
        if(wid_amt>balance)
        {
            System.out.println("Insufficient fund");
        }
        else if(wid_amt>10000)
        {
            System.out.println("Sorry limit is 10000");
        }
        else if(wid_amt%100!=0)
        {
            System.out.println("Sorry! Money can be dispenced in multiple of 100 only");
        }
        else
        {
            balance=balance-wid_amt;
            System.out.println("Updated balance is: "+balance);
        }
    }
}

class ICICI extends abstr
{
    int balance;
    int pin;
    int ver;

    ICICI()
    {
        balance=50500;
        pin=1234;
    }

    int checkpin(int user_pin)
    {
        if(user_pin==pin)
        {
            ver=1;
            System.out.println("Verified, Welcome.");
        }
        else
        {
            ver=0;
            System.out.println("Incorrect pin.");
        }
        return ver;
    }

    void checkbalance()
    {
        System.out.println("Balance is: "+balance);
    }
    void withdrawl(int wid_amt)
    {
        if(wid_amt>balance)
        {
            System.out.println("Insufficient fund");
        }
        else if(wid_amt>10000)
        {
            System.out.println("Sorry limit is 10000");
        }
        else if(wid_amt%100!=0)
        {
            System.out.println("Sorry! Money can be dispenced in multiple of 100 only");
        }
        else
        {
            balance=balance-wid_amt;
            System.out.println("Updated balance is: "+balance);
        }
    }
}

class mymain
{
    public static void main(String args[])
    {
        int run=1;
        Scanner scn=new Scanner(System.in);
        int pin, valid,opt;
        System.out.println("Please select your bank \n1. SBI\n2. HDFC\n3. ICICI ");
        int bank = scn.nextInt();
        switch(bank) {
            case 1:
                SBI obj = new SBI();
                do
                {
                    System.out.println("Enter pin: ");
                    pin=scn.nextInt();
                    valid=obj.checkpin(pin);
                    if(valid==1)
                    {
                        System.out.println("Press 1 to check balance. \nPress 2 to withdraw");
                        opt=scn.nextInt();
                        switch(opt)
                        {
                            case 1:
                                obj.checkbalance();
                                break;
                            case 2:
                                System.out.println("Enter amount you want to withdraw: ");
                                int amt=scn.nextInt();
                                obj.withdrawl(amt);
                                break;
                            default:
                                System.out.println("Invalid operation selected");
                        }
                    }
                    else
                    {
                        System.out.println("Sorry");
                    }
                    System.out.println("Do you want to continue? Press 1 to continue. Press 2 to exit: ");
                    run=scn.nextInt();
                }while(run==1);
                break;
            case 2:
                HDFC obk = new HDFC();
                do
                {
                    System.out.println("Enter pin: ");
                    pin=scn.nextInt();
                    valid=obk.checkpin(pin);
                    if(valid==1)
                    {
                        System.out.println("Press 1 to check balance. \nPress 2 to withdraw");
                        opt=scn.nextInt();
                        switch(opt)
                        {
                            case 1:
                                obk.checkbalance();
                                break;
                            case 2:
                                System.out.println("Enter amount you want to withdraw: ");
                                int amt=scn.nextInt();
                                obk.withdrawl(amt);
                                break;
                            default:
                                System.out.println("Invalid operation selected");
                        }
                    }
                    else
                    {
                        System.out.println("Sorry");
                    }
                    System.out.println("Do you want to continue? Press 1 to continue. Press 2 to exit: ");
                    run=scn.nextInt();
                }while(run==1);
                break;
            case 3:
                ICICI obm = new ICICI();
                do
                {
                    System.out.println("Enter pin: ");
                    pin=scn.nextInt();
                    valid=obm.checkpin(pin);
                    if(valid==1)
                    {
                        System.out.println("Press 1 to check balance. \nPress 2 to withdraw");
                        opt=scn.nextInt();
                        switch(opt)
                        {
                            case 1:
                                obm.checkbalance();
                                break;
                            case 2:
                                System.out.println("Enter amount you want to withdraw: ");
                                int amt=scn.nextInt();
                                obm.withdrawl(amt);
                                break;
                            default:
                                System.out.println("Invalid operation selected");
                        }
                    }
                    else
                    {
                        System.out.println("Sorry");
                    }
                    System.out.println("Do you want to continue? Press 1 to continue. Press 2 to exit: ");
                    run=scn.nextInt();
                }while(run==1);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}








