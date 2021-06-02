package sorting;


public class HeapSort {


    public  void heapify(int[] arr, int i,int size) { 
        int left = 2*i+1;
        int right = 2*i+2;
        int max;
        if(left <= size && arr[left] > arr[i]){
           max=left;
        } else {
           max=i;
        }
   
        if(right <= size && arr[right] > arr[max]) {
           max=right;
        }
       
        if(max!=i) {
           move(arr,i, max);
           heapify(arr, max,size);
        }
     }

     public void move(int[] arr, int left,int right) {
         int tmp = arr[left];
         arr[left] = arr[right];
         arr[right] = tmp;
     }
     



    public void heapsort(int[] arr) {
        for(int i=(arr.length-1)/2; i>=0; i--){
            heapify(arr,i,arr.length-1);
       }

    }

    public void display(int[] arr) {
        for(int i=0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // 
        int arr[] = new int[]{20,10,15,25,45};
        HeapSort sort = new HeapSort();
        sort.heapsort(arr);
        sort.display(arr);

    }
    
}
