package figures.shape2d.polygon;

import figures.shape1d.Point;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class SymmetricPolygon extends Polygon {

	public SymmetricPolygon(Point[] points, int count, Color stroke, Color fill) {
		super(points, stroke, fill);
	}

	public void move(Point point) {

	}

	public static Point[] getSymmetricPoints(Point first, Point secondPoint, int count) {
		List<Point> points = new ArrayList<>();
		Point center = new Point((secondPoint.x - first.x) / 2, (secondPoint.y - first.y) / 2);
		double radius = Math.abs(first.x - center.x);
		double angle = 2 * Math.PI / count;
		double currentAngle = 0;
		for (int i = 0; i < count; i++) {
			double dx = radius * Math.sin(currentAngle);
			double dy = radius * Math.cos(currentAngle);
			points.add(new Point((int)(center.x + dx), (int) (center.y + dy)));
			currentAngle += angle;
		}
		return (Point[]) points.toArray();
	}
}