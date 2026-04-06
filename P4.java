class Asset {
    String name;
    double ret, vol;

    Asset(String n, double r, double v) {
        name = n; ret = r; vol = v;
    }
}

public class P4 {
    // Merge Sort (by return asc)
    static void mergeSort(Asset[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(Asset[] a, int l, int m, int r) {
        Asset[] temp = new Asset[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r)
            temp[k++] = (a[i].ret <= a[j].ret) ? a[i++] : a[j++];
        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];
        System.arraycopy(temp, 0, a, l, temp.length);
    }

    // Quick Sort (desc return, asc volatility)
    static void quickSort(Asset[] a, int l, int r) {
        if (l < r) {
            int p = part(a, l, r);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, r);
        }
    }

    static int part(Asset[] a, int l, int r) {
        Asset p = a[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (a[j].ret > p.ret || 
               (a[j].ret == p.ret && a[j].vol < p.vol)) {
                i++;
                Asset t = a[i]; a[i] = a[j]; a[j] = t;
            }
        }
        Asset t = a[i + 1]; a[i + 1] = a[r]; a[r] = t;
        return i + 1;
    }
}