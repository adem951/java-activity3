
import java.util.ArrayList;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Ask the user to input a list of numbers
                System.out.print("Enter a list of numbers separated by spaces: ");
                String userInput = scanner.nextLine();

                // Call the method and pass the user input
                double average = calculateAverage(userInput);

                // Print the average
                System.out.println("The average is: " + average);
            }

            public static double calculateAverage(String input) {
                // Convert the string of numbers into an ArrayList
                String[] numbersAsString = input.split(" ");
                ArrayList<Integer> numbers = new ArrayList<>();

                for (String number : numbersAsString) {
                    numbers.add(Integer.parseInt(number));
                }

                // Loop through the ArrayList to calculate the total
                int total = 0;
                for (int number : numbers) {
                    total += number;
                }

                // Calculate the average
                double average = (double) total / numbers.size();

                return average;
            }
        }
