package pakages_EX;

class AccountDeposit {
    private int balance = 1000;

    public synchronized boolean withdraw(int amount, String user) {
        if (amount <= balance) {
            System.out.println(user + " is trying to withdraw amount is : " + amount);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println(user + " successfully withdrawn amount is: " + amount);
            System.out.println("Remaining balance: " + balance);
            return true;
        } else {
            System.out.println(user + " failed to withdraw " + amount + " (Insufficient balance is :)");
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
}
