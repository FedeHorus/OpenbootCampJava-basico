package clases;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class copiarArchivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el archivo: ");
        String fileIn= scanner.nextLine();
        System.out.println("Ingrese el archivo destino: ");
        String fileOut= scanner.nextLine();
        copiar(fileIn, fileOut);


    }

    private static void copiar(String fileIn, String fileOut){

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Error reading file " + e.getLocalizedMessage());


        }
        }
    }

