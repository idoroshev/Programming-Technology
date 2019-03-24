package figures.shape2d.polygon;

import figures.shape1d.Point;
import figures.shape2d.Shape2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Polygon extends Shape2D {

	private Point[] points;

	public Polygon(Point[] points, Color stroke, Color fill) {
		super(points[0], stroke, fill);
		this.points = points;
	}

	@Override
	public void draw(Pane pane) {
		for (int i = 0; i < points.length - 1; ++i) {
			Line line = new Line(points[i].x, points[i].y, points[i + 1].x, points[i + 1].y);
			pane.getChildren().add(line);
		}
		Line endLine = new Line(points[0].x, points[0].y, points[points.length - 1].x, points[points.length - 1].y);
		pane.getChildren().add(endLine);
	}

	public void move(Point point) {

	}
}