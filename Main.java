import clases.reversetext;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;



public class Main {
    public static void main(String[] args) {

        //DA VUELTA EL TEXTO
        Scanner scanner = new Scanner(System.in);
        String texto;
        System.out.println("Introduce un texto");
        texto = scanner.nextLine();

        String textoAlreves = "";

        reversetext.dalavuelta(texto, textoAlreves);



    }
}

