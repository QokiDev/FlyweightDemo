package FlyweightDemo.Squares;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class SquareFactory {
    static Map<String, SquareType> squareTypes = new HashMap<>();

    public static SquareType getSquareType(String name, Color color) {
        SquareType result = squareTypes.get(name);

        if (result == null) {
            result = new SquareType(name, color);
            squareTypes.put(name, result);
        }

        return result;
    }

}