public class BankAccount {
 private final String accountNo; private double balance;
 public BankAccount(String accountNo,double openingBalance){this.accountNo=accountNo;this.balance=Math.max(0,openingBalance);}
 public void deposit(double amount){if(amount>0)balance+=amount;else System.out.println("Deposit must be positive");}
 public boolean withdraw(double amount){if(amount>0&&amount<=balance){balance-=amount;return true;}return false;}
 public double getBalance(){return balance;}
 @Override public String toString(){return String.format("%s: N%.2f",accountNo,balance);}
 public static void main(String[] args){BankAccount acc=new BankAccount("0123456789",5000);System.out.println(acc);acc.deposit(2500);System.out.println("After deposit: "+acc);System.out.println("Withdrawal successful? "+acc.withdraw(1000));System.out.println("After withdrawal: "+acc);System.out.println("Overdraft successful? "+acc.withdraw(10000));System.out.println("Final account: "+acc);}
}
