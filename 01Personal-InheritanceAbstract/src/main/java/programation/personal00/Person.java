package programation.personal00;

public class Person {

    private String name;
    private int vida;

    private Item[] bag = new Item[5];

    public Person(String name, int vida) {
        this.name = name;
        this.vida = vida;
    }

    public void saveItem(Item object) {
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] == null) {
                bag[i] = object;
                break;
            }
        }
    }

    public String use(int position) {
        Item aux = bag[position];
        vida = aux.use(vida);
        return "";
    }
    
}
