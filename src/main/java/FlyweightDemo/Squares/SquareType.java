package FlyweightDemo.Squares;

import java.awt.*;

public class SquareType {
    private String name;
    private Color color;

    public SquareType(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x - 5, y - 10, 10, 10);
    }
}