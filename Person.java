public class Person {
    private String nombre;
    private int edad;
    private String matricula;
    private String escuela;
    private String carrera;

    public Person(String nombre, int edad, String matricula, String escuela, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.escuela = escuela;
        this.carrera = carrera;
    }

    public void yourself() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
        System.out.println("La Universidad en la que estudio es la " + escuela + " en la carrera de " + carrera + ".");
        System.out.println("Por ultimo, también tengo mi numero de matricula " + matricula + ".");
        System.out.println();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}