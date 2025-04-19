public class Profesor {

    private String matricula;
    private String escuela;
    private String carrera;
    private String materia;
    private String grupo;

    public Profesor(String matricula, String escuela, String carrera, String materia, String grupo) {
        this.matricula = matricula;
        this.escuela = escuela;
        this.carrera = carrera;
        this.materia = materia;
        this.grupo = grupo;
    }

    public void informacionP() {
        System.out.println("Trabajo en la univeridad de " + escuela + " como profesor en la carrera de " + carrera + ".");
        System.out.println("La materia que imparto es " + materia + " al grupo " + grupo + ".");
        System.out.println("Mi matricula es " + matricula + ".");
    }

}
