package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayInt {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        int c = 10;

        for (int i = 0; i < c; i++) {
            int b = 10 - 1;
            System.out.println("Ingrese" + b + " " + " " + "numeros:");
            Scanner Scanner = new Scanner(System.in);
            int numeroslista = Scanner.nextInt();
            intList.add(numeroslista);

        }
        System.out.println("Numeros en la lista de Integer: " + intList);

        for (int pares = 0; pares < intList.size(); pares++) {
            if (intList.get(pares) % 2 == 0) {
                intList.remove(pares);

            }
        }

        System.out.println("Numeros en la lista de Integer: " + intList);
    }

    }

