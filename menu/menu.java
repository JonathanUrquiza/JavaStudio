package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener {

    // Crea los componentes necesarios para la bara y el menu.
    private JMenuBar menubar; // Crea el componente barra donde se colocan las pestañas.
    private JMenu menu1; // Crea las pestañas del menu, se crean cuantas sean necesarias.
    private JMenuItem menuItem1, menuItem2, menuItem3; // Son las opciones de cada pestaña.

    public menu() {

        setLayout(null);
        // Diseño de la barra donde van a estar todas las opciones
        menubar = new JMenuBar();
        setJMenuBar(menubar);// colocar la barra dentro de la interfaz
        menu1 = new JMenu("Opciones");// Pestañas desplegables.
        menubar.add(menu1);// Coloca el menu de ociones dentro de la barra.

        menuItem1 = new JMenuItem("Rojo");
        menu1.addActionListener(this);// Crear el evento background.
        menu1.add(menuItem1);// Agrega el item dentro de menu.

        menuItem2 = new JMenuItem("color");
        menuItem2.addActionListener(this);
        menu1.add(menuItem2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
