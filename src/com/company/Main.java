package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner entrada = new Scanner(System.in);
        int t, d = 1;
        String a[], c;

        System.out.println("Cuantos datos desea ingresar :");
        t = entrada.nextInt();

        a = new String[t];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite la letra numero " + d);
            c = entrada.next();
            a[i] = c;
            d++;
        }
        OperacionArreglo operacionArreglo = new OperacionArreglo();
        operacionArreglo.imprimir(a);
    }
}
