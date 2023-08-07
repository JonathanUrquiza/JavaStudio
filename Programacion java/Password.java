import javax.swing.*;
import java.awt.event.*;

public class Password extends JFrame implements ActionListener {

    private JTextField textField1;
    private JLabel labeli;
    private JButton botone;

    public Password() {
        // Aca se programa el diseño de los componentes label.
        setLayout(null);
        labeli = new JLabel("usuario: ");
        labeli.setBounds(10, 10, 100, 30);
        add(labeli);

        // programar el diseño del componente campo de texto.
        textField1 = new JTextField();
        textField1.setBounds(120, 17, 150, 20);
        add(textField1);
        // programa el diseño del componente boton.
        botone = new JButton("Aceptar");// asigna el texto al boton.
        botone.setBounds(10, 80, 100, 30);// asigna la posiscion y las dimenciones.
        add(botone);// agrega el componente a la interfaz.
        botone.addActionListener(this);// agega el evento del boton.
    }

    private void add(JTextField textField12) {
    }

    public void actionPerformed(ActionEvent e) {
        // Aca se programa el comportamiento de cada componente.

        if (e.getSource() == botone) {
            String texto = textField1.getText();
            setTitle(texto);
        }
    }

    public static void main(String[] args) {
        // Aca se ejecutan todos los componentes y se programa la interfaz.
        Password password1 = new Password();
        // Estilos
        password1.setBounds(0, 0, 300, 150);
        password1.setVisible(true);
        password1.setResizable(false);
        password1.setLocationRelativeTo(null);
    }
}