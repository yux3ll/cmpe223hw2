package part1;

public class Quick {

        public static void sort(Comparable[] a)
        {
            StdRandom.shuffle(a);
            sort(a, 0, a.length - 1);
        }
        private static void sort(Comparable[] a, int lo, int hi)
        {
            if (hi <= lo) return;
            int j = partition(a, lo, hi);
            sort(a, lo, j-1);
            sort(a, j+1, hi);
        }
    private static int partition(Comparable[] a, int lo, int hi)
    {
        int i = lo, j = hi+1;
        Comparable v = a[lo];
        while (true)
        {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
    public static void sortDescend(Comparable[] a)
    {
        StdRandom.shuffle(a);
        sortDescend(a, 0, a.length - 1);
    }
    private static void sortDescend(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int j = partitionDescend(a, lo, hi);
        sortDescend(a, lo, j-1);
        sortDescend(a, j+1, hi);
    }

    private static int partitionDescend(Comparable[] a, int lo, int hi)
    {
        int i = lo, j = hi+1;
        Comparable v = a[lo];
        while (true)
        { // Scan right, scan left, check for scan complete, and exchange.
            while (less(v, a[++i])) if (i == hi) break;
            while (less(a[--j], v)) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j); // Put v = a[j] into position
        return j; // with a[lo..j-1] <= a[j] <= a[j+1..hi].
    }
    private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0; }
    private static void exch(Comparable[] a, int i, int j)
    { Comparable t = a[i]; a[i] = a[j]; a[j] = t; }


}
