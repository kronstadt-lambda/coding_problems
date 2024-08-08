public class Problem_01 {
    public static void main(String[] args) {
        int sum = 0;
        int top_number = 1000;
        for (int i = 1; i < top_number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of all the multiples of 3 or 5 below " + top_number + " is " + sum);
    }
}