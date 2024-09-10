import java.util.Arrays;

public class BinaryTree {
    public static void main(String[] args) {

        int [] arr ={1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};

        // ascOrder(arr);
        // for(int i = 0; i < arr.length; i++){
            // System.out.print(arr[i] + "");
        // }
        // System.out.println(Arrays.binarySearch(arr, 19) + "");
        // System.out.println(binarySearch(arr, 19) + "");

    }
    private static int binarySearch(int [] numbers, int numberToFind){
        int low = 0;
        int high = numbers.length -1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if(numberToFind == middleNumber){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                high = middlePosition - 1;
            }else{
                low = middlePosition +1;
            }
        }
        return -1;
    }
    private static void ascOrder(int [] arr) {
        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
            
        }
       
   }
}