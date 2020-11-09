package Homework_4;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {10, 8, 3, -1, 0, 7, 17, 77, -9, 7, 8, 29};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
            System.out.println();
    }

}

