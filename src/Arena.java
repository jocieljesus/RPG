
import javax.swing.*;
import java.awt.*;

public class Arena {
    public static void main(String[] args) {

//        UIManager.put("OptionPane.okButtonText", null);
//
//        JOptionPane.showMessageDialog(null, "Vamos começar a Batalha!");
//
//        String nomeGuerreiro = JOptionPane.showInputDialog("Qual o nome do guerreiro: ");
//
//        JOptionPane.showMessageDialog(null, nomeGuerreiro);
//
//
//        Object[] opcoes = {"Salvar", "Descartar", "Cancelar"};
//
//        JOptionPane.showOptionDialog(null, "Você tem alteraçoes não salvas.", "Aviso de Fechamento", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);

        ImageIcon imagemOriginal = new ImageIcon("img/whiteboard.png");

        Image imagemRedimensionada = imagemOriginal.getImage().getScaledInstance(48, 48, Image.SCALE_SMOOTH);

        ImageIcon iconePronto = new ImageIcon(imagemRedimensionada);

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null,
                String.format("A soma do numero %d e o numero %d é igual a %d", num1, num2, soma),
               "Soma de dois numeros",
                JOptionPane.INFORMATION_MESSAGE,
                iconePronto
        );

    }
}
