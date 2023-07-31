package logica;

public class Persona {

    private String nombre;
    private int telefono;
    private String correo;

    public Persona() {
    }

    public Persona(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getInfo() {
        return "Nombre: " + nombre + "\nCorreo: " + correo + "\nTelefono: " + telefono;
    }

}
