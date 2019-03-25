package figures.shape1d;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Segment extends Shape1D {
	protected Line segment;

	public Segment(Point p1, Point p2, Color color) {
		super(p1, p2, color);
	}

	@Override
	public void draw(Pane pane) {
		segment = new Line(center.x, center.y, anotherPoint.x, anotherPoint.y);
		segment.setStroke(color);
		pane.getChildren().add(segment);
	}

	public Point getLocation() {
		return null;
	}

	@Override
	public void move(Pane pane, Point point) {
		pane.getChildren().remove(segment);
		double dx = point.x - center.x;
		double dy = point.y - center.y;
        anotherPoint.x += dx;
		center.x += dx;
        anotherPoint.y += dy;
		center.y += dy;
		draw(pane);
	}
}