import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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

    private Stage stage;

    @FXML
    void changeColor(ActionEvent event) {

    }

    @FXML
    void onDrawCircle(ActionEvent event) {

    }

    @FXML
    void onDrawEllipse(ActionEvent event) {

    }

    @FXML
    void onDrawLine(ActionEvent event) {
        final MouseClickHandler handler = new MouseClickHandler();
        stage.getScene().addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                handler.handle(event);
                if (handler.clickCount == 2) {
                    System.out.println();
                }
            }
        });
    }

    @FXML
    void onDrawPolygon(ActionEvent event) {

    }

    @FXML
    void onDrawRay(ActionEvent event) {

    }

    @FXML
    void onDrawRectangle(ActionEvent event) {

    }

    @FXML
    void onDrawRhombus(ActionEvent event) {

    }

    @FXML
    void onDrawSegment(ActionEvent event) {

    }

    @FXML
    void onDrawSquare(ActionEvent event) {

    }

    @FXML
    void onDrawSymmetric(ActionEvent event) {

    }

    @FXML
    void onDrawTriangle(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    public void setPrimaryStage(Stage stage) {
        this.stage = stage;

    }
}
