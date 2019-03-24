package figures.shape2d.polygon;

import figures.shape1d.Point;
import figures.shape2d.Shape2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape2D {

	private Point[] points;

	public Polygon(Point[] points, Color stroke, Color fill) {
		super(points[0], stroke, fill);
		this.points = points;
	}

	@Override
	public void draw(Pane pane) {
		javafx.scene.shape.Polygon polygon = new javafx.scene.shape.Polygon();
		List<Double> list = new ArrayList<>();
		for (Point point : points) {
			list.add(point.x);
			list.add(point.y);
		}
		polygon.getPoints().setAll(list);
		polygon.setStroke(color);
		polygon.setFill(fill);
		pane.getChildren().add(polygon);
	}

	public void move(Point point) {

	}
}