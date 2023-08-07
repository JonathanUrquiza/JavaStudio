import java.util.Scanner;

public class Login {

    public static void main(String args[]) {

        String usuario = "", password = "";
        try (Scanner entrada = new Scanner(System.in)) {
            // Solicitud de usuario
            System.out.println("Ingresa el nombre de usuario: ");
            usuario = entrada.nextLine();

            // Solicitud de contraseña
            System.out.println("Ingresa tu contraseña: ");
            password = entrada.nextLine();
        }

        if (usuario.equals("Jonathan") && password.equals("Jonas")) {
            System.out.println("Inicio de secion correcto!!");
        } else {
            System.out.println("nombre de usuario o contraseña incorrectos");
        }

    }
}