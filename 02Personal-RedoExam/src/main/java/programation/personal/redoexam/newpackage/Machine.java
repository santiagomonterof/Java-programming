package programation.personal.redoexam.newpackage;

public class Machine {

    private Recipe[] list = new Recipe[5];
    private int wood;
    private int iron;

    public Machine(int wood, int iron) {
        this.wood = wood;
        this.iron = iron;
    }

    public void createRecipe(String name, int wood, int metal) {
        Recipe newRecipe = new Recipe(name, wood, metal);
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = newRecipe;
                break;
            }
        }
    }

    public String produce(String name) {
        for (int i = 0; i < list.length; i++) {
            if (name == list[i].getName() && wood > 0 && iron > 0) {
                wood = wood - list[i].getWood();
                iron = iron - list[i].getIron();
                //System.out.println(wood + " " + iron);
                System.out.println("The axe is ready");
                break;
            } else {
                if (wood == 0 || iron == 0) {
                    System.out.println("We need more materials");
                    break;
                }
            }
        }
        return "";
    }

    public String seeRecipes() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println((i + 1) + ".- " + list[i].getName());
            }
        }
        return "";
    }

    public void addWood(int newWood) {
        wood = newWood;
    }

    public void addIron(int newIron) {
        iron = newIron;
    }

}
