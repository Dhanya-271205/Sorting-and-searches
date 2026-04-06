public class P5 {
    static int linearFirst(String[] a, String key) {
        for (int i = 0; i < a.length; i++)
            if (a[i].equals(key)) return i;
        return -1;
    }

    static int binarySearch(String[] a, String key) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m].equals(key)) return m;
            else if (a[m].compareTo(key) < 0) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    static int count(String[] a, String key) {
        int c = 0;
        for (String s : a) if (s.equals(key)) c++;
        return c;
    }
}