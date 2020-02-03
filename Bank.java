public class Bank {
    double amount=100;
    public double deposit(int dep)
    {
        amount=amount+dep;
        return amount;
    }
    public double withdraw(int with){
       if(with<amount)
       {
        amount-=with;
       } 
       else{
       amount=amount+0;
       } 
           }
       return amount;
    }
    public double check(){
        return amount;
    
    }
}