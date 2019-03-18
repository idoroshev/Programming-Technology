package figures.shape2d.polygon;

import figures.shape1d.Point;
import figures.shape2d.Shape2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Polygon extends Shape2D {

	private Point[] points;

	public Polygon(Point[] points, Color stroke, Color fill) {
		super(points[0], stroke, fill);
		this.points = points;
	}

	@Override
	public void draw(Pane pane) {
		//TODO
	}

	public void move(Point point) {

	}
}