package figures.shape2d.ellipse;

import figures.shape1d.Point;
import figures.shape2d.Shape2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Ellipse extends Shape2D {

	private Point firstPoint;
	private Point secondPoint;
	private javafx.scene.shape.Ellipse ellipse;

	public Ellipse(Point center, Point firstPoint, Point secondPoint, Color stroke, Color fill) {
		super(center, stroke, fill);
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
	}

	@Override
	public void draw(Pane pane) {
		ellipse = new javafx.scene.shape.Ellipse();
		ellipse.setCenterX(center.x);
		ellipse.setCenterY(center.y);
		ellipse.setRadiusX(Math.abs(secondPoint.x - center.x));
		ellipse.setRadiusY(Math.abs(firstPoint.y - center.y));
		ellipse.setStroke(color);
		ellipse.setFill(fill);
		pane.getChildren().add(ellipse);
	}

	@Override
	public void move(Pane pane, Point point) {
        pane.getChildren().remove(ellipse);
        double dx = point.x - center.x;
        double dy = point.y - center.y;
        firstPoint.x += dx;
        secondPoint.x += dx;
        center.x += dx;
        firstPoint.y += dy;
        secondPoint.y += dy;
        center.y += dy;
        draw(pane);
	}
}