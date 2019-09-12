public class MyClass {
    public static void main(String args[]) {
      System.out.println("Banking Program!");
      
      Account myAccount = new CheckingAccount("Tung", 100);
      
      System.out.println(myAccount.getOwner() + " has " + myAccount.getBalance() + " in the bank!");
      
      myAccount.withdraw(150);
      
      myAccount.tell();
      
      myAccount.deposit(100);

      myAccount.tell();

      myAccount.withdraw(60);
      
      myAccount.tell();
      
    }
}