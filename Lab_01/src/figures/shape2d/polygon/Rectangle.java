package figures.shape2d.polygon;

import figures.shape1d.Point;
import javafx.scene.paint.Color;

public class Rectangle extends Polygon {

	public Rectangle(Point firstPoint, Point secondPoint, Color stroke, Color fill) {
		super(new Point[]{firstPoint,
				new Point(firstPoint.x, secondPoint.y),
				secondPoint,
				new Point(secondPoint.x, firstPoint.y)}, stroke, fill);
	}

	public void move(Point point) {

	}
}