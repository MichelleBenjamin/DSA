import java.util.Scanner;
public class ArrayOperations {
    int arr[] = new int[10];
    int size = 0;
    void addValue(int value) {
        if (size == 10) {
            System.out.println("Array full!");
            return;
        }
        arr[size] = value;
        size = size + 1;
    }
    void insertValue(int index, int value) {
        if (size == 10) {
            System.out.println("Array full!");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Wrong index!");
            return;
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size = size + 1;
    }
    void fillArray(Scanner sc) {
        System.out.println("Enter numbers and press -1 to stop");
        while (size < 10) {
            int n = sc.nextInt();
            if (n == -1) {
                return;
            }
            arr[size] = n;
            size = size + 1;
        }
    }
    void deleteLast() {
        if (size == 0) {
            System.out.println("Array empty!");
            return;
        }
        size = size - 1;
    }
    void deleteIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size = size - 1;
    }
    void showArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    void searchValue(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.println("Found at " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
    void getValue(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index!");
            return;
        }
        System.out.println(arr[index]);
    }
    void updateValue(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index!");
            return;
        }
        arr[index] = value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperations a = new ArrayOperations();
        int ch = 0;
        while (ch != 11) {
            System.out.println("1.Add Value");
            System.out.println("2.Insert at index");
            System.out.println("3.Fill array");
            System.out.println("4.Delete Last element");
            System.out.println("5.Delete by Index");
            System.out.println("6.Display array");
            System.out.println("7.Search value");
            System.out.println("8.Get value at index");
            System.out.println("9.Update value at index");
            System.out.println("10.Size");
            System.out.println("11.Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter value");
                int v = sc.nextInt();
                a.addValue(v);
            }
            if (ch == 2) {
                System.out.println("Enter index");
                int i = sc.nextInt();
                System.out.println("Enter value");
                int v = sc.nextInt();
                a.insertValue(i, v);
            }
            if (ch == 3) {
                a.fillArray(sc);
            }
            if (ch == 4) {
                a.deleteLast();
            }
            if (ch == 5) {
                System.out.println("Enter index");
                int i = sc.nextInt();
                a.deleteIndex(i);
            }
            if (ch == 6) {
                a.showArray();
            }
            if (ch == 7) {
                System.out.println("Enter value");
                int v = sc.nextInt();
                a.searchValue(v);
            }
            if (ch == 8) {
                System.out.println("Enter index");
                int i = sc.nextInt();
                a.getValue(i);
            }
            if (ch == 9) {
                System.out.println("Enter index");
                int i = sc.nextInt();
                System.out.println("Enter value");
                int v = sc.nextInt();
                a.updateValue(i, v);
            }
            if (ch == 10) {
                System.out.println(a.size);
            }
        }
        System.out.println("Bye");
    }
}
