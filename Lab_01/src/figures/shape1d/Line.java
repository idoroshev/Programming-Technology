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
		double endX = center.x - (point.x - center.x) * MULTIPLIER;
		double endY = center.y - (point.y - center.y) * MULTIPLIER;
		javafx.scene.shape.Line line = new javafx.scene.shape.Line(
				center.x,
				center.y,
				endX,
				endY);
		line.setStroke(color);
		pane.getChildren().add(line	);
	}

	public Point getLocation() {
		return null;
	}

	public void move(Point point) {

	}
}