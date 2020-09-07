package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a == null ) {
            throw new NoSuchElementException("Det finnes ingen liste");
        }

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                int value = a[i + 1];
                a[i + 1] = a[i];
                a[i] = value;
            }

        }


        return  a[a.length-1];
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
    public static void delsortering(int[] a) { //throw new UnsupportedOperationException();
        delsortering(a, 0, a.length-1);
    }

    public static void delsortering(int[] a, int begin, int end) {

        if (begin > end) {
            return;
        }

        int pivot = (begin+end)/2; //
        int indeks = parter(a, begin, end, pivot);
        delsortering(a, begin, indeks - 1);
        delsortering(a, indeks + 1, end);
    }

    public static int parter(int [] a, int begin, int end, int skilleverdi){
        while (true) {
            while (begin<=end && a[begin]<skilleverdi &&  a[begin] % 2 == 0) begin++;
            while (begin<=end && a[end]>=skilleverdi && a[end] % 2 != 0) end--;
            if (begin < end) {
                bytt(a, begin++, end--);

            }
            else {
                return begin;
            }
        }
    }

    public static void bytt(int [] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /*
        int i = 0;
        int j = a.length - 1;

        while (i < a.length && a[i] % 2 == 1) i++;
        while (j >= 0 && a[j] % 2 == 0) j--;

        while (true) {
        if (i < j) {
         bytt(a, i, j);
           i++;
           j--;
            } else {
                break;
            }

            while (a[i] % 2 == 1) i++;
            while (a[j] % 2 == 0) j--;
        }
    qs(a, 0, i);
    qs(a, i, a.length);

     */


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

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
