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
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
