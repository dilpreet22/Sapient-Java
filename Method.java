public class Method{
    public static void main(String[] args) {
        System.out.println("called before method1 executing");
        method1();
        System.out.println("called of method 1");
    }
    public static void method1()
    {
        System.out.println("calling of method 2");
        method2();
        System.out.println("called of method 3");

    }
    public static void method2()
    {
        System.out.println("calling of method 3");
        
    }
}