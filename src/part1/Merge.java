package part1;

public class Merge {
    //-----------------------------------------------------
    // Title: Merge
    // Author: Yüksel Çağlar Baypınar
    // ID: 43951623744
    // Section: 02
    // Assignment: 2
    // Description: Generic Merge sort class with the inclusion of a descending sort method
    //-----------------------------------------------
    private static Comparable[] aux; // auxiliary array for merges

    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length]; // Allocate space just once.
        sort(a, 0, a.length - 1);
    }
    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid); // Sort left half.
        sort(a, mid+1, hi); // Sort right half.
        merge(a, lo, mid, hi); // Merge results
    }
    public static void merge(Comparable[] a, int lo, int mid, int hi)
    {
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) // Copy a[lo..hi] to aux[lo..hi].
            aux[k] = a[k];
        for (int k = lo; k <= hi; k++) // Merge back to a[lo..hi].
            if (i > mid) a[k] = aux[j++];
            else if (j > hi ) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
    }

    public static void sortDescend(Comparable[] a)
    {
        aux = new Comparable[a.length]; // Allocate space just once.
        sortDescend(a, 0, a.length - 1);
    }
    private static void sortDescend(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sortDescend(a, lo, mid); // Sort left half.
        sortDescend(a, mid+1, hi); // Sort right half.
        mergeDescend(a, lo, mid, hi); // Merge results
    }
    public static void mergeDescend(Comparable[] a, int lo, int mid, int hi)
    {
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) // Copy a[lo..hi] to aux[lo..hi].
            aux[k] = a[k];
        for (int k = lo; k <= hi; k++) // Merge back to a[lo..hi].
            if (i > mid) a[k] = aux[j++];
            else if (j > hi ) a[k] = aux[i++];
            else if (less(aux[i], aux[j])) a[k] = aux[j++];
            else a[k] = aux[i++];
    }


    private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0; }

}
