public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80;
        double height = 1.90;
        double bodyMassIndex = service.multiplication(weight, height);
        System.out.printf("%.2f", bodyMassIndex);
    }
}