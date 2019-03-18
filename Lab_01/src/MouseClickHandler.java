import figures.shape1d.Point;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class MouseClickHandler {
    int clickCount = 0;
    List<Point> points = new ArrayList<>();

    public void handle(MouseEvent event) {
        clickCount++;
        points.add(new Point(event.getX(), event.getY()));
    }
}
