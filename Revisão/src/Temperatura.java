import javax.swing.JOptionPane;

public class Temperatura {

    public static void main(String[] args) {
        double[] temperatura = new double[7];
        double soma , media;
        int conatdor , dias_acima , dias_abaixo;
        soma = 0;
        for (conatdor = 0; conatdor < 7; conatdor++ ) {
            temperatura[conatdor] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (conatdor + 1) + "ª temperatura"));
            soma = soma + temperatura[conatdor];
        }
        media = soma / 7;
        dias_acima = 0;
        dias_abaixo = 0;
        for (conatdor = 0; conatdor < 7; conatdor++ ) {
            if (temperatura[conatdor] > media) {
                dias_acima = dias_acima + 1;
            } if (temperatura[conatdor] < media) {
                dias_abaixo = dias_abaixo + 1; 
            }
        }

        JOptionPane.showMessageDialog(null, "A média das temperaturas é: " + media);
        JOptionPane.showMessageDialog(null, "A quantidade de dias acima da média é: " + dias_acima);
        JOptionPane.showMessageDialog(null, "A quantidade de dias abaixo da média é: " + dias_abaixo);
    }
}
