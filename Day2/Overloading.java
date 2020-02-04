public class Overloading
{
    public int sum(int a, int b)
    {
        System.out.println("this is first method");
        return a+b;

    }
    public long sum(long a, int b)
    {
        System.out.println("this is first method");
        return a+b;
        
    }
    public int sum(int a, int b,int c)
    {
        System.out.println("this is first method");
        return a+b+c;
        
    }
      public static void main(String[] args) {
        Overloading o= new  Overloading();
        o.sum(12,12);
        o.sum(10,10,10);
    }
}