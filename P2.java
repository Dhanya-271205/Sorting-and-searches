class Client {
    String name;
    int risk, balance;

    Client(String n, int r, int b) {
        name = n; risk = r; balance = b;
    }
}

public class P2 {
    static void bubble(Client[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j].risk > a[j + 1].risk) {
                    Client t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                }
    }

    static void insertion(Client[] a) {
        for (int i = 1; i < a.length; i++) {
            Client key = a[i];
            int j = i - 1;
            while (j >= 0 && 
                  (a[j].risk < key.risk ||
                  (a[j].risk == key.risk && a[j].balance < key.balance))) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    static void top10(Client[] a) {
        for (int i = 0; i < Math.min(10, a.length); i++)
            System.out.println(a[i].name);
    }
}