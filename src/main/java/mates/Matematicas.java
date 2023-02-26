package mates;
public class Matematicas {

    /**
     * Genera una aproximación al número pi mediante el método de
     * Montecarlo. El parámetro ‘pasos‘ indica el número de puntos
     * generado.
     */
    public static double generarNumeroPi(int puntos) {
        double aciertos = 0;
        double areaCuadrado = 4;
        double areaCirculo = 1;
        for (int i = 1; i < puntos; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) < 1) {
                aciertos++;
            }
        }
        return areaCuadrado * (aciertos / puntos);
    }
}
