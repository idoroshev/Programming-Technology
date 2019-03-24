package figures;

import figures.shape1d.Point;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public abstract class Shape {

	protected Point center;
	protected Color color;

	public Shape(Point center, Color color) {
		this.center = center;
		this.color = color;
	}

	public void setColor(Color color) {
        this.color = color;
    }

	public abstract void draw(Pane pane);

	public Point getLocation() {
		return center;
	}

	public abstract void move(Point point);
}