class SelectionSort {
    int[] numbers;

    // Constructor
    SelectionSort(int[] numbers) {
        this.numbers = numbers;
    }

    void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[smallest]) {
                    smallest = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[smallest];
            numbers[smallest] = temp;
        }
    }

    void print() {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 8, 1, 2};
        SelectionSort obj = new SelectionSort(data);
        obj.sort();
        obj.print();
    }
}