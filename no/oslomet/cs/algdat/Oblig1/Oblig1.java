package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a == null) {
            throw new NoSuchElementException("Det finnes ingen liste");
        }

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                int value = a[i + 1];
                a[i + 1] = a[i];
                a[i] = value;
            }

        }


        return a[a.length - 1];
    }

    public static int ombyttinger(int[] a) {
        if (a == null) {
            throw new UnsupportedOperationException();
        }
        int ombyttinger = 0;


        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                int value = a[i + 1];
                a[i + 1] = a[i];
                a[i] = value;
                ombyttinger++;

            }

        }
        return ombyttinger;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        int indeks = parterOddPar(a, 0, a.length - 1);
        quickSort(a, 0, indeks - 1);
        quickSort(a, indeks, a.length - 1);
        //delsortering(a, begin, indeks - 1);
        //delsortering(a, indeks + 1, end);
    }

    private static int partition(int[] a, int begin, int end) {
        int pivot = a[end];
        int j = (begin - 1);

        for (int i = begin; i < end; i++) {
            if (a[i] <= pivot) {
                j++;
                bytt(a, i, j);
            }
        }
        bytt(a, j + 1, end);
        return j + 1;
    }

    private static void quickSort(int[] values, int left, int right) {
        if (left < right) {
            int pivot_index = partition(values, left, right);
            quickSort(values, left, pivot_index - 1);
            quickSort(values, pivot_index + 1, right);
        }
    }


    public static int parterOddPar(int[] a, int begin, int end) {
        while (true) {
            while (begin <= end && a[begin] % 2 != 0) begin++;
            while (begin <= end && a[end] % 2 == 0) end--;
            if (begin < end) {
                bytt(a, begin++, end--);

            } else {
                return begin;
            }
        }
    }

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 ////////////////////////////////////// throw new UnsupportedOperationException();

   /*public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    */
    ///// Oppgave 10 ////////////////////////////////////// throw new UnsupportedOperationException();

    /*public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }
     */

    public static boolean inneholdt(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return true;
        }
        if ((a.length() != 0 && b.length() == 0) || a.length() > b.length()) {
            return false;
        }

        for (int i = 1; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                String word = Character.toString(b.charAt(i - 1));
                String dublicate = Character.toString(a.charAt(j));

                if (!dublicate.contains(word)) {
                    return true;
                }

                if (!b.contains(a)) {
                    return false;
                }

            }
        }
        return true;
    }
}
// Oblig1




