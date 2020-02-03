public class Client{
    public static void main(String[] args) {
        Bank bk = new Bank();
        System.out.println("Amount after depositing is:" +bk.deposit(100));
        System.out.println("Amount after withdrawl is:" +bk.withdraw(50));
       System.out.println("balancxe is:" +bk.check());
    }
}