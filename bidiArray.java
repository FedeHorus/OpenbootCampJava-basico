package clases;

public class bidiArray {
    public static void main(String[] args) {

        Integer[][] bidiArray = {
                {
                        20, 30, 40},
                {50, 60, 70}
        };

        for (int i = 0; i < bidiArray.length; i++) {
            for (int j = 0; j < bidiArray[i].length; j++) {
                System.out.println("Valores en el Array Bidimiensional : " + bidiArray[i][j]);
            }

        }
    }
}

