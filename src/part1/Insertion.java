package part1;
public class Insertion {

    //-----------------------------------------------------
    // Title: Insertion
    // Author: Yüksel Çağlar Baypınar
    // ID: 43951623744
    // Section: 02
    // Assignment: 2
    // Description: Generic Insertion sort class with the addition of a descending rtl sorting method.
    //-----------------------------------------------
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        for (int i = 1; i < N; i++)
        {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        }
    }

    public static void sortDescend(Comparable[] a) { // a modified insetion sort algorithm that sorts the given elements in descending order, from right to left

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = i; j < a.length && less(a[j - 1], a[j]); j++)
                exch(a, j, j - 1);
        }
    }

    private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0; }
    private static void exch(Comparable[] a, int i, int j)
    { Comparable t = a[i]; a[i] = a[j]; a[j] = t; }


}
