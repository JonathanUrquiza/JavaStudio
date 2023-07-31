import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        try (// TODO code application logic here
                Scanner in = new Scanner(System.in)) {
            String nombre = "";
            int numeroUno = 0, numDos = 0, resultado = 0;

            System.out.println("cual estu nombre?");
            nombre = in.nextLine();

            System.out.println("Dame el primer valor para la suma");
            numeroUno = in.nextInt();
            System.out.println("Dame el segundo valor para la suma");
            numDos = in.nextInt();
            resultado = numeroUno + numDos;
            System.out.println("hola" + nombre + " El resultado de la suma es " + resultado);
        }
    }
}
