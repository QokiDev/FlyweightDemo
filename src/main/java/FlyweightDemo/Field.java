package FlyweightDemo;

import FlyweightDemo.Squares.Square;
import FlyweightDemo.Squares.SquareFactory;
import FlyweightDemo.Squares.SquareType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Field extends JFrame {
    private final List<Square> squares = new ArrayList<>();

    public void plantSquare(int x, int y, String name, Color color) {
        SquareType type = SquareFactory.getSquareType(name, color);
        Square square = new Square(x, y, type);
        squares.add(square);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Square square : squares) {
            square.draw(graphics);
        }
    }
}