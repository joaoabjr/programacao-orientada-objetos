import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TelaCalculadora {
    private JFrame janela;
    private JLabel rotuloNumero1;
    private JLabel rotuloNumero2;
    private JTextArea campoNumero1;
    private JTextArea campoNumero2;
    private JButton botaoSoma;
    private JButton botaoSub;
    private JButton botaoMult;
    private JButton botaoDiv;
    
    public TelaCalculadora() {
        janela =  new JFrame("Calculadora");
        rotuloNumero1 = new JLabel("Numero 1:");
        rotuloNumero2 = new JLabel("Numero 2:");
        campoNumero1 = new JTextArea();
        campoNumero2 = new JTextArea();
        botaoSoma = new JButton("+");
        botaoSub = new JButton("-");
        botaoMult = new JButton("*");
        botaoDiv = new JButton("/");
        
        botaoSoma.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                float resultado;
                resultado =  Float.parseFloat(campoNumero1.getText()) + Float.parseFloat(campoNumero2.getText());
                JOptionPane.showMessageDialog(janela, "O resultado da soma é " + resultado);

            }
        });
        
        botaoSub.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                float resultado;
                resultado =  Float.parseFloat(campoNumero1.getText()) - Float.parseFloat(campoNumero2.getText());
                JOptionPane.showMessageDialog(janela, "O resultado da subtração é " + resultado);    
            }
        });
        
        botaoMult.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                float resultado;
                resultado =  Float.parseFloat(campoNumero1.getText()) * Float.parseFloat(campoNumero2.getText());
                JOptionPane.showMessageDialog(janela, "O resultado da multiplicação é " + resultado);    
            }
        });
        
        botaoDiv.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                float resultado;
                resultado =  Float.parseFloat(campoNumero1.getText()) / Float.parseFloat(campoNumero2.getText());
                JOptionPane.showMessageDialog(janela, "O resultado da divisão é " + resultado);    
            }
        });

        montarJanela();
    }
    
    private void montarJanela() {
        janela.setSize(700, 300);
        janela.setLayout(new GridLayout(2, 4));
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.add(rotuloNumero1);
        janela.add(campoNumero1);
        janela.add(rotuloNumero2);
        janela.add(campoNumero2);
        janela.add(botaoSoma);
        janela.add(botaoSub);
        janela.add(botaoMult);
        janela.add(botaoDiv);
        
        janela.pack();
    }
    
    public void exibir() {
        janela.setVisible(true);
    }
}
