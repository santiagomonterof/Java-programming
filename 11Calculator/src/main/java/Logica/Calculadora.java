package Logica;

public class Calculadora {

    private double resultado;

    public Double sumar(double nro1, double nro2) {
        return nro1 + nro2;
    }

    public Double resta(double nro1, double nro2) {
        return nro1 - nro2;
    }

    public Double multiplicacion(double nro1, double nro2) {
        return nro1 * nro2;
    }

    public Double division(double nro1, double nro2) {
        return nro1 / nro2;
    }

    public double calcular(String num1, char operacion, String num2) {
        double nro1 = new Double(num1);
        double nro2 = new Double(num2);

        switch (operacion) {
            case '+':
                resultado = sumar(nro1, nro2);
                return resultado;
            case '-':
                resultado = resta(nro1, nro2);
                return resultado;
            case '*':
                resultado = multiplicacion(nro1, nro2);
                return resultado;
            case '/':
                resultado = division(nro1, nro2);
                return resultado;
            case '=':
                return resultado;
            default:
                return 0;
        }
    }

}
