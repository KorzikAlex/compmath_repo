public class MachineEpsilon {
    public static void main(String[] args) {
        // Вычисление для float
        float epsFloat = 10.0f, tenFloat = 10.0f;
        while (tenFloat + epsFloat / 2.0f != tenFloat) epsFloat /= 2.0f;
        System.out.println("Машинный эпсилон (float, начиная с 10): " + epsFloat);

        // Вычисление для double
        double epsDouble = 10.0, tenDouble = 10.0;
        while (tenDouble + epsDouble / 2.0 != tenDouble) epsDouble /= 2.0;
        System.out.println("Машинный эпсилон (double, начиная с 10): " + epsDouble);
    }
}