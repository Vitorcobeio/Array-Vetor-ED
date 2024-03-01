public class Teste {
    public static void main(String[] args)throws Exception{
        VetorObj vetor = new VetorObj(5);
        Contato c1 = new Contato("Vitor" , "99999-5858" , "vitor@gmail.com");
        Contato c2 = new Contato("Augusto" , "99999-2525" , "augusto@gmail.com");
        Contato c3 = new Contato("Guilherme" , "99999-3536" , "guilherme@gmail.com");

        try {
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
    }
}