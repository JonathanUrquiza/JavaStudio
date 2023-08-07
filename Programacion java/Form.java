import javax.swing.*;

public class Form extends JFrame {

    // El constructor de acceso public
    public Form() {

        setLayout(null); // setea la ubicacion de la interface
    }

    public static void main(String[] args) {

        // estetica de la ventada del software
        Form form1 = new Form();// creamos un objeto tipo formulario
        form1.setBounds(0, 0, 400, 550);// Coordenadas y direccion de la interface
        form1.setVisible(true);// que se vea.
        form1.setLocationRelativeTo(null);// centra la interface
        form1.setResizable(false);// habilita la modificacion de las dimenciones de la interface

    }
}
