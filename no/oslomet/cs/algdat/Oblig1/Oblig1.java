package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
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
    /*
    - Fjerne int k fra parameterne til metodekallet. Mulig å ta inn kun int[] a?
    - For å fjerne k må man finne en måte å splitte arrayet i to, selv om det
      blir lagt inn negative tall i arrayet.
    - Finne en måte å sortere de to halvdelene på, selv om det er negative
      tall. Collections-metoden lånt fra geeksforgeeks-nettsiden er ikke mulig
      å bruke i denne sammenhengen.

      Brukt denne nettsiden til hjelp:
      https://www.geeksforgeeks.org/sort-even-numbers-ascending-order-sort-odd-numbers-descending-order/
     */
    public static void delsortering(int[] a, int k) {
        // Sjekker om tabellen er tom eller om det er ett element i tabellen
        // Gir ikke feilsituasjon, men vil heller ikke endre noe.
        if (a.length < 2) {
            return;
        }

        // Current indexes from left and right
        int venstre = 0;
        int hoyre = k - 1;

        // Count of odd numbers
        int tellerOddetall = 0;

        while (venstre < hoyre) {
            // Find first odd number from left side.
            while (a[venstre] % 2 != 0) {
                venstre++;
                tellerOddetall++;
            }

            // Find first even number from right side.
            while (a[hoyre] % 2 == 0 && venstre < hoyre) {
                hoyre--;
            }

            // Swap odd number present on left and even number right.
            if (venstre < hoyre) {
                // Swap a[venstre] a[hoyre]
                int temp = a[venstre];
                a[venstre] = a[hoyre];
                a[hoyre] = temp;
            }
        }

        // Sort odd number in descending order
        // OBS!! Kan ikke bruke/hente denne Collections-metoden. Finn annen måte å sortere!!
        Arrays.sort(a, 0, tellerOddetall, Collections.reverseOrder());

        // Sort even number in ascending order
        Arrays.sort(a, tellerOddetall, k);
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
