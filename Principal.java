public class Principal {
    public static void main(String[] args) {
        Person person01 = new Person("Juan", 20);
        Estudiante estudiante01 = new Estudiante("1234123", "UAEM", "Ingeniería en Sistemas Inteligentes");
        person01.yourself();
        estudiante01.informacionE();
        System.out.println();

        Person person02 = new Person("Villagran Flores", 19);
        Estudiante estudiante02 = new Estudiante("1235123", "UAEM", "Ingeniería en Sistemas Inteligentes");
        person02.yourself();
        estudiante02.informacionE();
        System.out.println();

        Person person03 = new Person("Montoya", 19);
        Estudiante estudiante03 = new Estudiante("1236123", "UAEM", "Ingeniería en Sistemas Inteligentes");
        person03.yourself();
        estudiante03.informacionE();
        System.out.println();

    }
}
