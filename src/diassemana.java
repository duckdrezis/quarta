import javax.swing.JOptionPane;
public class diassemana {
    public static void main(String[] args) {
        String inputNumero = JOptionPane.showInputDialog("Digite um número de 1 a 7:");
        int numero = Integer.parseInt(inputNumero);

        String diaDaSemana;

        switch (numero) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Número inválido";
                break;
        }

        JOptionPane.showMessageDialog(null, "Dia da semana correspondente: " + diaDaSemana);
    }
}
