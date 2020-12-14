package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class telaHello extends JFrame{
    private JPanel mainPanel;
    private JButton multBtn;
    private JTextField multiplicando;
    private JTextField multiplicador;
    private JTextField produto;
    private JLabel multiplicadorLbl;
    private JLabel produtoLbl;

    public telaHello(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.produto.setEditable(false);
        this.setSize(610,300);
        multBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int  b = Integer.parseInt(multiplicador.getText());
                int a = Integer.parseInt(multiplicando.getText());
                int c = a*b;
                produto.setText(Integer.toString(c));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new telaHello("Teste de JFrame, Tomara que essa porra dê certo"); //a string de parâmetro é o cabeçalho do GUI
        frame.setVisible(true);

    }
}
