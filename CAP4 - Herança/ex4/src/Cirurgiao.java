public class Cirurgiao extends Medico {
    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }

    public void tratarPaciente(){
        System.out.println("Paciente operado");
    }
    public void fazerIncisao(){
        System.out.println("Incisão bem sucessida");
    }
}
