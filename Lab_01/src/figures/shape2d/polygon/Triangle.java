package figures.shape2d.polygon;

import figures.shape1d.Point;
import javafx.scene.paint.Color;

public class Triangle extends Polygon {

	public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint, Color stroke, Color fill) {
		super(new Point[]{firstPoint, secondPoint, thirdPoint}, stroke, fill);
	}
}