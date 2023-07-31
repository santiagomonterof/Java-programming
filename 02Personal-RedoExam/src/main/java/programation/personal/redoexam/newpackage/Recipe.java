package programation.personal.redoexam.newpackage;

public class Recipe {

    private String name;
    private int wood;
    private int iron;

    public Recipe(String name, int wood, int iron) {
        this.name = name;
        this.wood = wood;
        this.iron = iron;
    }

    public String getName() {
        return name;
    }

    public int getWood() {
        return wood;
    }

    public int getIron() {
        return iron;
    }

}
