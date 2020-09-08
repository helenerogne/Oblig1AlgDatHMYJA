package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
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
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
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
                //if ( s[j].equals(s.length)){
                // return " ";
                //}
                if (j <= s[a].length()) {
                    flett.append(s[a].charAt(j - 1));
                }
            }
        }
        return flett.toString();

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
