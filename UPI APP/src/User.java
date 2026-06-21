BankAccoun class User {
    private String name;
    private String upiId;
    private BankAccount bankAccount;
    public User( String name,String upiId,BankAccount bankAccount){
        this.name=name;
        this.upiId=upiId;
        this.bankAccount=bankAccount;
    }
    public String getName(){
        return name;
    }
    public Void setName(String name){
        this.name=name;
    }
    public String getUpiId(){
        return upiId;
    }
    public Void setUpiId(String upiId){
       this.upiId=upiId;
    }
    public BankAccount getBankAccount(){
        return bankAccount;
    }
    public Void setBankAccount(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }

    public Void checkBalance(){
        System.out.println(name+" Balance Rs: "+BankAccount.getbalance();
    }

}
