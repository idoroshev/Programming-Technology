package figures.shape1d;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Line extends Ray {

    private javafx.scene.shape.Line line;

	public Line(Point p1, Point p2, Color color) {
		super(p1, p2, color);
	}

	@Override
	public void draw(Pane pane) {
		super.draw(pane);
		double endX = center.x - (anotherPoint.x - center.x) * MULTIPLIER;
		double endY = center.y - (anotherPoint.y - center.y) * MULTIPLIER;
		line = new javafx.scene.shape.Line(
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

    @Override
    public void move(Pane pane, Point point) {
        pane.getChildren().remove(segment);
        pane.getChildren().remove(ray);
        pane.getChildren().remove(line);
        double dx = point.x - center.x;
        double dy = point.y - center.y;
        anotherPoint.x += dx;
        center.x += dx;
        anotherPoint.y += dy;
        center.y += dy;
        draw(pane);
    }
}