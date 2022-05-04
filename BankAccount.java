public class BankAccount {
    int balance;

    //i forgor what it does 💀💀
    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    //Method for the checkBalance() function
    public void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    //Method for the deposit() function
    public void deposit(int amountToDeposit) {
//        if statement so that if a negative value is inputted, the sign changes Example : -1 changes to +1
        if (amountToDeposit < 0){
            balance = balance - amountToDeposit;
            System.out.println("You just deposited ₹" + -1 * amountToDeposit);
        } else {
            balance = balance + amountToDeposit;
            System.out.println("You just deposited ₹" + amountToDeposit);
        }
    }

    //Method for the withdraw() function
    public int withdraw(int amountToWithdraw) {
//        if statement so that if a negative value is inputted, the sign changes Example: -1 changes to +1
        if (amountToWithdraw < 0) {
            balance = balance + amountToWithdraw;
            System.out.println("You just withdrew ₹" + -1 * amountToWithdraw);
        } else {
            balance = balance - amountToWithdraw;
            System.out.println("You just withdrew ₹" + amountToWithdraw);
        }
        return amountToWithdraw;
    }

    //Method for debt() function
    /*
    public void debt() {
        if (balance < 0) {
            int inDebt = balance;
            System.out.println("IMAGINE BEING ₹" + inDebt + " IN DEBT. COULDNT BE ME OMGGGGGG L+Rotio");
        } else if (balance == 0) {
            System.out.println("BROKE GET A JOB NUB")
        } else {
            System.out.println("Congo, You're not in debt. AB NAACHU? ACHAAR DAALU?");
        }
    }
    */

    public void debt(){
        if (balance < 0) {
            int inDebt = balance;
            System.out.println("You are ₹" + inDebt + " in Debt");
        } else if (balance == 0) {
            System.out.println("You have EXACTLY ₹0 in your BankAccount...");
    }
}


    //Will be used to print amount of money saved   
    public String toString() {
        return "This is a savings account with ₹" + balance + " saved.";
    }

    //Main() starts here

    public static void main(String[] args) {

        BankAccount savings = new BankAccount(69420);

        //Prints your current balance
        savings.checkBalance();

        //Withdraws given amount
        savings.withdraw(69420*2);

        //Prints your current balance
        savings.checkBalance();

        //Deposits the given amount
        savings.deposit(0);

        //Prints your current balance
        savings.checkBalance();

        System.out.println(savings);
        
        //Prints out if you have debt or not
        savings.debt();

    }   
}

    /*IMPORTANT
    if anyone were to mess with the values. dont mess with them all
    u can change the values in savings.deposit(), savings.withdraw() and BankAccount()
    all of it in main()
    */

