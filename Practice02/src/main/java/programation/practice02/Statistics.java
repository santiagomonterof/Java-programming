package programation.practice02;

public class Statistics {

    private String numbers[];

    public Statistics(String numbers[]) {
        this.numbers = numbers;
    }

    public void seeList() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public String addNumbers(int number) {
        String answer = "Añadido Exitosamente";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                numbers[i] = number + "";
                break;
            } else {
                if (i == (numbers.length - 1)) {
                    answer = "Lleno";
                    return answer;
                }
            }
        }
        return answer;
    }

    public int minNumber() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                break;
            }
            if (Integer.parseInt(numbers[i]) < min) {
                min = Integer.parseInt(numbers[i]);

            }
        }
        return min;
    }

    public int maxNumber() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                break;
            }
            if (Integer.parseInt(numbers[i]) > max) {
                max = Integer.parseInt(numbers[i]);
            }
        }
        return max;
    }

    public double avarage() {
        int rest = 0;
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                break;
            } else {
                total += Integer.parseInt(numbers[i]);
                rest++;
            }
        }
        return total / rest;
    }

}
