package comp1110.lab5;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ant extends Application {
    double midx = 150;
    double midy = 150;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group ,300, 300);
        primaryStage.setScene(scene);
        javafx.scene.shape.Circle ant = new javafx.scene.shape.Circle(midx, midy, 8);
        ant.setFill(Color.RED);
        group.getChildren().add(ant);
        primaryStage.setTitle("ANT RANDOM WALK");
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10),actionEvent -> {
            if (midx>300 || midy>300|| midx<0 || midy<0) {
                group.getChildren().clear();
                midx = 150;
                midy = 150;
                javafx.scene.shape.Circle newAnt = new javafx.scene.shape.Circle(midx, midy, 5);
                group.getChildren().add(newAnt);
            }
            midx = midx + Math.round(Math.random()*16)-8;
            midy = midy + Math.round(Math.random()*16)-8;
            javafx.scene.shape.Circle newAnt = new javafx.scene.shape.Circle(midx, midy, 5);
            group.getChildren().add(newAnt);
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        primaryStage.show();
    }

    String ans = "*";
    int numStar = 2;
    public List<Character> reverseArray(List<Character> arr){
        if (arr.size() ==1){
            return arr;}
        List<Character> reversed = new ArrayList<>();
        reversed.add(arr.get(arr.size()-1));
        reversed.addAll(reverseArray(arr.subList(0,arr.size()-1)));
        return reversed;
}
    public void trianglePrinter(int integer){
        if (integer == 1){
            System.out.println(ans);
        }
        if (integer > 1){
            String[] newlist = ans.split("\n");
            String res = "";

            for (String s : newlist) {
                res = res + "_" + s + "\n";
            }
            res = res +"*"+"_".repeat(2*numStar-3)+"*";
            numStar++;
            ans = res;
            trianglePrinter(integer-1);
        }
    }

    public static void main(String[] args) {
        Character[] x = {'a','b','c','d','e'};
        ArrayList<Character>  A = new ArrayList<>(Arrays.asList(x));
//        ArrayList<Character>  A = new ArrayList<>();
//        Collections.addAll(A, x);
        Ant ant = new Ant();
        System.out.println(ant.reverseArray(A));
        ant.trianglePrinter(15);
        launch(args);
    }
}
