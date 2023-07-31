package programation.practice06;

public class Estudiante extends Persona{

    private int notaFinal;
    private int codigoEstudiante;
    
    public Estudiante(String nombre, String apellidos, int edad, int notaFinal, int codigoEstudiante) {
        super(nombre, apellidos, edad);
        this.notaFinal = notaFinal;
        this.codigoEstudiante = codigoEstudiante;
    }

    public String mostrarDatos(){
        System.out.println("Nombre "+ getNombre());
        System.out.println("Apellidos "+ getApellidos());
        System.out.println("Edad "+ getEdad());
        System.out.println("Nota Final "+ notaFinal);
        System.out.println("Nota Final "+ codigoEstudiante);       
        return "";
    }
 
}
