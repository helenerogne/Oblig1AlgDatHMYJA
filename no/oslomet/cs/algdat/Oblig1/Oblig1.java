package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a == null ) {
            throw new NoSuchElementException();
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

            if (a[i] < a[i + 1]) {
                int value = a[i + 1];
                a[i + 1] = a[i];
                a[i] = value;
                System.out.println("Nå byttes tallene");
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
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        int [] indekser = new int [a.length];
        int [] hjelpetabell = new int[a.length];

        System.arraycopy(a, 0, hjelpetabell, 0, a.length);

        int minsteverdi;
        int minsteverdiindeks;

        for(int i = 0; i<a.length; ++i){
            minsteverdi = hjelpetabell[i];
            minsteverdiindeks = i;
            for(int j = i+1; j < a.length; ++j){
                if(hjelpetabell[j]<minsteverdi) {
                    minsteverdi = hjelpetabell[j];
                    minsteverdiindeks = j;
                }
            }
            int midlertidig = hjelpetabell[i];
            hjelpetabell[i] = minsteverdi;
            hjelpetabell[minsteverdiindeks] = midlertidig;
        }

        for(int i = 0; i <a.length; ++i){
            for(int j = 0; j<a.length; ++j){
                if(hjelpetabell[i]==a[j]){
                    indekser[i]=j;
                }
            }
        }
        return indekser;
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
