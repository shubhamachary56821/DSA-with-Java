// package Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr){
        if(arr.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < arr.length; i++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    
}
