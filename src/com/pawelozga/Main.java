package com.pawelozga;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

import static jdk.nashorn.internal.objects.NativeString.search;

public class Main {

    public static void main(String[] args) {
//zad1
//        Map<String, List<String>> mapa = new HashMap<String, List<String>>();
//
//
//        mapa.put("Kadry", new ArrayList<String>());
//        mapa.put("Produkcja", new ArrayList<String>());
//
//        mapa.get("Kadry").add("Zenek");
//        mapa.get("Kadry").add("Bogdan");
//        mapa.get("Produkcja").add("Sławek");
//        mapa.get("Produkcja").add("Zbyszek");
//
//        Scanner skaner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Wpisz list żeby wyświetlić osoby z poszczególnych działów");
//            String zmienna = skaner.next();
//            switch (zmienna) {
//                case "list": {
//
//                    for ( Map.Entry<String, List<String>> entry : mapa.entrySet()
//                         ) {
//                        System.out.println(entry.getKey()+" "+entry.getValue());
//
//                    }
//
//                    }
//                }
//                break;
//
//            }
        //zad2

//zad2
//        List<Employee> listapr = new LinkedList();
//        BufferedReader dane = new BufferedReader(new FileReader("C:\\Users\\Jerzy\\ozon3k\\pracownicy.txt"));
//        String linia;
//        while ((linia = dane.readLine()) != null) {
//            String[] tablica = linia.split(";");
//
//            listapr.add(new Employee(tablica[0], tablica[1], tablica[2], Long.valueOf(tablica[3])));
//
//
//        }
//        System.out.println(listapr.toString());
//        FileWriter zapisz = new FileWriter("C:\\Users\\Jerzy\\ozon3k\\pracownicy2.txt");
//        for (Employee empl : listapr
//                ) {
//            zapisz.write(empl.toString());
//        }
//        zapisz.close();

//        LinearSearch szukaj = new LinearSearch();
//
//        Integer[] cyferki = {1, 2, 3, 4, 5, 6, 7, 8};

        //szukaj.search(10, cyferki);


        //System.out.println(SrodkowyElement(cyferki));
        // ElementyDoA(cyferki,4);
        // ElementyOdB(cyferki,4);

        //BinarySearchRec(cyferki, 6, 0, 7);
        //BinarySearchIter(cyferki, 7);

        Osoba zenek= new Osoba("Zenek", "Martyniuk", 40);
        Osoba maryla= new Osoba("Maryla", "Rodowicz", 150);
        Osoba ryszard= new Osoba("Ryszard", "Rynkowski", 67);
        Osoba krzysztof= new Osoba("Krzysztof", "Krawczyk", 70);

        Osoba[] osoby = {zenek, maryla, ryszard, krzysztof};

        LinearSearch szukaj = new LinearSearch();
        int taOsoba = szukaj.search(70,osoby);
        System.out.println(osoby[taOsoba].name+ " "+osoby[taOsoba].surname + " "+ osoby[taOsoba].age);


    }

    public static Integer SrodkowyElement(Integer[] tablica) {

        int srodek = tablica.length / 2;

        return tablica[srodek];


    }

    public static void ElementyDoA(Integer[] tablica, int a) {

        for (int i = 0; i <= a; i++) {
            System.out.println(tablica[i]);
        }


    }

    public static void ElementyOdB(Integer[] tablica, int b) {
        for (int i = b; i >= 0; i--) {
            System.out.println(tablica[i]);
        }
    }

    public static Integer BinarySearchRec(Integer[] tablica, int wartosc, int low, int high) {
        if (high < low) {
            System.out.println("ni ma!");
            return null;
        }
        int mid = (low + high) / 2;
        if (tablica[mid] > wartosc) {
            return BinarySearchRec(tablica, wartosc, low, mid - 1);
        } else if (tablica[mid] < wartosc) {
            return BinarySearchRec(tablica, wartosc, mid + 1, high);
        } else {
            System.out.println(mid);
            return mid;
        }

    }

    public static Integer BinarySearchIter(Integer[] tablica, int wartosc) {
        int low = 0;
        int high = tablica.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (tablica[mid] > wartosc) {
                high = mid - 1;
            } else if (tablica[mid] < wartosc) {
                low = mid + 1;
            }else{
                System.out.println(mid);
                return mid;
            }

        }
        System.out.println("nie ma!");
        return -1;
    }
}

