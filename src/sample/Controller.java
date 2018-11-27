package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.canvas.Canvas;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Controller {


    @FXML
    private Canvas canvas;
    @FXML
    private Button drawButton;
    @FXML
    private Button freeButton;

    @FXML
    private void handleDraw(ActionEvent event) {

        drawSquare();
    }

    @FXML
    private void handleFree(ActionEvent event) {


    }

    @FXML
    private void handleMouseDrag(MouseEvent event) {
        System.out.println("(dragging), x = " + event.getX() + ", y = " + event.getY());
    }

    @FXML
    private void handleMouseEnter(MouseEvent event) {
        System.out.println("(enter) the mouse entered the canvas");
    }

    @FXML
    private void handleMouseRelease(MouseEvent event) {
        System.out.println("(release) the mouse was released ");
    }


    private void drawSquare()
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLUE);
        gc.fillRect(10, 20, 30, 40);
    }
}
