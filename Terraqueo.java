
public class Terraqueo extends PersonagemDragonBall {
    String pais;
    String cidade;

    public Terraqueo(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, String pais, String cidade) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.pais = pais;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pais: " + pais + " | " + "Cidade: " + cidade;
    }

    public double calcularPoder(int nivelMaximoSSJ) {
        return super.calcularPoder(nivelMaximoSSJ);
    }
}
