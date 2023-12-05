public class Main {
    public static void main(String[] args) {
        double[] valoresAdvertising = { 23, 26, 30, 34, 43 };
        double prediccion;
        double beta1;
        double beta0;

        System.out.println("Ecuacion de regresion: ");

        System.out.print("BETA 1: ");
        System.out.print(beta1 = DiscreteMaths.betaUno(DataSet.getAdvertisingData(), DataSet.getSalesData()));
        System.out.println();
        System.out.print("BETA 0: ");
        System.out.print(beta0 = DiscreteMaths.betaCero(DataSet.getAdvertisingData(), DataSet.getSalesData(), beta1));
        System.out.println();
        System.out.println();

        System.out.println("Sales = beta0 + beta1 * Advertising");

        System.out.println("\nPredicciones:");

        beta1 = DiscreteMaths.betaUno(DataSet.getAdvertisingData(), DataSet.getSalesData());
        beta0 = DiscreteMaths.betaCero(DataSet.getAdvertisingData(), DataSet.getSalesData(), beta1);

        for (double val : valoresAdvertising) {
            prediccion = beta0 + (beta1 * val);
            System.out.println("Advertising = " + val + ", Sales = " + prediccion);
        }
    }
}