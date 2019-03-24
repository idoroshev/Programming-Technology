import figures.Shape;
import figures.shape1d.Line;
import figures.shape1d.Point;
import figures.shape1d.Ray;
import figures.shape1d.Segment;
import figures.shape2d.ellipse.Circle;
import figures.shape2d.ellipse.Ellipse;
import figures.shape2d.polygon.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem drawLine;

    @FXML
    private MenuItem drawRay;

    @FXML
    private MenuItem drawSegment;

    @FXML
    private MenuItem drawPolygon;

    @FXML
    private MenuItem drawSymmetric;

    @FXML
    private MenuItem drawRectangle;

    @FXML
    private MenuItem drawTriangle;

    @FXML
    private MenuItem drawRhombus;

    @FXML
    private MenuItem drawSquare;

    @FXML
    private MenuItem drawEllipse;

    @FXML
    private MenuItem drawCircle;

    @FXML
    private MenuItem changeColor;

    @FXML
    private Pane pane;

    private Stage stage;

    private Shape currentShape;

    private ShapeType currentShapeType = ShapeType.NONE;

    private int clickCount = 0;
    private List<Point> points = new ArrayList<>();

    private int vertexCount = 5;

    @FXML
    void changeColor(ActionEvent event) {

    }

    @FXML
    void onDrawCircle(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.CIRCLE;
    }

    @FXML
    void onDrawEllipse(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.ELLIPSE;
    }

    @FXML
    void onDrawLine(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.LINE;
    }

    @FXML
    void onDrawPolygon(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.POLYGON;
    }

    @FXML
    void onDrawRay(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.RAY;
    }

    @FXML
    void onDrawRectangle(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.RECTANGLE;
    }

    @FXML
    void onDrawRhombus(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.RHOMBUS;
    }

    @FXML
    void onDrawSegment(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.SEGMENT;
    }

    @FXML
    void onDrawSymmetric(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.SYMMETRIC_POLYGON;
    }

    @FXML
    void onDrawTriangle(ActionEvent event) {
        clearPoints();
        currentShapeType = ShapeType.TRIANGLE;
    }

    @FXML
    void initialize() {

    }

    private void processCircle(MouseEvent event) {
        if (clickCount == 2) {
            Point center = new Point((
                    points.get(0).x + points.get(1).x) / 2,
                    (points.get(0).y + points.get(1).y) / 2);
            Circle circle = new Circle(center, points.get(0), points.get(1), Color.BLACK, Color.BLACK);
            circle.draw(pane);
            currentShape = circle;
            clearPoints();
        }
    }

    private void processEllipse(MouseEvent event) {
        if (clickCount == 2) {
            Point center = new Point(
                    (points.get(0).x + points.get(1).x) / 2,
                    (points.get(0).y + points.get(1).y) / 2);
            Ellipse ellipse = new Ellipse(center, points.get(0), points.get(1), Color.BLACK, Color.BLACK);
            ellipse.draw(pane);
            currentShape = ellipse;
            clearPoints();
        }
    }

    private void processLine(MouseEvent event) {
        if (clickCount == 2) {
            Line line = new Line(points.get(0), points.get(1), Color.BLACK);
            line.draw(pane);
            currentShape = line;
            clearPoints();
        }
    }

    private void processPolygon(MouseEvent event) {
        if (clickCount == vertexCount) {
            Polygon polygon = new Polygon(points.toArray(new Point[vertexCount]), Color.BLACK, Color.BLACK);
            polygon.draw(pane);
            currentShape = polygon;
            clearPoints();
        }
    }

    private void processRay(MouseEvent event) {
        if (clickCount == 2) {
            Ray ray = new Ray(points.get(0), points.get(1), Color.BLACK);
            ray.draw(pane);
            currentShape = ray;
            clearPoints();
        }
    }

    private void processRectangle(MouseEvent event) {
        if (clickCount == 2) {
            Rectangle rectangle = new Rectangle(points.get(0), points.get(1), Color.BLACK, Color.BLACK);
            rectangle.draw(pane);
            currentShape = rectangle;
            clearPoints();
        }
    }

    private void processRhombus(MouseEvent event) {
        if (clickCount == 2) {
            Rhombus rhombus = new Rhombus(points.get(0), points.get(1), Color.BLACK, Color.BLACK);
            rhombus.draw(pane);
            currentShape = rhombus;
            clearPoints();
        }
    }

    private void processSegment(MouseEvent event) {
        if (clickCount == 2) {
            Segment segment = new Segment(points.get(0), points.get(1), Color.BLACK);
            segment.draw(pane);
            currentShape = segment;
            clearPoints();
        }
    }

    private void processSymmetric(MouseEvent event) {
        if (clickCount == 2) {
            SymmetricPolygon symmetric =
                    new SymmetricPolygon(SymmetricPolygon.getSymmetricPoints(
                            points.get(0), points.get(1), vertexCount), Color.BLACK, Color.BLACK);
            symmetric.draw(pane);
            currentShape = symmetric;
            clearPoints();
        }
    }

    private void processTriangle(MouseEvent event) {
        if (clickCount == 3) {
            Triangle triangle =
                    new Triangle(points.get(0), points.get(1), points.get(2), Color.BLACK, Color.BLACK);
            triangle.draw(pane);
            currentShape = triangle;
            clearPoints();
        }
    }

    public void setPrimaryStage(Stage stage) {
        this.stage = stage;
        pane.addEventFilter(MouseEvent.MOUSE_CLICKED, clickEvent -> {
            clickCount++;
            points.add(new Point(clickEvent.getX(), clickEvent.getY()));
            switch (currentShapeType) {
                case LINE:
                    processLine(clickEvent);
                    break;
                case RAY:
                    processRay(clickEvent);
                    break;
                case SEGMENT:
                    processSegment(clickEvent);
                    break;
                case ELLIPSE:
                    processEllipse(clickEvent);
                    break;
                case CIRCLE:
                    processCircle(clickEvent);
                    break;
                case POLYGON:
                    processPolygon(clickEvent);
                    break;
                case RECTANGLE:
                    processRectangle(clickEvent);
                    break;
                case RHOMBUS:
                    processRhombus(clickEvent);
                    break;
                case SYMMETRIC_POLYGON:
                    processSymmetric(clickEvent);
                    break;
                case TRIANGLE:
                    processTriangle(clickEvent);
                    break;
            }
        });
    }

    private void clearPoints() {
        clickCount = 0;
        points.clear();
    }
}
