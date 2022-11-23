package FlyweightDemo.Squares;

import java.awt.*;

public class Square {
    private int x;
    private int y;
    private SquareType type;

    public Square(int x, int y, SquareType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}