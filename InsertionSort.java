public class InsertionSort {
    int [] arr;
    InsertionSort(int[] arr){
        this.arr=arr;

    }

    
void sort(){
    for(int i=1;i<arr.length;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
    }
}

void print(){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");

    }
    System.out.println();
 }


public static void main(String[] args){
    int [] arr={5,4,3,2,1,90};
    InsertionSort s=new InsertionSort(arr);
    System.out.println("Before Sorting:");
    s.print();
    System.out.println("After Sorting:");
    s.sort();
    s.print();

}
}