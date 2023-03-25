public class Main {
    public static void main(String[] args) {
        Medico med1 = new Medico(true);
        ClinicoGeral med2 = new ClinicoGeral(true, true);
        Cirurgiao med3 = new Cirurgiao(true);

        med1.tratarPaciente();
        med2.receitar();
        med3.fazerIncisao();
        med3.tratarPaciente();
    }
}