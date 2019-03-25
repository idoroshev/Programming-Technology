package figures.shape2d.polygon;

import figures.shape1d.Point;
import javafx.scene.paint.Color;

public class Rhombus extends Polygon {

	public Rhombus(Point firstPoint, Point secondPoint, Color stroke, Color fill) {
		super(new Point[]{new Point(Math.abs(secondPoint.x + firstPoint.x) / 2, firstPoint.y),
				new Point(secondPoint.x, Math.abs(secondPoint.y + firstPoint.y) / 2),
				new Point(Math.abs(secondPoint.x + firstPoint.x) / 2, secondPoint.y),
				new Point(firstPoint.x, Math.abs(secondPoint.y + firstPoint.y) / 2)}, stroke, fill);
	}
}