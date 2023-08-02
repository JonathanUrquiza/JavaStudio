import javax.swing.*;

public class Field extends JFrame {

    // Declaro componenetes a utilizar.
    private JTextField textField1;
    private JTextArea textarea1;

    // Crear el constructor de componentes.

    public Field() {
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10, 10, 200, 30);
        add(textField1);

        textarea1 = new JTextArea();
        textarea1.setBounds(10, 50, 400, 300);
        add(textarea1);

    }

    public static void main(String[] args) {
        Field field1 = new Field();
        field1.setBounds(0, 0, 540, 400);
        field1.setVisible(true);
        field1.setResizable(false);
        field1.setLocationRelativeTo(null);
    }
}
