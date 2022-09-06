package clases;

public class Vector {
    public static void main(String[] args) {
java.util.Vector vector = new java.util.Vector();

        {
            vector.add(10);
            vector.add(20);
            vector.add(30);
            vector.add(40);
            vector.add(50);

            //IMPRIME ELEMENTOS NE EL VECTOR
            System.out.println(vector.toString());
            //REMUEVE ELEMENTOS 2 Y 3 DEL VECTOR
            vector.removeElementAt(1);
            vector.removeElementAt(1);
            System.out.println(vector.toString());

                     /*
                Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
                1000 elementos para ser añadidos al mismo.
            */
            System.out.println("Cada vez que se sobrepasa la capacidad del vector se duplica su capacidad por defecto y esto consume memoria en exceso ");

    }
    }
}
