package figures.shape2d.polygon;

import figures.shape1d.Point;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class SymmetricPolygon extends Polygon {

	public SymmetricPolygon(Point[] points, Color stroke, Color fill) {
		super(points, stroke, fill);
	}

	@SuppressWarnings("ToArrayCallWithZeroLengthArrayArgument")
	public static Point[] getSymmetricPoints(Point first, Point secondPoint, int count) {
		List<Point> points = new ArrayList<>();
		Point center = new Point(Math.abs(secondPoint.x + first.x) / 2, Math.abs(secondPoint.y + first.y) / 2);
		double radius = Math.abs(Math.abs(first.x - center.x));
		double angle = 2 * Math.PI / count;
		double currentAngle = 0;
		for (int i = 0; i < count; i++) {
			double dx = radius * Math.sin(currentAngle);
			double dy = radius * Math.cos(currentAngle);
			points.add(new Point((int)(center.x + dx), (int) (center.y + dy)));
			currentAngle += angle;
		}
		return points.toArray(new Point[points.size()]);
	}
}