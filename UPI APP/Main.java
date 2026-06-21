public class Main{
  public static void main(String[]args){

    BankAccount acc1=new BankAccount(accNo:"123",balance:5000);
    BankAccount acc2=new BankAccount(accNo:"456",balance:3000);

    User Abhay=new User(name:"Abhay",upiId:"abhay@upi",acc1);
    User Rahul=new User(name:"Rahul",upiId:"rahul@upi",acc2);
  }
}
