package clases;

public class dividipor0 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int resultado = a / b;
        } catch (Exception ArithmeticException) {
            System.out.println("No se puede hacer");
        }
        System.out.println("Demo de codigo");
    }
}
