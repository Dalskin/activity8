public class Account {
    protected double mBalance  = 0;
    protected double mTotalFee = 0;

    protected String mOwner;
    
    public Account(String owner, double balance) {
        mOwner = owner;
        mBalance = balance;
    }
    
    public double getBalance() {return mBalance;}

    public double getTotalFee() {return mTotalFee;}
    
    public String getOwner() {return mOwner;}
    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("A negative amount is not allowed for deposit!");
        }
        else
            mBalance += amount;
        
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("A negative amount is not allowed for withdraw!");
        }
        else
            mBalance -= amount;
        
    }
    
    public void tell() {
         System.out.println(mOwner + " has " + this.getBalance() + " in the bank. Total fee!" + mTotalFee);
        
    }
    
}