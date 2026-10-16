public class Task1 {

    static float earthWeightSahibzada = 55.0f;
    static float marsGravitySahibzada = 0.38f;

    static float marsWeightSahibzada;
    static double marsWeightDoubleSahibzada;
    static int marsWeightIntSahibzada;
    static char marsWeightCharSahibzada;
    static int finalResultSahibzada;

    public static void main(String[] args) {

        marsWeightSahibzada = earthWeightSahibzada * marsGravitySahibzada;
        marsWeightDoubleSahibzada = marsWeightSahibzada;
        marsWeightIntSahibzada = (int) marsWeightDoubleSahibzada;
        marsWeightCharSahibzada = (char) marsWeightIntSahibzada;
        finalResultSahibzada = marsWeightCharSahibzada + 10;

        System.out.println("Earth weight: " + earthWeightSahibzada);
        System.out.printf("Mars weight: %.4f%n", marsWeightDoubleSahibzada);
        System.out.println("Converted to int: " + marsWeightIntSahibzada);
        System.out.println("Converted to char: " + marsWeightCharSahibzada);
        System.out.println("Char numeric value + 10: " + finalResultSahibzada);
    }
}