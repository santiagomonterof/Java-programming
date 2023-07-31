package Second;

public class Estadistica {

    /*
     * Crear la clase de estadística con los métodos que permitan adicionar
     *  números a un arreglo y calcular el mínimo, máximo y promedio del arreglo de números   
    *   2, 3, 5, 9, 12, 6  --> ?
    *   verLista()
    *   minimo()    -> 2
    *   maximo()    -> 12
    *   promedio()  -> 6
     */
    public String numbers[];
    public static String options[] = {"min number", "max number", "avarage"};

    public Estadistica(String list[]) {
        numbers = list;
    }

    public void verLista() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public int minNumber() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (Integer.parseInt(numbers[i]) < min) {
                min = Integer.parseInt(numbers[i]);
            }
        }
        return min;
    }

    public int maxNumber() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (Integer.parseInt(numbers[i]) > max) {
                max = Integer.parseInt(numbers[i]);
            }
        }
        return max;
    }

    public double avarage() {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += Integer.parseInt(numbers[i]);
        }
        return total / numbers.length;
    }

    public void options() {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ".- " + options[i]);
        }
    }

}
