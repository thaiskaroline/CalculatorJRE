// A class to represent an arithmetic mean calculator
public class MeanCalculator {

    // A method to calculate the mean of an array of numbers
    public static double mean(double[] numbers) {
      // Check if the array is empty
      if (numbers == null || numbers.length == 0) {
        return 0;
      }
      // Calculate the sum of the numbers
      double sum = 0;
      for (double number : numbers) {
        sum += number;
      }
      // Divide the sum by the length of the array
      return sum / numbers.length;
    }
  
    // A main method to test the mean method
    public static void main(String[] args) {
      // Create an array of numbers
      double[] numbers = {1, 2, 3, 4, 5};
      // Calculate and print the mean
      double mean = mean(numbers);
      System.out.println("The mean is: " + mean);
    }
  }