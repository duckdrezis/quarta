import javax.swing.JOptionPane;
public class nome {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome:");
        String nomeCompleto = nome + " " + sobrenome;
        JOptionPane.showMessageDialog(null, "Nome completo: " + nomeCompleto);
    }
}
