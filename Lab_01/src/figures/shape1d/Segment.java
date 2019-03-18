package figures.shape1d;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Segment extends Shape1D {

	public Segment(Point p1, Point p2, Color color) {
		super(p1, p2, color);
	}

	@Override
	public void draw(Pane pane) {
		Line line = new Line(center.x, center.y, point.x, point.y);
		line.setStroke(color);
		pane.getChildren().add(line);
	}

	public Point getLocation() {
		return null;
	}

	public void move(Point point) {

	}
}