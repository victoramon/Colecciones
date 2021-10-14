package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Arreglo declarado en multilineal
        //String universidades [];
        //universidades = new String[5];


        //Arreglo declarado en una línea
        //String universidades[] = new String[5];

        /*
        universidades [0] = "ITVH";
        universidades [1] = "ULA";
        universidades [2] = "UAM";
        universidades [3] = "UADM";
        universidades [4] = "UNAM";
        universidades [5] = "UPN";
        universidades [6] = "IPN";
        universidades [7] = "TESCO";



        // Manera mas corta
        //String universidades [] = new String [5]{ "ITVH", "ULA", "UAM", "UADM", "UNAM" };


        for ( String universidad : universidades ) {
            System.out.println(universidad);
        }
         */

        System.out.println("----------------HashSet------------------");

        //HashSet
        Set<String> frutas = new HashSet<>();
        // Características principales de Set
        // No puede contener elementos duplicados
        // El orden de los elementos puede variar
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("------------TreeSet----------------------");


        // TreeSet
        Set<String> frutas2 = new TreeSet<>();
        // Es más lento que el HashSet
        // Ordena los elementos
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");

        for (String fruta : frutas2) {
            System.out.println(fruta);
        }

        System.out.println("------------LinkedHashSet----------------------");


        // LinkedHashSet
        Set<String> frutas3 = new LinkedHashSet<>();
        // Es un poco más costosa que HashSet
        // Almacena los valores en orden de inserción
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");

        for (String fruta : frutas3) {
            System.out.println(fruta);
        }

        System.out.println("----------------------------------");

        System.out.println("Victor Manuel");

        System.out.println("------------ArrayList----------------------");

        //List
        List<String> frutas4 = new ArrayList<>();
        //Si admite elementos duplicados

        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");

        for (String fruta : frutas4) {
            System.out.println(fruta);
        }

        System.out.println("---------------Elemento-------------------");

        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Melon");

        System.out.println(frutas4.get(indice));

        System.out.println("---------------LinkedList-------------------");

        //LinkedList
        List<String> frutas5 = new LinkedList<>();
        //

        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melon");
        frutas5.add("Lima");
        frutas5.add("Mango");

        for (String fruta : frutas5) {
            System.out.println(fruta);
        }

        System.out.println("--------------Map-------------------");


        //Map

        Map<Integer, String> universidades = new HashMap< Integer, String >();
        //Asocia claves con valores
        //No puede tener claves repetidas
        //Solo puede tener un valor asociado a la clave

        universidades.put(1, "IPN");
        universidades.put(2, "UNAM");
        universidades.put(3, "UAEM");
        universidades.put(4, "UAM");
        universidades.put(5, "TESCO");

        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave= " + universidad.getKey() + ", valor= " + universidad.getValue());
        }


        System.out.println(universidades.get(3));
    }
}
