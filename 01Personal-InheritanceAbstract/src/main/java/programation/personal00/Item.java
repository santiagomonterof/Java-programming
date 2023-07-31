package programation.personal00;

public class Item {
    
    private String name;
    private int damage;

    public Item(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    
    public int use(int health){
        return health;
    }
    

}
