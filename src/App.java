public class App {
    public static void main(String[] args) throws Exception {

        double med1 = CalculadoraMedia(40, 60, 80, 20, 30, 10);

        System.out.println("A média é " + med1);
    }

    /**
     * @return
     */
    public static double CalculadoraMedia(double x, double y, double z, double s, double f, double g) {
        return ((x + y + z + s + f + g) / 6);

    }
}
