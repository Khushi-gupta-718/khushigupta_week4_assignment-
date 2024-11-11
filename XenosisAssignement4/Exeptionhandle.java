// Custom Exception for invalid array operations
class InvalidArrayOperationException extends Exception {
    public InvalidArrayOperationException(String message) {
        super(message);
    }
}

// Class that contains an array and a method to sum its elements
class OneArray {
    int arr[] = {10, 20, 30, 40, 50}; // Array to store elements
    int sum= 0, i;

    // Method to calculate the sum of array elements
    void sum() {
        try {
            // Simulate possible NullPointerException by checking if array is null
            if (arr == null) {
                throw new NullPointerException("Array is null!");
            }

            // Simulate an ArithmeticException if there's a division by zero during sum
            if (arr.length == 0) {
                throw new ArithmeticException("Cannot calculate sum of an empty array.");
            }

            // Sum the array elements
            for (i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("Sum of array elements is: " + sum);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

public class Exeptionhandle {
    public static void main(String[] args) {
        OneArray OA = new OneArray();

        try {
            // Perform the sum operation inside try-catch block
            OA.sum();
        } catch (Exception e) {
            System.out.println("An error occurred while performing the sum: " + e.getMessage());
        } 
    }
}
 
