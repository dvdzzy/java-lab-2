public class Task2 {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Generated number: " + randomNumber);

        if (randomNumber % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}