package LinearSearch;

public class LinearSearch{

    public static int LinearSearch(int[] arr, int target) {
         for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                 return i;
                }
             }
             return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 13;

        int result = LinearSearch(arr, target);

        if (result != -1)
            System.out.println("Target found at index: " + result);
        else
            System.out.println("Target not found in the array.");
    }
    
}





