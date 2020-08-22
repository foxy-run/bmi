public class Main {
    public static void main(String[] args) {
        int weight = 60;
        double height = 1.6;
        BmiService service = new BmiService();
        double index = service.calculate(height, weight);
        System.out.println(index);

    }
}
