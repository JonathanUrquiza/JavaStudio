import javax.swing.*;
import java.awt.event.*;

public class Formulacion extends JFrame implements ActionListener {

    private JTextField textfield12;
    private JScrollPane scrollpane12;
    private JTextArea textarea12;
    private JButton boton12;

    String texto = "";

    public Formulacion() {
        setLayout(null);
        textfield12 = new JTextField();
        textfield12.setBounds(10, 10, 200, 30);
        add(textfield12);

        boton12 = new JButton("Agregar");
        boton12.setBounds(250, 10, 100, 30);
        add(boton12);
        boton12.addActionListener(this);

        textarea12 = new JTextArea();
        scrollpane12 = new JScrollPane(textarea12);
        scrollpane12.setBounds(10, 50, 400, 300);
        add(scrollpane12);
    }

    private void add(JTextField textfield122) {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton12) {
            texto += textfield12.getText() + "\n";
            textarea12.setText(texto);
            textfield12.setText("");
        }
    }

    public static void main(String args[]) {
        Formulacion formulario12 = new Formulacion();
        formulario12.setBounds(0, 0, 540, 400);
        formulario12.setVisible(true);
        formulario12.setResizable(false);
        formulario12.setLocationRelativeTo(null);
    }
}