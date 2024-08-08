public class Problem_02 {
    public int sum_even_fibonacci(int top_number) {

        // Initialize variables
        int a = 1;
        int b = 2;
        int number;
        int sum = b;
        
        // Calculate the sum of the even Fibonacci numbers
        while (a + b < top_number) {
            number = a + b;
            if (number % 2 == 0) {
                sum += number;
            }            
            a = b;
            b = number;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Problem_02 problem_02 = new Problem_02();

        // Initialize variables
        int top_number = 4_000_000;
        int solution = problem_02.sum_even_fibonacci(top_number);

        // Print the solution
        System.out.println("The sum of all the even Fibonacci numbers below " + top_number + " is " + solution);
   
    }
}