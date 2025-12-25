class moveZeros{
    public static void MoveZeros(int[] arr){
        int i = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] !=0){
                int temp = arr[j];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
}