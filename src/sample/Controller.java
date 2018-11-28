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
import javafx.scene.shape.Rectangle;

public class Controller {


    boolean stateFreehand = false;


    @FXML
    private Canvas canvas;
    @FXML
    private Button drawButton;
    @FXML
    private Button freeButton;

    @FXML
    private void handleDraw(ActionEvent event) {
        stateFreehand = false;
        drawSquare();
    }

    @FXML
    private void handleFree(ActionEvent event) {
        stateFreehand = true;

    }

    @FXML
    private void handleMouseDrag(MouseEvent event) {
        System.out.println("(dragging), x = " + event.getX() + ", y = " + event.getY());

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLUE);
        gc.fillOval(event.getX(), event.getY(), 10, 10);

    }

    @FXML
    private void handleMouseEnter(MouseEvent event) {

        System.out.println("(enter) the mouse entered the canvas");
    }

    @FXML
    private void handleMouseRelease(MouseEvent event) {

        System.out.println("(release) the mouse was released ");
    }

    /**
     * To draw a square
     */
    private void drawSquare()
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLUE);
        gc.fillRect(10, 20, 30, 40);

        // addition
        gc.setStroke(Color.RED);
        gc.strokeLine(170,230,40,80);


        // addition
        gc.setStroke(Color.GREEN);
        gc.setLineWidth(5);
        gc.strokeOval(200,200,50,40);





    }
}
