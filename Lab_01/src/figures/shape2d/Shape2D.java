package figures.shape2d;

import figures.Shape;
import figures.shape1d.Point;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public abstract class Shape2D extends Shape {

	protected Color fill;

	public Shape2D(Point center, Color stroke, Color fill) {
		super(center, stroke);
		this.fill = fill;
	}

	@Override
	public abstract void draw(Pane pane);

	public void move(Point point) {

	}
}