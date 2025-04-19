public class Estudiante {

    private String matricula;
    private String escuela;
    private String carrera;

    public Estudiante(String matricula, String escuela, String carrera) {
        this.matricula = matricula;
        this.escuela = escuela;
        this.carrera = carrera;
    }

    public void informacionE() {
        System.out.println("Estudio en la univeridad de " + escuela + " en la carrera de " + carrera + ".");
        System.out.println("Y mi matricula es " + matricula + ".");
    }
}