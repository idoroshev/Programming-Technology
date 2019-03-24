package figures.shape1d;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Ray extends Segment {
	protected static final int MULTIPLIER = 100_000;

	public Ray(Point p1, Point p2, Color color) {
		super(p1, p2, color);
	}

	@Override
	public void draw(Pane pane) {
		super.draw(pane);
		Line line = new Line(
				point.x,
				point.y,
				point.x + (point.x - center.x) * MULTIPLIER,
				point.y + (point.y - center.y) * MULTIPLIER);
		line.setStroke(color);
		pane.getChildren().add(line	);
	}

	public Point getLocation() {
		return null;
	}

	public void move(Point point) {

	}
}