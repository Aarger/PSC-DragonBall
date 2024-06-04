
public class Sayajin extends PersonagemDragonBall implements Transformavel {
    int nivelMaximoSSJ;
    boolean temRabo;

    public Sayajin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial,
            int nivelMaximoSSJ, boolean temRabo) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;
    }

    @Override
    public double calcularPoder(int nivelMaximoSSJ) {
        return super.calcularPoder(nivelMaximoSSJ);
    }

    @Override
    public boolean transformar(int nivel) {
        if (nivel <= nivelMaximoSSJ) {
            return true;
        } else {
            return false;
        }
    }
}
