public class HeapPractice {
    public void createMinHeap(int[] arr){
        int ptr = 1;
        while(ptr < arr.length){
            minHeapify(arr, ptr++);
        }
    }
    //recursive
    public void minHeapify(int[] arr, int ptr){
        int parent = (ptr-1)/2;
        if(ptr > 0){
            if(arr[ptr] < arr[parent]){ // parent should be smaller
                //swap without extra variable
                System.out.println("swapping\t"+arr[ptr]+":"+arr[parent]);
                arr[ptr] = arr[ptr] + arr[parent];
                arr[parent] = arr[ptr] - arr[parent];
                arr[ptr] = arr[ptr] - arr[parent];
                print(arr);
                minHeapify(arr, parent);
            }
        }
    }
    public void maxHeapify(int[] arr, int ptr){
        int parent = (ptr-1)/2;
        if(ptr > 0){
            if(arr[ptr] > arr[parent]){// parent should be larger
                //swap without extra variable
                System.out.println("swapping\t"+arr[ptr]+":"+arr[parent]);
                arr[ptr] = arr[ptr] + arr[parent];
                arr[parent] = arr[ptr] - arr[parent];
                arr[ptr] = arr[ptr] - arr[parent];
                print(arr);
                minHeapify(arr, parent);
            }
        }
    }
    public void createMaxHeap(int[] arr){
        int ptr = 1;
        while(ptr < arr.length){
            maxHeapify(arr, ptr++);
        }
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        int[] arr = {6,5,9,3,1,8};
        HeapPractice p = new HeapPractice();
        print(arr);
        p.createMinHeap(arr);
        print(arr);
    }
}
