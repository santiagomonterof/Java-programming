package programation.practice07;

public class Conejo extends Herbivoro {

    public Conejo(String especie) {
        super(especie);
    }

    @Override
    public String getInfo() {
        especie += " a la especie de los Oryctolagus cuniculus.";
        return especie;
    }

}
