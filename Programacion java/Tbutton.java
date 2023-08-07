import javax.swing.*;
import java.awt.event.*;

public class Tbutton extends JFrame implements ActionListener {
    private JButton boton1, boton2, boton3;
    private JLabel labela;

    public Tbutton() {
        // Constructor de botones.
        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10, 100, 90, 30);
        add(boton1);
        boton1.addActionListener(this);

        // Segundo objeto boton.

        boton2 = new JButton("2");
        boton2.setBounds(110, 100, 90, 30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("3");
        boton3.setBounds(210, 100, 90, 30);
        add(boton3);
        boton3.addActionListener(this);

        labela = new JLabel("en espera...");
        labela.setBounds(10, 10, 300, 30);
        add(labela);

    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == boton1) {
            labela.setText("Has presionado el botón 1");
        } else if (e.getSource() == boton2) {
            labela.setText("Has presionado el botón 2");
        } else if (e.getSource() == boton3) {
            labela.setText("Has presionado el botón 3");
        }
    }

    public static void main(String[] args) {
        Tbutton botonera = new Tbutton();
        botonera.setBounds(0, 0, 350, 200);
        botonera.setVisible(true);
        botonera.setResizable(false);
        botonera.setLocationRelativeTo(null);
    }

}
