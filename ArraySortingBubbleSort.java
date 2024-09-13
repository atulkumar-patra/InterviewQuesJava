public class ArraySortingBubbleSort {
    
    




    public static void main(String[] args) {
        int i,j,k,temp;
        int arr[] = {32,444,222,11,2,312,3,88,900,76,65,89};
        int n = arr.length;    
        
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){

                if(arr[j] > arr[j+1]){

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
        for (k=0;k<n-1;k++) {
             System.out.println(arr[k]);
            
        }
    }
}
