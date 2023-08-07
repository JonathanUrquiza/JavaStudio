package btnTerminos;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener, ChangeListener {
    // modificador de acceso tipo private
    private JLabel label1;
    private JCheckBox check1;
    private JButton boton1;

    public Formulario() {
        // este es el constructor de componentes y de diseño
        setLayout(null);

        // diseños
        label1 = new JLabel("aceptar terminos y condiciones");// Constructor del objeto
        label1.setBounds(10, 10, 400, 30);// separacion de la izquierda, separacion de arriba, ancho y alto.
        add(label1);// Agregamos el componente.

        check1 = new JCheckBox("Acepto");
        check1.setBounds(10, 50, 100, 30);// separacion de la izquierda, separacion de arriba, ancho y alto.
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 100, 100, 30);// separacion de la izquierda, separacion de arriba, ancho y alto.
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);
    }

    // Metodo disparador de evento.

    public void stateChanged(ChangeEvent e) {

        if (check1.isSelected() == true) {
            boton1.setEnabled(true);
        } else {
            boton1.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);// Indica que debe cerrar la interfaz, "la mata".
        }
    }

    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 350, 200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
