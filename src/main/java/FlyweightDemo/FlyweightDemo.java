package FlyweightDemo;

import java.awt.*;

public class FlyweightDemo {
    static int canvasSize = 500;
    static int totalElements = 1000000;
    static int totalTypes = 6;

    public static void main(String[] args) {
        Field field = new Field();

        for (int i = 0; i < Math.floor(totalElements / totalTypes); i++) {
            field.plantSquare(random(0, canvasSize), random(0, canvasSize), "Blue", Color.BLUE);
            field.plantSquare(random(0, canvasSize), random(0, canvasSize), "Yellow", Color.ORANGE);
            field.plantSquare(random(0, canvasSize), random(0, canvasSize), "Red", Color.RED);
            field.plantSquare(random(0, canvasSize), random(0, canvasSize), "Green", Color.GREEN);
            field.plantSquare(random(0, canvasSize), random(0, canvasSize), "Orange", Color.ORANGE);
            field.plantSquare(random(0, canvasSize), random(0, canvasSize), "Black", Color.BLACK);
        }

        field.setSize(canvasSize, canvasSize);
        field.setVisible(true);

        System.out.println("\nTotal squares to draw: " + totalElements + "\n");
        System.out.println("------------------------------------");
        System.out.println("Square size (8 bytes) * " + totalElements);
        System.out.println("Square type size (~30 bytes) * " + totalTypes);
        System.out.println("------------------------------------\n");

        int memoryWFlyweight = (totalElements * 8 + totalTypes * 30) / 1024 / 1024;
        int memoryWOFlyweight = (totalElements * 38 / 1024 / 1024);

        System.out.println("Memory usage with Flyweight: " + memoryWFlyweight + " Megabytes");
        System.out.println("Memory usage without Flyweight: " + memoryWOFlyweight + " Megabytes\n");

        System.out.println("Memory usage difference (saved): " + (memoryWOFlyweight - memoryWFlyweight) + " Megabytes");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}