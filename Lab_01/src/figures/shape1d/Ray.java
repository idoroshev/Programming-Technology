package figures.shape1d;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Ray extends Segment {
	protected static final int MULTIPLIER = 50;
	protected Line ray;

	public Ray(Point p1, Point p2, Color color) {
		super(p1, p2, color);
	}

	@Override
	public void draw(Pane pane) {
		super.draw(pane);
		ray = new Line(
				anotherPoint.x,
				anotherPoint.y,
				anotherPoint.x + (anotherPoint.x - center.x) * MULTIPLIER,
				anotherPoint.y + (anotherPoint.y - center.y) * MULTIPLIER);
		ray.setStroke(color);
		pane.getChildren().add(ray	);
	}

	public Point getLocation() {
		return null;
	}

	@Override
	public void move(Pane pane, Point point) {
		pane.getChildren().remove(segment);
		pane.getChildren().remove(ray);
		double dx = point.x - center.x;
		double dy = point.y - center.y;
        anotherPoint.x += dx;
		center.x += dx;
        anotherPoint.y += dy;
		center.y += dy;
		draw(pane);
	}
}