class MergeSort {
    int[] numbers;

    MergeSort(int[] numbers) {
        this.numbers = numbers;
    }

    void sort() {
        mergeSort(numbers);
    }

    void mergeSort(int[] arr) {
        if (arr.length < 2) return;       // 1 element = already sorted

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // split
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < arr.length; i++)
            right[i - mid] = arr[i];

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // pick the smaller front element
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        // copy leftovers
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
    }

    void print() {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 8, 1, 2, 7, 4, 6};
        MergeSort obj = new MergeSort(data);
        obj.sort();
        obj.print();
    }
}
