import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaConversor implements ActionListener{
    private JFrame janela;
    private JLabel rotuloEntrada;
    private JLabel rotuloSaida;
    private JTextField campoEntrada;
    private JTextField campoSaida;
    private JButton botaoConverter;

    public TelaConversor() {
        janela = new JFrame("Converter para Maiuscula");
        rotuloEntrada = new JLabel("Informe uma palavra:");
        rotuloSaida = new JLabel("Palavra convertida");
        campoEntrada = JTextField(15);
        campoSaida = JTextField(15);
        campoSaida.setEditable(false);
        botaoConverter = new JButton("Converter para maiuscula");
        botaoConverter.addActionListener(this);
        {
            String resultado = campoEntrada.getText();
            campoSaida.setText(resultado.toUpperCase());
        }
        montarJanela();
    }

    private void montarJanela() {
        janela.setSize(700, 300);
        janela.setLayout(new FlowLayout());
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelSup = new JPanel();
        painelSup.setLayout(new FlowLayout());
        painelSup.add(rotuloEntrada);
        painelSup.add(campoEntrada);
        janela.add(painelSup, BorderLayout.NORTH);

        JPanel painelCentro = new JPanel();
        painelCentro.setLayout(new FlowLayout());
        painelCentro.add(botaoConverter);
        janela.add(painelCentro, BorderLayout.CENTER);

        JPanel painelInfo = new JPanel();
        painelInfo.setLayout(new FlowLayout());
        painelInfo.add(rotuloSaida);
        painelInfo.add(campoSaida);
        janela.add(painelInfo, BorderLayout.SOUTH);

        janela.pack();
    }

    public void exibir() {
        janela.setVisible(true);
    }
}