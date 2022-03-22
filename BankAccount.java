public class BankAccount {
    int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    public void debt() {
        if (balance < 0) {
            int inDebt = balance;
            System.out.println("You are " + inDebt + " in debt.");
        }
    }


    public String toString() {
        return "This is a savings account with " + balance + " saved.";
    }

    public static void main(String[] args) {

        BankAccount savings = new BankAccount(2000);

        savings.checkBalance();


        savings.withdraw(300);


        savings.checkBalance();


        savings.deposit(420);


        savings.checkBalance();


        System.out.println(savings);

        savings.debt();

    }

}


    /*IMPORTANT
    if anyone were to mess with the values. dont mess with them all
    u can change the values in savings.deposit(), savings.withdraw() and BankAccount()
    all of it in main()
    */

