public class MergeSort {

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {


        System.out.println("This is merge sort");

        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);

    }

    public void merge(int[] arr, int l, int m, int r) {


        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];

        int[] right = new int[n2];
        int i = 0;
        int j = 0;

        for (i = 0; i < n1; ++i) {

            left[i] = arr[l + i];


        }
        for (j = 0; j < n2; ++j) {

            right[j] = arr[m + j + 1];

        }

        i = 0;
        j = 0;
        int k = l;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {


                arr[k] = left[i];
                k++;
                i++;

            } else {
                arr[k] = right[j];
                k++;
                j++;
            }

        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }


    }

    public void sort(int[] arr, int l, int r) {

        if (l < r) {

            int m = (l + r) / 2;


            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);


        }


    }


}
