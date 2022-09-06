package clases;

import java.util.Scanner;


public class reversetext {
    public static void dalavuelta(String texto, String textoAlreves) {
        char ch;
        for (int i = 0; i < texto.length(); i++) {
            ch = texto.charAt(i);
            textoAlreves = ch + textoAlreves;

        }
        //IMPRIME TEXTO AL REVES
        System.out.println("Texto dado vuelta: " + textoAlreves);
    }
}