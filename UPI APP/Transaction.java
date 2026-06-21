public class Transaction {
  public User sender;
  public User receiver;
  public double amount;
  public String status;

  public Transaction(User sender,User receiver,double amount,String status) {
    this.sender=sender;
    this.receiver=receiver;
    this.amount=amount;
    this.status=status;
  }
  public Void printTransaction(){
   System.out.println("Transaction:"+sender.getName()+" "+receiver.getName()+" Rs. "+amount+" Status: " +Status);
  }
}
