package programation.personal.redoexam.newpackage;

public class Console {
    public static void main(String[] args) {
        
        Machine creator = new Machine(20,20);
        creator.createRecipe("Hacha", 1, 5);
        creator.produce("Hacha");
        creator.produce("Hacha");
        creator.produce("Hacha");
        creator.produce("Hacha");
        creator.produce("Hacha");
        creator.addIron(123);
        creator.addWood(123);
        creator.produce("Hacha");
        creator.produce("Hacha");
        creator.seeRecipes();
    }
}
