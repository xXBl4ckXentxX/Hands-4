public class DiscreteMaths {
    public static double sumatoriaAdvertising(double[] valoresAdvertising) {
        double sumatoria = 0;
        valoresAdvertising = DataSet.getAdvertisingData();

        for (int i = 0; i < valoresAdvertising.length; i++) {
            sumatoria += valoresAdvertising[i];
        }

        return sumatoria;
    }

    public static double sumatoriaSales(double[] valoresSales) {
        double sumatoria = 0;
        valoresSales = DataSet.getSalesData();

        for (int i = 0; i < valoresSales.length; i++) {
            sumatoria += valoresSales[i];
        }

        return sumatoria;
    }

    public static double calcularProducto(double[] valoresSales, double[] valoresAdvertising) {
        double sumatoria = 0;
        valoresSales = DataSet.getSalesData();
        valoresAdvertising = DataSet.getAdvertisingData();

        for (int i = 0; i < valoresSales.length; i++) {
            sumatoria += valoresSales[i] * valoresAdvertising[i];
        }

        return sumatoria;
    }

    public static double potenciaAdvertising(double[] valoresAdvertising) {
        double sumatoria = 0;

        for (int i = 0; i < valoresAdvertising.length; i++) {
            double potencia = Math.pow(valoresAdvertising[i], 2);
            sumatoria += potencia;
        }

        return sumatoria;
    }

    public static double betaUno(double[] valoresAdvertising, double[] valoresSales) {
        int n = valoresSales.length;

        double sumatoriaSales = sumatoriaSales(valoresSales);
        double sumatoriaAdvertising = sumatoriaAdvertising(valoresAdvertising);
        double sumatoriaPotenciaAdvertising = potenciaAdvertising(valoresAdvertising);
        double sumatoriaProducto = calcularProducto(valoresSales, valoresAdvertising);

        double numerador = (n * sumatoriaProducto - sumatoriaAdvertising * sumatoriaSales);
        double denominador = (n * sumatoriaPotenciaAdvertising - Math.pow(sumatoriaAdvertising, 2));

        return numerador / denominador;
    }

    public static double betaCero(double[] valoresAdvertising, double[] valoresSales, double beta1) {
        int n = valoresSales.length;

        double sumatoriaSales = sumatoriaSales(valoresSales);
        double sumatoriaAdvertising = sumatoriaAdvertising(valoresAdvertising);

        return (sumatoriaSales / n) - (beta1 * (sumatoriaAdvertising / n));
    }
}