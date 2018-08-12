package com.pawelozga;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Tyd6Sortowanie {
    public static void main(String[] args) {

        Integer[] tablica1 = {9, 6, 3, 7, 2, 1, 5, 4};


//        Swap(tablica1, 0, 5);
//        for (int a : tablica1
//                ) {
//            System.out.println(a);
//
//        }


//        BubbleSort(tablica1);
//        for (int x : tablica1) {
//            System.out.print(x + ", ");
//        }
//        System.out.println();
//        ArrayList<Integer[]> lista = Dzielenietablicy(tablica1);
//
//        System.out.println(Arrays.toString(lista.get(0)));
//        System.out.println(Arrays.toString(lista.get(1)));
//
//        Integer[] tablica2 = LaczenieSortowanie(lista.get(0), lista.get(1));
//
//        System.out.println(Arrays.toString(tablica2));

        Integer[] tablica2 = MergeSort(tablica1);
        System.out.println(Arrays.toString(tablica2));

//


    }

    public static void Swap(Integer[] tab1, int a, int b) {

        Integer zm = 0;


        zm = tab1[a];
        tab1[a] = tab1[b];
        tab1[b] = zm;

    }

    public static void Wypisz1(Integer[] tab1) {

        for (int y = 0; y < tab1.length; y++) {


            for (int x = 0; x < tab1.length - y; x++) {

                System.out.print(x + ":" + tab1[x] + ", ");

            }
            System.out.println();


        }


    }

    public static void BubbleSort(Integer[] tab1) {
        for (int i = 0; i < tab1.length - 1; i++) {
            for (int j = 0; j < tab1.length - 1 - i; j++) {
                if (tab1[j] > tab1[j + 1]) {
                    Swap(tab1, j, j + 1);
                }
            }
        }

    }

    public static void WartoscMin(Integer[] tab1) {

        Integer[] tab2 = new Integer[tab1.length];

        for (int x = 0; x < tab1.length; x++) {
            tab2[x] = tab1[x];
        }

        BubbleSort(tab1);

        for (int x = 0; x < tab1.length; x++) {
            if (tab1[0] == tab2[x]) {
                System.out.println("Najniższa wartość " + tab2[x] + " ma index " + x);
            }
        }


    }

    public static void SelectionSort(Integer[] tab1) {
        for (int i = 0; i < tab1.length - 1; i++) {
            int imin = i;
            for (int j = i + 1; j < tab1.length; j++) {
                if (tab1[j] < tab1[imin]) {
                    imin = j;

                }
            }
            Swap(tab1, i, imin);
        }
    }

    public static ArrayList<Integer[]> Dzielenietablicy(Integer[] tab1) {

        Integer[] tab2 = new Integer[tab1.length / 2];
        Integer[] tab3 = new Integer[(tab1.length / 2) + (tab1.length % 2)];

        for (int i = 0; i < tab1.length; i++) {

            if (i < tab1.length / 2) {
                tab2[i] = tab1[i];
            } else {
                tab3[i - tab2.length] = tab1[i];
            }
        }
        ArrayList<Integer[]> lista = new ArrayList<>();
        lista.add(tab2);
        lista.add(tab3);
        return lista;

    }

    public static Integer[] Laczenietablic(Integer[] tab1, Integer[] tab2) {

        Integer[] tab3 = new Integer[tab1.length + tab2.length];

//        for (int i = 0; i < tab3.length; i++) {
//            if (i % 2 == 0) {
//                tab3[i] = tab1[i / 2];
//            } else {
//                tab3[i] = tab2[i / 2];
//          }
//
//        }
        int krotsza = Math.min(tab1.length, tab2.length);

        for (int x = 0; x < krotsza * 2; x++) {
            if (x % 2 == 0) {
                tab3[x] = tab2[x / 2];
            } else {
                tab3[x] = tab1[x / 2];
            }

        }
        if (tab1.length > tab2.length) {

            for (int x = krotsza * 2; x < tab3.length; x++) {
                tab3[x] = tab1[x - tab2.length];
            }
        } else {
            for (int x = krotsza * 2; x < tab3.length; x++) {
                tab3[x] = tab2[x - tab1.length];
            }
        }


        return tab3;

    }

    public static Integer[] LaczenieSortowanie(Integer[] tab1, Integer[] tab2) {

        Integer[] tab3 = new Integer[tab1.length + tab2.length];
        int indeks1 = 0;
        int indeks2 = 0;
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        for (int i = 0; i < tab3.length; i++) {
            if (indeks1 < tab1.length && tab1[indeks1] < tab2[indeks2]) {
                tab3[i] = tab1[indeks1];
                indeks1++;
            } else if (indeks2 < tab2.length) {
                tab3[i] = tab2[indeks2];
                indeks2++;
            }
        }
        return tab3;
    }

    public static Integer[] MergeSort(Integer[] tab1) {
        int i = 0;
        int j = 0;
        int left = 0;
        int r = tab1.length;
        int m = tab1.length / 2;
        Integer[] tab2 = new Integer[tab1.length];
        for (i = m + 1; i <= left; i++) {
            tab1[i - 1] = tab2[i - 1];
        }
        for (j = m; j <= r; j++) {
            tab1[j + 1] = tab2[r + m - j];

        }
        for (int k = left; k <= r; k++) {
            if (tab2[j] < tab2[i]) {
                tab2[j] = tab1[k];
                j--;
            } else {
                tab2[i] = tab1[k];
                i++;
            }
        }

        return tab1;
    }
}
