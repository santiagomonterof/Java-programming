package programation.personal.redoexam;

public class Console {

    public static void main(String[] args) {
        Generator conect = new Generator(20);
        conect.conectEquipment("Predator", 15);
        conect.conectEquipment("Portatil", 5);
        conect.conectEquipment("A/C", 22);
        conect.turnOn("Predator");
        conect.turnOff("Predator");
        conect.turnOn("Portatil");
        conect.turnOff("Portatil");
        conect.turnOn("A/C");
        conect.turnOff("A/C");
        conect.seeEquipment();
        conect.changePower(100);
        conect.turnOn("Predator");
        conect.turnOff("Predator");
        conect.turnOn("Portatil");
        conect.turnOff("Portatil");
        conect.turnOn("A/C");
        conect.turnOff("A/C");
    }
}
