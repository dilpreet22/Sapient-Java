public class ProgrammingConstruct {

    public static void main(String[] args) {
        

        for (int index = 0; index < args.length; index++) {
            System.out.println("The value of index is:"+args[index]);

            
        }
        if (args.length>0){
            System.out.println("Number of cities passed:" +args.length);
        }
        else{
            System.out.println("Please pass in atleast the name of city");
        }
        int value=args.length;
        while(value>0)
        {
            System.out.println("Printing the value using while " +args[value - 1]);
            value--;
        }
    }
}