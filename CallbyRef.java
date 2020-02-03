public class CallbyRef{
    public static void main(String[] args) {
      int pri=100;
      int[] arr=new int[10];
      callbyValue(pri);
      System.out.println("value of pri after execution:"+pri);
      callbyRef();
      System.out.println("value of array after execution:" +arr[0]);
    } 

    public static void callbyValue(int Value)
    {
        ++value;
    }
    public static void callbyRef(int[] Value)
    {
        
        arr[0]=15;
        System.out.println("after execution" +arr[0]);
    }
}