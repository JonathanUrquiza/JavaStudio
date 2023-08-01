import java.util.Scanner;

public class Metodos {

    public static void main(String args[]) {

        String cadena_original = "", cadena_susbstraccion = "";
        int num_caracter = 0, desde = 0, hasta = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce una cadena de carateres");
        cadena_original = in.nextLine();

        num_caracter = cadena_original.length();
        System.out.println("La cadena de caracteres " + cadena_original + " posee " + num_caracter + " caracteres.");

        System.out.println("Desde que caracter deseas obtener la nueva cadena?: ");
        desde = in.nextInt();
        System.out.println("Hasta que caracter deseas obtener de la nueva cadena?: ");
        hasta = in.nextInt();

        cadena_susbstraccion = cadena_original.substring(desde, hasta);
        System.out.println("La nueva cadena es: " + cadena_susbstraccion);
    }
}