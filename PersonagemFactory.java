public class PersonagemFactory  {
    public static void main(String[] args) {
        Sayajin Goku = new Sayajin("Goku", 35, "Masculino", "DBZ", 10000, "Kamehameha", 5, false);
        Sayajin Gohan = new Sayajin("Gohan", 14, "Masculino", "DBZ", 1000, "Bola de fogo", 2, false);
        Terraqueo Yancha = new Terraqueo("Yancha", 20, "Masculino", "DBZ", 5000, "Bola de fogo", "Japão", "Osaka");
        Namekuseijin Picollo = new Namekuseijin("Picollo", 20, "Masculino", "DBZ", 5000, "Bola de fogo", 5, false);
       
        if (Goku.transformar(5)) {
            System.out.println(Goku.getNome() + " transformou para super sayajin nível " + 5);
        } else{
            System.out.println("Não foi possível transformar esse sayajin: " + Goku.getNome());
        };

        if (Gohan.transformar(5)) {
            System.out.println(Goku.getNome() + " transformou para super sayajin nível " + 5);
        } else{
            if (Gohan.transformar(3)) {
                System.out.println(Gohan.getNome() + " transformou para super sayajin nível " + 3);
            } else{
                System.out.println("Não foi possível transformar esse sayajin: " + Gohan.getNome());
            };
        };

        String linguagemNamekusei = Picollo.fazerDesejo("QUAL O SEU DESEJO:");
        System.out.println(linguagemNamekusei);
    }
}
