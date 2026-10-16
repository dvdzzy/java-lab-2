public class Task3 {
    public static void main(String[] args) {

        int amountOfBricks = 75;
        int containerCapacity = 8;

        int fullContainers = amountOfBricks / containerCapacity;
        int remainingBricks = amountOfBricks % containerCapacity;
        int totalContainers = fullContainers;

        if (remainingBricks > 0) {
            totalContainers++;
        }

        System.out.println("Total LEGO bricks: " + amountOfBricks);
        System.out.println("Container capacity: " + containerCapacity);
        System.out.println("Full containers: " + fullContainers);
        System.out.println("Total containers needed: " + totalContainers);
        System.out.println("Bricks in the last container: " + remainingBricks);
    }
}