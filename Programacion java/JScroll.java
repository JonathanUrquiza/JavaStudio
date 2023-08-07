import javax.swing.*;

public class JScroll extends JFrame {

    private JTextField textField4;
    private JScrollPane scrollPane1;
    private JTextArea textArea4;

    public JScroll() {

        setLayout(null);
        textField4 = new JTextField();
        textField4.setBounds(10, 10, 200, 30);
        add(textField4);

        textArea4 = new JTextArea();
        scrollPane1 = new JScrollPane(textArea4);
        scrollPane1.setBounds(10, 50, 400, 300);
        add(scrollPane1);
    }

    private void add(JTextField textField42) {
    }

    public static void main(String[] args) {

        JScroll scroll = new JScroll();
        scroll.setBounds(0, 0, 540, 400);
        scroll.setVisible(true);
        scroll.setResizable(false);
        scroll.setLocationRelativeTo(null);

    }
}
