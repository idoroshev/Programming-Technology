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

		this.firstPoint = new Point(
			Math.min(firstPoint.x, secondPoint.x),
			Math.min(firstPoint.y, secondPoint.y)
		);
		this.secondPoint = new Point(
			Math.max(firstPoint.x, secondPoint.x),
			Math.max(firstPoint.y, secondPoint.y)
		);
	}

	@Override
	public void draw(Pane pane) {
		javafx.scene.shape.Ellipse ellipse = new javafx.scene.shape.Ellipse();
		ellipse.setCenterX(center.x);
		ellipse.setCenterY(center.y);
		ellipse.setRadiusX(secondPoint.x - center.x);
		ellipse.setRadiusY(firstPoint.y - center.y);
		pane.getChildren().add(ellipse);
	}

	public void move(Point point) {

	}
}