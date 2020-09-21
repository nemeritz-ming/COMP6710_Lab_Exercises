package comp1110.lab6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Board extends Application {
//    public void start(Stage primaryStage) {
//        Group group = new Group();
//        Scene scene = new Scene(group ,600 , 519);
//        primaryStage.setTitle("Drawing a triangle");
//        primaryStage.setScene(scene);
//        Polygon polygon = new Polygon();
//        polygon.getPoints().addAll(0.0, -86.6, 100.0, 86.6, -100.0, 86.6);
//        polygon.setLayoutX(150);
//        polygon.setLayoutY(150);
//        polygon.setFill(Color.LIGHTGREY);
//        group.getChildren().add(polygon);
//        primaryStage.show();
//    }
    public static class Triangle extends Polygon{
        double x;
        double y;
        double side;
        public Triangle(double x, double y, double side){
            this.x = x;
            this.y = y;
            this.side = side;
        }
    }
//    public void start(Stage primaryStage){
//        Group group = new Group();
//        Scene scene = new Scene(group ,600, 519);
//        primaryStage.setTitle("Drawing a triangle");
//        primaryStage.setScene(scene);
//        Triangle polygon = new Triangle(300, 259.5, 200);
//        double halfSide = polygon.side/2;
//        double halfHeight = polygon.side * Math.sqrt(3)/4;
//        polygon.getPoints().addAll(0.0, -halfHeight, halfSide, halfHeight, -halfSide, halfHeight);
//        polygon.setLayoutX(polygon.x);
//        polygon.setLayoutY(polygon.y);
//        polygon.setFill(Color.LIGHTGREY);
//        group.getChildren().add(polygon);
//        primaryStage.show();
//    }

    public void start(Stage primaryStage){
        Group group = new Group();
        Scene scene = new Scene(group ,600, 519);
        primaryStage.setTitle("Drawing a triangle");
        primaryStage.setScene(scene);
        boolean trans = false;
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 5; j++) {
                Triangle polygon = new Triangle(300, 259.5, 196);
                double halfSide = polygon.side / 2;
                double halfHeight = polygon.side * Math.sqrt(3) / 4;
                polygon.getPoints().addAll(0.0, -halfHeight, halfSide, halfHeight, -halfSide, halfHeight);
                if(trans){
                    polygon.setRotate(180);
                }
                if(j != 4){trans = !trans;}
                polygon.setLayoutX(100 + j*100);
                polygon.setLayoutY(200 * Math.sqrt(3) / 4 + i*200 * Math.sqrt(3) / 2 );
                polygon.setFill(Color.LIGHTGREY);
                group.getChildren().add(polygon);
            }
        }
        primaryStage.show();
    }
}

