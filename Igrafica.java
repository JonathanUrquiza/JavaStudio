import javax.swing.*;

public class Igrafica extends JFrame {

    private JLabel label1;
    private JLabel label2;

    public Igrafica() {
        setLayout(null);
        label1 = new JLabel("Interfaz gráfica.");
        label1.setBounds(10, 20, 300, 30);
        add(label1);
        label2 = new JLabel("Version 1.0");
        label2.setBounds(10, 100, 100, 30);
        add(label2);

    }

    public static void main(String[] args) {
        Igrafica inIgrafica1 = new Igrafica();
        inIgrafica1.setBounds(0, 0, 300, 200);
        inIgrafica1.setResizable(false);
        inIgrafica1.setVisible(true);
        inIgrafica1.setLocationRelativeTo(null);

    }
}
