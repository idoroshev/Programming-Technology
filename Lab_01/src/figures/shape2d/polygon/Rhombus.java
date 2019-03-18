package figures.shape2d.polygon;

import figures.shape1d.Point;
import javafx.scene.paint.Color;

public class Rhombus extends Polygon {

	public Rhombus(Point firstPoint, Point secondPoint, Color stroke, Color fill) {
		super(new Point[]{new Point((secondPoint.x - firstPoint.x) / 2, firstPoint.y),
				new Point(secondPoint.x, (secondPoint.y - firstPoint.y) / 2),
				new Point((secondPoint.x - firstPoint.x) / 2, secondPoint.y),
				new Point(firstPoint.x, (secondPoint.y - firstPoint.y) / 2)}, stroke, fill);
	}

	public void move(Point point) {

	}
}