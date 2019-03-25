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
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@SuppressWarnings("unused")
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
    private MenuItem move;

    @FXML
    private Pane pane;

    private Stage stage;

    private Shape currentShape;

    private ActionType currentActionType = ActionType.NONE;

    private int vertexCount = 0;
    private int clickCount = 0;
    private List<Point> points = new ArrayList<>();

    private Color stroke = Color.BLACK;
    private Color fill = Color.BLACK;

    @FXML
    void changeBlackColor(ActionEvent event) {
        stroke = Color.BLACK;
    }

    @FXML
    void changeBlueColor(ActionEvent event) {
        stroke = Color.BLUE;
    }

    @FXML
    void changeRedColor(ActionEvent event) {
        stroke = Color.RED;
    }

    @FXML
    void changeBlackColorFill(ActionEvent event) {
        fill = Color.BLACK;
    }

    @FXML
    void changeBlueColorFill(ActionEvent event) {
        fill = Color.BLUE;
    }

    @FXML
    void changeRedColorFill(ActionEvent event) {
        fill = Color.RED;
    }

    @FXML
    void onDrawCircle(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.CIRCLE;
    }

    @FXML
    void onDrawEllipse(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.ELLIPSE;
    }

    @FXML
    void onDrawLine(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.LINE;
    }

    @FXML
    void onDrawPolygon(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.POLYGON;
        List<String> values = new ArrayList<>();
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Vertex count");
        dialog.setHeaderText("Vertex count");
        dialog.setContentText("Count: ");
        dialog.showAndWait().ifPresent(values::add);
        vertexCount = Integer.parseInt(values.get(0));
    }

    @FXML
    void onDrawRay(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.RAY;
    }

    @FXML
    void onDrawRectangle(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.RECTANGLE;
    }

    @FXML
    void onDrawRhombus(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.RHOMBUS;
    }

    @FXML
    void onDrawSegment(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.SEGMENT;
    }

    @FXML
    void onDrawSymmetric(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.SYMMETRIC_POLYGON;
        List<String> values = new ArrayList<>();
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Vertex count");
        dialog.setHeaderText("Vertex count");
        dialog.setContentText("Count: ");
        dialog.showAndWait().ifPresent(values::add);
        vertexCount = Integer.parseInt(values.get(0));
    }

    @FXML
    void onDrawTriangle(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.TRIANGLE;
    }

    @FXML
    void onMove(ActionEvent event) {
        clearPoints();
        currentActionType = ActionType.MOVE;
    }

    @FXML
    void initialize() {

    }

    private void processCircle(MouseEvent event) {
        if (clickCount == 2) {
            Point center = new Point((
                    points.get(0).x + points.get(1).x) / 2,
                    (points.get(0).y + points.get(1).y) / 2);
            Circle circle = new Circle(center, points.get(0), points.get(1), stroke, fill);
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
            Ellipse ellipse = new Ellipse(center, points.get(0), points.get(1), stroke, fill);
            ellipse.draw(pane);
            currentShape = ellipse;
            clearPoints();
        }
    }

    private void processLine(MouseEvent event) {
        if (clickCount == 2) {
            Line line = new Line(points.get(0), points.get(1), stroke);
            line.draw(pane);
            currentShape = line;
            clearPoints();
        }
    }

    private void processPolygon(MouseEvent event) {
        if (clickCount == vertexCount) {
            Polygon polygon = new Polygon(points.toArray(new Point[vertexCount]), stroke, fill);
            polygon.draw(pane);
            currentShape = polygon;
            clearPoints();
        }
    }

    private void processRay(MouseEvent event) {
        if (clickCount == 2) {
            Ray ray = new Ray(points.get(0), points.get(1), stroke);
            ray.draw(pane);
            currentShape = ray;
            clearPoints();
        }
    }

    private void processRectangle(MouseEvent event) {
        if (clickCount == 2) {
            Rectangle rectangle = new Rectangle(points.get(0), points.get(1), stroke, fill);
            rectangle.draw(pane);
            currentShape = rectangle;
            clearPoints();
        }
    }

    private void processRhombus(MouseEvent event) {
        if (clickCount == 2) {
            Rhombus rhombus = new Rhombus(points.get(0), points.get(1), stroke, fill);
            rhombus.draw(pane);
            currentShape = rhombus;
            clearPoints();
        }
    }

    private void processSegment(MouseEvent event) {
        if (clickCount == 2) {
            Segment segment = new Segment(points.get(0), points.get(1), stroke);
            segment.draw(pane);
            currentShape = segment;
            clearPoints();
        }
    }

    private void processSymmetric(MouseEvent event) {
        if (clickCount == 2) {
            SymmetricPolygon symmetric =
                    new SymmetricPolygon(SymmetricPolygon.getSymmetricPoints(
                            points.get(0), points.get(1), vertexCount), stroke, fill);
            symmetric.draw(pane);
            currentShape = symmetric;
            clearPoints();
        }
    }

    private void processTriangle(MouseEvent event) {
        if (clickCount == 3) {
            Triangle triangle =
                    new Triangle(points.get(0), points.get(1), points.get(2), stroke, fill);
            triangle.draw(pane);
            currentShape = triangle;
            clearPoints();
        }
    }

    private void processMove(MouseEvent event) {
        if (clickCount == 1) {
            if (currentShape != null) {
                currentShape.move(pane, points.get(0));
            }
            clearPoints();
        }
    }

    void setPrimaryStage(Stage stage) {
        this.stage = stage;
        pane.addEventFilter(MouseEvent.MOUSE_CLICKED, clickEvent -> {
            clickCount++;
            points.add(new Point(clickEvent.getX(), clickEvent.getY()));
            switch (currentActionType) {
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
                case MOVE:
                    processMove(clickEvent);
            }
        });
    }

    private void clearPoints() {
        clickCount = 0;
        points.clear();
    }
}
