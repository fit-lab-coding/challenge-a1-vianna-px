package fit.challenge;

public class ImcCalculator {
    public static String calculate(double peso , double altura) {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 18.5) return "Magreza";
        if (imc < 24.9) return "Normal";
        if (imc > 30.0) return "Obesidade";
        
        return "Sobrepeso";
    }
}
