package comp1110.lab8;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackVisualizer extends Application {

    Stack<String> stack = new ArrayStack<>();
    int currentValue = 0;

    String result = null;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Stack Visualizer");

        BorderPane border = new BorderPane();
        border.setPadding(new Insets(20));
        Scene scene = new Scene(border, 1024, 768);
        stage.setScene(scene);

        HBox top = new HBox();
        top.setAlignment(Pos.CENTER);
        Text errorText = new Text();
        errorText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));
        errorText.setFill(Color.RED);
        errorText.setText("");
        top.getChildren().add(errorText);
        border.setTop(top);

        VBox left = new VBox();
        left.setAlignment(Pos.CENTER);
        Text currentValueLabel = new Text();
        currentValueLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));
        currentValueLabel.setText("Input value: ");
        left.getChildren().add(currentValueLabel);
        Text currentValueText = new Text();
        currentValueText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 32));
        currentValueText.setText(String.valueOf(currentValue));
        left.getChildren().add(currentValueText);
        border.setLeft(left);

        VBox right = new VBox();
        right.setAlignment(Pos.CENTER);
        Text resultLabel = new Text();
        resultLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));
        resultLabel.setText("Result: ");
        right.getChildren().add(resultLabel);
        Text resultText = new Text();
        resultText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 32));
        resultText.setText("");
        right.getChildren().add(resultText);
        border.setRight(right);

        VBox stackAndLabel = new VBox();
        stackAndLabel.setAlignment(Pos.CENTER);
        stackAndLabel.setPadding(new Insets(20));
        Text stackLabel = new Text();
        stackLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));
        stackLabel.setText("Stack (view from top)");
        stackAndLabel.getChildren().add(stackLabel);
        StackPane stackViz = new StackPane();
        stackViz.setAlignment(Pos.CENTER);
        stackAndLabel.getChildren().add(stackViz);
        Rectangle box = new Rectangle(300, 200);
        box.setFill(Color.LIGHTGRAY);
        box.setStroke(Color.BLACK);
        stackViz.getChildren().add(box);
        Rectangle stackTop = new Rectangle(240, 160);
        stackTop.setFill(Color.WHITE);
        stackTop.setStroke(Color.BLACK);
        stackViz.getChildren().add(stackTop);
        stackTop.setVisible(false);
        Text stackTopValue = new Text();
        stackTopValue.setFont(Font.font("Tahoma", FontWeight.NORMAL, 32));
        stackTopValue.setText("");
        stackViz.getChildren().add(stackTopValue);
        border.setCenter(stackAndLabel);

        HBox controls = new HBox();
        border.setBottom(controls);
        controls.setAlignment(Pos.CENTER);

        Button pop = new Button();
        pop.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));
        pop.setText("pop");
        pop.setOnAction(e -> {
            if (stack.isEmpty()) {
                errorText.setText("Can't pop from an empty stack!");
            } else {
                errorText.setText("");
                result = stack.pop();
                resultText.setText(result);
                if (stack.isEmpty()) {
                    stackTop.setVisible(false);
                    stackTopValue.setText("");
                } else {
                    String v = "ERROR!";
                    try {
                        v = stack.peek();
                    } catch (Exception ex) {
                        errorText.setText("Exception: " + ex);
                    }
                    stackTopValue.setText(v);
                }
            }
        });

        Button push = new Button();
        push.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));
        push.setText("push");
        push.setOnAction(e -> {
            String v = String.valueOf(currentValue);
            stack.push(v);
            resultText.setText("");
            stackTop.setVisible(true);
            stackTopValue.setText(v);
            currentValueText.setText(String.valueOf(this.currentValue++));
        });

        controls.getChildren().addAll(push, pop);

        stage.show();
    }

}
