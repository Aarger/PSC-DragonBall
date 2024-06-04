public class Namekuseijin extends PersonagemDragonBall{
    int quantidadeEsferas;
    boolean podeCurar;

    public Namekuseijin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    };

    @Override
    public double calcularPoder(int nivelMaximoSSJ) {
        return getKi() * (1 + (this.podeCurar ? 0.2 : 0));
    }
 
    public String fazerDesejo(String desejo) {
        return cifrarTexto(desejo, 3);
    }

    public static String cifrarTexto(String texto, int deslocamento) {
      
        deslocamento = deslocamento % 26;
        StringBuilder textoCifrado = new StringBuilder();

        for (char c : texto.toCharArray()) {
        
            if (Character.isLetter(c)) {
            
                char base = Character.isUpperCase(c) ? 'A' : 'a';
             
                c = (char) ((c - base + deslocamento) % 26 + base);
            }
           
            textoCifrado.append(c);
        }

        return textoCifrado.toString();
    }
}
