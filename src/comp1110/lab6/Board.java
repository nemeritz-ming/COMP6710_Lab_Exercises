package comp1110.lab6;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Board extends Application {
    public Group group = new Group();
    public static ArrayList<Triangle> box = new ArrayList<>();
    public Scene scene = new Scene(group ,600, 519);

    public boolean trans = false;
    public Triangle highlighted = null;

    public static class Triangle extends Polygon{
        double x;
        double y;
        double side;
        public Triangle(double x, double y, double side){
            this.x = x;
            this.y = y;
            this.side = side;
            double halfSide = side / 2;
            double halfHeight = side * Math.sqrt(3) / 4;
            this.getPoints().addAll(0.0, -halfHeight, halfSide, halfHeight, -halfSide, halfHeight);
            this.setLayoutX(x);
            this.setLayoutY(y);

        }
        private double distance(double newx, double newy){
            return Math.sqrt((x - newx)*(x - newx) + (y - newy)*(y - newy));
        }
    }
    public void createBoard(){
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 5; j++) {
                Triangle polygon = new Triangle( 100 + j*100, 200 * Math.sqrt(3) / 4 + i*200 * Math.sqrt(3) / 2  , 196);
                if(trans){
                    polygon.setRotate(180);
                }
                if(j != 4){trans = !trans;}
                polygon.setFill(Color.LIGHTGREY);
                box.add(polygon);
                group.getChildren().add(polygon);
            }
        }
    }

    public static Triangle findNearestTriangle(double x, double y){
        int ansIdx = -1;
        double dis = 100000;
        for(int i = 0; i< box.size(); i++){
            if (box.get(i).distance(x,y) < dis){
                dis = box.get(i).distance(x,y);
                ansIdx = i;
                }
            }
        return box.get(ansIdx);
    }

    public void highlightNearestTriangle(double x, double y){
        if (highlighted == null){
            highlighted = findNearestTriangle(x, y);
            highlighted.setFill(Color.GREEN);
        }
        else {
            highlighted.setFill(Color.LIGHTGREY);
            highlighted = findNearestTriangle(x, y);
            highlighted.setFill(Color.GREEN);
        }
    }

    public static class DraggableTriangle extends Triangle{
        private final Board board;
        private double mousex;
        private double mousey;

        public DraggableTriangle(double x0, double y0, double side, Board board) {
            super(x0, y0, side);
            this.board = board;
            this.setFill(Color.RED);
            this.setOnMousePressed(event -> {
                mousex = event.getSceneX();
                mousey = event.getSceneY();
                toFront();
            });
            this.setOnMouseDragged(event ->{
                double movementX = x - mousex;
                double movementY = y - mousey;
                setLayoutX(event.getSceneX() + movementX);
                setLayoutY(event.getSceneY() + movementY);
                board.highlightNearestTriangle(event.getSceneX(), event.getSceneY());

            });
            this.setOnMouseReleased(event ->{
                if(board.highlighted.getRotate() != getRotate()){
                    if(board.highlighted.getRotate() == 180){
                        setRotate(180);
                    }
                    else{setRotate(0);}
                }
                setLayoutX(board.highlighted.x);
                setLayoutY(board.highlighted.y);
                x = board.highlighted.x;
                y = board.highlighted.y;
            });
        }
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Drawing a triangle");
        primaryStage.setScene(scene);
        createBoard();
        DraggableTriangle DraggableTriangle = new DraggableTriangle(300, 260, 200, this);
        group.getChildren().add(DraggableTriangle);
        primaryStage.show();
    }
}

