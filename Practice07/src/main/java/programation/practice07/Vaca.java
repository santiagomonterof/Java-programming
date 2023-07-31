package programation.practice07;

public class Vaca extends Herbivoro {

    public Vaca(String especie) {
        super(especie);
    }

    @Override
    public String getInfo() {
        return "Vaca, un término que deriva del latín vacca, es la hembra de la especie Bos primigenius taurus, cuyo macho es el toro.";
    }
}
