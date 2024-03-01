public class Revisao {
    public static void main(String[] args) throws Exception {
        double [] temperatura = new double[365];
        temperatura[0] = 25.7;
        temperatura[1] = 27.4;
        temperatura[2] = 29.3;
        temperatura[3] = 31.4;
        temperatura[4] = 30.2;
        temperatura[5] = 29.7;

        System.out.println("O valor da temperatura no dia 3 é: " + temperatura[2]);
        System.out.println("O tamanho do array é: " + temperatura.length);

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("O valor da temperatura no dia " + (i+1) + " é: " + temperatura[i]);
        }

        for (double temp : temperatura) {
            System.out.println(temp);
        }
    }
}
