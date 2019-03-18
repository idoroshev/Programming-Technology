package figures.shape2d.ellipse;

import figures.shape1d.Point;
import figures.shape2d.Shape2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Ellipse extends Shape2D {

	private Point firstPoint;
	private Point secondPoint;

	public Ellipse(Point center, Point firstPoint, Point secondPoint, Color stroke, Color fill) {
		super(center, stroke, fill);
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
	}

	@Override
	public void draw(Pane pane) {

	}

	public void move(Point point) {

	}
}