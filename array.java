public class array{
    static int rowCount=4;
    static int colCount=4;
    static int value=10;
    public static void main(String[] args) {
        
       

        int twoArray[][]= new int[rowCount][colCount];
       
        populateArray(twoArray);
        printArray(twoArray);
    }
     private static void populateArray(int[][] twoArray){
        for(int row=0; row<rowCount;row++)
        {
            for(int col=0;col<colCount;col++)
            {
              twoArray[row][col]=value++;
            }
        }
         
     }

     private static void printArray(int[][] twoArray){
        for(int row=0; row<rowCount;row++)
        {
            for(int col=0;col<colCount;col++)
            {
              System.out.println(twoArray[row][col]+"\t");
              
            }
            System.out.println();
        }
    }
}