interface Transformavel {
    boolean transformar(int nivel);
}

abstract class PersonagemDragonBall {
    String nome;
    int idade;
    String sexo;
    String temporada;
    int ki;
    String poderEspecial;

    public PersonagemDragonBall(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.temporada = temporada;
        this.ki = ki;
        this.poderEspecial = poderEspecial;
    }

    public double calcularPoder(int nivelMaximoSSJ) {
        return ki * (1 + nivelMaximoSSJ * 0.1);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoderEspecial(String poderEspecial) {
        this.poderEspecial = poderEspecial;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getIdade() {
        return idade;
    }

    public int getKi() {
        return ki;
    }

    public String getNome() {
        return nome;
    }

    public String getPoderEspecial() {
        return poderEspecial;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTemporada() {
        return temporada;
    }
}