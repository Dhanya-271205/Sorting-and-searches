public class P3 {
    // Merge Sort
    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r)
            temp[k++] = (a[i] <= a[j]) ? a[i++] : a[j++];
        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];
        System.arraycopy(temp, 0, a, l, temp.length);
    }

    // Quick Sort (desc)
    static void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int p = partition(a, l, r);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, r);
        }
    }

    static int partition(int[] a, int l, int r) {
        int pivot = a[r], i = l - 1;
        for (int j = l; j < r; j++) {
            if (a[j] > pivot) {
                i++;
                int t = a[i]; a[i] = a[j]; a[j] = t;
            }
        }
        int t = a[i + 1]; a[i + 1] = a[r]; a[r] = t;
        return i + 1;
    }

    static int total(int[] a) {
        int sum = 0;
        for (int x : a) sum += x;
        return sum;
    }
}