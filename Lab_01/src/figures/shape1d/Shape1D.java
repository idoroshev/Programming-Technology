package figures.shape1d;

import figures.Shape;
import javafx.scene.paint.Color;

public abstract class Shape1D extends Shape {

	protected Point anotherPoint;

	public Shape1D(Point p1, Point p2, Color color) {
        super(p1, color);
        this.anotherPoint = p2;
    }
}