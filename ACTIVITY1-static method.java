public class Average {

  public static void main(String[] args) {
        double[] numbers = { 5.5, 10.0, 15.5, 20.0, 25.5 };
        double average = calculateAverage(numbers);

        System.out.println("Average: " + average);
    }
    
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

  
}
