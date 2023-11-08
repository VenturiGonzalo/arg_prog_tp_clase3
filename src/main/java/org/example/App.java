package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        List<String> cadenas = new ArrayList<>();
        cadenas.add("silla");
        cadenas.add("mesa");
        cadenas.add("televisor");
        cadenas.add("computadora");
        System.out.println("Lista de entrada");
        System.out.println(cadenas);

        //Ejercicio 1
        System.out.println("\nEjercicio 1");
        System.out.println(convMayus(cadenas));

        //Ejercicio 2
        System.out.println("\nEjercicio 2");
        System.out.println(joinIf(cadenas,6));

    }

    //Ejercicio 1
    private static List<String> convMayus(List<String> lista){
        return lista.stream().map(cadena -> cadena.toUpperCase()).collect(Collectors.toList());
    }


    //Ejercicio 2
    private static String joinIf(List<String> lista, int n){
        return lista.stream().filter(cadena -> cadena.length() > n).collect(Collectors.joining(", "));
    }


}
