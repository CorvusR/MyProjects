package demos.others;

public class BubbleSort {
    public static void sort() {
        int arr[] = {10, 2, 33, 444, 55, 6, 777, 88, 9, 100};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        sort();
    }
}
