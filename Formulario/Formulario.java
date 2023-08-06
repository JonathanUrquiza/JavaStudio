package Formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    // Crea los componentes necesarios para la bara y el menu.
    private JMenuBar menubar; // Crea el componente barra donde se colocan las pestañas.
    private JMenu menu1; // Crea las pestañas del menu, se crean cuantas sean necesarias.
    private JMenuItem menuitem1, menuitem2, menuitem3; // Son las opciones de cada pestaña.

    public Formulario() {

        setLayout(null);
        // Diseño de la barra donde van a estar todas las opciones
        menubar = new JMenuBar();// constructo del objeto JMenuItem
        setJMenuBar(menubar);// colocar la barra dentro de la interfaz
        menu1 = new JMenu("Opciones");// Pestañas desplegables.
        menubar.add(menu1);// Coloca el menu de ociones dentro de la barra.

        menuitem1 = new JMenuItem("Rojo");// constructo del objeto JMenuItem2
        menuitem1.addActionListener(this);// colocar la barra dentro de la interfaz
        menu1.add(menuitem1);// Agrega el item dentro de menu.

        menuitem2 = new JMenuItem("Verde");// constructo del objeto JMenuItem2
        menuitem2.addActionListener(this);// colocar la barra dentro de la interfaz
        menu1.add(menuitem2);// Agrega el item dentro de menu.

        menuitem3 = new JMenuItem("Azul");// constructo del objeto JMenuItem3
        menuitem3.addActionListener(this);// colocar la barra dentro de la interfaz
        menu1.add(menuitem3);// Agrega el item dentro de menu.

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();

        if (e.getSource() == menuitem1) {
            fondo.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == menuitem2) {
            fondo.setBackground(new Color(0, 255, 0));
        }
        if (e.getSource() == menuitem3) {
            fondo.setBackground(new Color(0, 0, 255));
        }
    }

    public static void main(String[] args) {
        // Diseño de la interfaz grafica, donde se mostraran los objetos
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 400, 300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}
