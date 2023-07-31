package animales;

public class Conejo extends Herbivoro{

    public Conejo(String especie) {
        super(especie);
    }
    
    @Override
    public String getInfo(){
        return "El conejo "+super.getInfo();
    }
}
