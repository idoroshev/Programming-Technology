package figures.shape2d.ellipse;

import figures.shape1d.Point;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Circle extends Ellipse {

	public Circle(Point center, Point firstPoint, Point secondPoint, Color stroke, Color fill) {
		super(center, firstPoint, secondPoint, stroke, fill);
	}

	@Override
	public void draw(Pane pane) {

	}

	public void move(Point point) {

	}
}