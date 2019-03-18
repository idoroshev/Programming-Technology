package figures.shape1d;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Line extends Ray {

	public Line(Point p1, Point p2, Color color) {
		super(p1, p2, color);
	}

	@Override
	public void draw(Pane pane) {
		super.draw(pane);
		javafx.scene.shape.Line line = new javafx.scene.shape.Line(
				center.x,
				center.y,
				center.x - (point.x - center.x) * MULTIPLIER,
				center.y - (point.y - center.y) * MULTIPLIER);
		pane.getChildren().add(line	);
	}

	public Point getLocation() {
		return null;
	}

	public void move(Point point) {

	}
}