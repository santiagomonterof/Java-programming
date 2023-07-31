package animales;

public abstract class Animal {

    private String especie;

    public Animal() {
    }

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getInfo() {
        return "pertenece a la especie de " + especie;
    }
}
