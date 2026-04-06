public class P6 {
    static int linear(int[] a, int key) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) return i;
        return -1;
    }

    static int floor(int[] a, int key) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] <= key) {
                ans = a[m];
                l = m + 1;
            } else r = m - 1;
        }
        return ans;
    }

    static int ceil(int[] a, int key) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] >= key) {
                ans = a[m];
                r = m - 1;
            } else l = m + 1;
        }
        return ans;
    }
}