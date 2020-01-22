public class QuickSort {

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("sorted array");
        printArray(arr);
    }

    public int partion(int[] arr, int l, int r) {

        int index = l - 1;

        int pivot = arr[r];

        for (int i = l; i < r; i++) {

            if (arr[i] < pivot) {

                index++;

                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }


        }
        int temp = arr[index + 1];
        arr[index + 1] = pivot;
        arr[r] = temp;

        return index + 1;

    }

    public void sort(int[] arr, int l, int r) {

        if (l < r) {

            int pi = partion(arr, l, r);
            sort(arr, l, pi - 1);
            sort(arr, pi + 1, r);


        }


    }
}



