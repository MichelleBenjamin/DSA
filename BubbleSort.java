static class BubbleSort {
int [] arr;
BubbleSort(int [] arr) {
    this.arr=arr;
}

void sort(){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}

void print() {
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 }

}

public static void main(String[] args){

    int [] arr={5,4,3,2,1,90};
    BubbleSort Sorter=new BubbleSort(arr);
    System.out.println("Before Sorting:");
    Sorter.print();
    Sorter.sort();
    System.out.println("After Sorting:");
    Sorter.print();
}