package programation.personal.redoexam;

public class Generator {

    private int power;
    private int limit;
    private Equipment[] list = new Equipment[5];

    public Generator(int power) {
        this.power = power;
    }

    public void conectEquipment(String name, int power) {
        Equipment newTecnology = new Equipment(name, power);
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = newTecnology;
                break;
            }
        }
    }

    public String turnOn(String name) {
        for (int i = 0; i < list.length; i++) {
            if (name == list[i].getName() && list[i].getPower() <= (power + limit)) {
                System.out.println("The generator is with " + (power - list[i].getPower()) + " of power");
                break;
            } else {
                if (list[i].getPower() > (power + limit)) {
                    System.out.println("Full with the power");
                    break;
                }
            }
        }
        return "";
    }

    public String turnOff(String name) {
        System.out.println("The generator is with " + power + " of power");
        return "";
    }

    public void seeEquipment() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println((i + 1) + ".- " + list[i].getName());
            }
        }
    }

    public void changePower(int newPower) {
        power = newPower;
    }

}
