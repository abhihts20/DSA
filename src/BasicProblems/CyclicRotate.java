package BasicProblems;

import java.util.Scanner;

public class CyclicRotate {
//    shift element of an array by one cyclically
    //Store last element in a variable (x)
//    Shift all ele one pos ahead
//    replace first ele with x
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotate(arr, size);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int a[], int n) {
        int x = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = x;

    }
}
