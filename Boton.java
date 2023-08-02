
//Nos permite importar los estilos de nuestros componentes de interfaz gr;áfica.
import javax.swing.*;
//nos permite controlar los eventos y las funcionalidades de los componentes. 
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener {
    // Extend da herencia.
    // Action list captura los eventos.
    ///////////////////////////////////////

    JButton boton1;// Declaramos el componente.

    public Boton() { // constructor
        setLayout(null);// Nos permite dar la iubicacion al componente.
        boton1 = new JButton("cerrar");// Texto en el boton.
        boton1.setBounds(300, 250, 100, 30);// Coordenadas y dimensiones del boton.
        add(boton1);// Indicamos que agrege todo el diseño declarado lo agrega al boton.
        boton1.addActionListener(this);// Añade funcionalidad al boton.
    }

    public void actionPerformed(ActionEvent e) {
        // Captura el evento
        // getsource sirve para contener el objeto donde se origina el evento, en este
        // caso el boton1 y se asigna a e.
        if (e.getSource() == boton1) {
            System.exit(0);// Cierra la interfaz grafica.

        }
    }

    public static void main(String[] args) {

        // Diseño de la interfaz gr;áfica.
        Boton formulario3 = new Boton();
        formulario3.setBounds(0, 0, 450, 350);
        formulario3.setVisible(true);
        formulario3.setResizable(false);
        formulario3.setLocationRelativeTo(null);
    }

}
