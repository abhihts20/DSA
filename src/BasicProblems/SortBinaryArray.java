package BasicProblems;

public class SortBinaryArray {
    //    Sorting binary array in linear time
    //   array Element  0,1
//    int n=sizeof(A)/sizeof(A[0])
    public static void main(String[] args) {
        int A[] = {0, 0, 1, 0, 1, 1, 0, 1, 0, 0};
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        sortBin(A, A.length);
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void sortBin(int[] a, int size) {
        int zeroes = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == 0)
                zeroes++;
        }
        int k = 0;
        while (--zeroes > 0) {
            a[k++] = 0;
        }
        while (k < size) {
            a[k++] = 1;
        }
    }
}
