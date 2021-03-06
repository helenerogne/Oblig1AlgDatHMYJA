package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        if (a.length == 0 ) {
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

        int ombyttinger = 0;

        if (a.length == 0 ) {
            throw new NoSuchElementException("Det finnes ingen liste");
        }

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
        int antallUnike = 1;
        if (a.length == 0) {
            return 0;
        }
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    throw new IllegalStateException("Tabellen er ikke sortert");
                }
                if (a[i] != a[i + 1]) {
                    antallUnike++;
                }
            } return antallUnike;

    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        int antallUnike = 1;
        if (a.length == 0){
            return 0;
        }
        for (int i = 1; i < a.length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {
                antallUnike++;
            }
        }
        return antallUnike;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        int indeks = parterOddPar(a, 0, a.length - 1);
        quickSort(a, 0, indeks - 1);
        quickSort(a, indeks, a.length - 1);

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
        if (a.length < 2) {
            return;
        } else {
            char sistePlass = a[a.length - 1];

            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }

            a[0] = sistePlass;
        }
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        if (a.length < 2) {
            return;
        }

        if ((k %= a.length) < 0) {
            k += a.length;
        }

        char[] b = Arrays.copyOfRange(a, a.length - k, a.length);
        for (int i = a.length - 1; i >= k; i--) {
            a[i] = a[i - k];
        }
        System.arraycopy(b, 0, a, 0, k);
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {


        int m = Math.min(s.length(), t.length());
        StringBuilder flettetString = new StringBuilder();

        for (int i = 0; i < m; i++) {
            flettetString.append(s.charAt(i)).append(t.charAt(i));
        }

        flettetString.append(s.substring(m)).append(t.substring(m));


                return flettetString.toString();
    }


    /// 7b)
    public static String flett(String... s) {

        if(s.length == 0){
            return "";
        }
        StringBuilder flett = new StringBuilder();
        int indexLengde = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > indexLengde) {
                indexLengde = s[i].length();

            }
        }

        for (int j = 1; j <= indexLengde ; j++){
            for (int a = 0; a < s.length; a++) {
                if (j <= s[a].length()) {
                    flett.append(s[a].charAt(j - 1));
                }
            }
        }
        return flett.toString();

    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        int [] indekser = new int [a.length];

        for(int i = 0; i<a.length; ++i){
            indekser[i]=i;
        }


        for(int  i = 0; i<a.length; ++i){
            for(int j = i+1; j<a.length; ++j){
                int midlertidig;

                if(a[indekser[i]]>a[indekser[j]]){
                    midlertidig = indekser[i];
                    indekser[i] = indekser[j];
                    indekser[j] = midlertidig;
                }
            }
        }

        return indekser;
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        if(a.length < 3){
            throw new NoSuchElementException("arrayet er for kort til å hente de tre minste verdiene");
        }
        int [] hjelpetabell = {a[0], a[1], a[2]};
        int [] indekser = indekssortering(hjelpetabell);

        int minsteverdi = a[indekser[0]];
        int nestminstverdi = a[indekser[1]];
        int tredjeminstverdi = a[indekser[2]];

        int minsteverdiindeks = indekser[0];
        int nestminstverdiindeks = indekser[1];
        int tredjeminstverdiindeks = indekser[2];

        for(int i = 3; i < a.length; ++i){
            if(a[i] < tredjeminstverdi){
                if (a[i] < nestminstverdi){
                    if(a[i] < minsteverdi){
                        tredjeminstverdiindeks = nestminstverdiindeks;
                        nestminstverdiindeks = minsteverdiindeks;
                        minsteverdiindeks = i;

                        tredjeminstverdi = a[tredjeminstverdiindeks];
                        nestminstverdi = a[nestminstverdiindeks];
                        minsteverdi = a[minsteverdiindeks];
                    }else{
                        tredjeminstverdiindeks = nestminstverdiindeks;
                        nestminstverdiindeks = i;

                        tredjeminstverdi = a[tredjeminstverdiindeks];
                        nestminstverdi = a[nestminstverdiindeks];
                    }
                }else{
                    tredjeminstverdiindeks = i;

                    tredjeminstverdi = a[tredjeminstverdiindeks];
                }
            }
            indekser [0] = minsteverdiindeks;
            indekser [1] = nestminstverdiindeks;
            indekser [2] = tredjeminstverdiindeks;
        }

        return indekser;
    }

    ///// Oppgave 10 //////////////////////////////////////


    public static boolean inneholdt(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return true;
        }
        if ((a.length() != 0 && b.length() == 0) || a.length() > b.length()) {
            return false;
        }

        for (int i = 1; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                String x2 = Character.toString(b.charAt(i - 1));
                String x = Character.toString(a.charAt(j));

                if (!x.contains(x2)) {
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




