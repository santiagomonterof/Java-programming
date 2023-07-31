package programation.practice07;

public abstract class Animal {

    String especie;

    
    public Animal(String especie) {
        this.especie = especie;
    }

    public String getInfo() {
        
        return "Pertenece a la especie de " + especie;
    }
}
