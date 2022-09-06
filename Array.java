package clases;

import java.util.ArrayList;



public  class Array {
    public static void main(String[] args) {


        ArrayList arrayUni = new ArrayList();


        arrayUni.add("Miranda");
        arrayUni.add("Federico");
        arrayUni.add("Alejandro");

        //RECORRE EL ARRAYLIST
        for (int i = 0; i < arrayUni.size(); i++) {
            //IMPRIME VALORES EN ARRAY
            System.out.println("Valores en el Array: " + i + "" + arrayUni.get(i));
        }
    }

}

