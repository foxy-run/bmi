public class BmiService {
    public double calculate(double height, int weight) {
        double index = weight / (height * height);
        return index;
    }
}
