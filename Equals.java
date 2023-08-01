import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {

        String nombre_uno = "", nombre_dos = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingresa en primer nombre: ");
        nombre_uno = entrada.nextLine();

        System.out.println("Por favor ingrese el segundo nombre");
        nombre_dos = entrada.nextLine();

        if (nombre_uno.equalsIgnoreCase(nombre_dos)) {
            System.out.println("los nombres son iguales");
        } else {
            System.out.println("Los nombres son diferentes");
        }
    }
}
