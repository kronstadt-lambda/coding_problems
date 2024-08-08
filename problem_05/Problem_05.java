public class Problem_05 {
    public static void main(String[] args) {
        int num = 0;
        do {
            num++;
            if (num % 11 == 0 && num % 13 == 0 && num % 14 == 0 && num % 16 == 0 && num % 17 == 0 && num % 18 == 0 && num % 19 == 0 && num % 20 == 0) {
                break;
            }
        } while (true);

        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + num);
    }
}