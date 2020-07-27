package comp1110.lab8;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FractalsComplete extends Application {
    private StackPane root = new StackPane();
    private GridPane pixel_map;
    private static final int PIXEL_SIZE = 2;
    private static final int X_PIXELS = 400;
    private static final int Y_PIXELS = 400;
    private static final int LOOP_FRAME_LENGTH = 3000;
    private PixelComplete[][] map = new PixelComplete[X_PIXELS][Y_PIXELS];
    private boolean animation_ceased = false;
    private static final Mapping MAP_1, MAP_3;
    private Timeline animation;

    static { //Maps 1 -> 3 create the sierpinski triangle
        MAP_1 = new Mapping(0.6180340, 0.0, 0, -0.6180340, 0.0, X_PIXELS);
       // MAP_2 = new Mapping(0.5, 0.0, 0.0, 0.5, 0.0, X_PIXELS / 2);
        MAP_3 = new Mapping(0, -0.7861513, 0.7861513, 0, 0.6180340 * X_PIXELS, 0);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // JavaFX setup
        primaryStage.setTitle("Fractal Visualiser!");
        primaryStage.setScene(new Scene(root, 1000, 1000));
        primaryStage.show();

        // Establishing the grid pane
        establish_grid();

        // Initialising our pixel map
        initialise_map();

        // Initialising our state holder array for the animation loop
        StateComplete[][] state_out = new StateComplete[X_PIXELS][Y_PIXELS];

        // Create an animation which makes one application of the fractal transformation
        // each frame.
        animation = new Timeline(new KeyFrame(Duration.millis(LOOP_FRAME_LENGTH/2.0),
                ae -> {

                    // Reset the state_out array to INACTIVE - unless a point is mapped to in an iteration,
                    // it should be inactive.
                    for (int x = 0; x < X_PIXELS; x++) {
                        for (int y = 0; y < Y_PIXELS; y++) {
                            state_out[x][y] = StateComplete.INACTIVE;
                        }
                    }

                    // TODO 6 MISSING CODE SECTION
                    /*
                     * Insert a section of code here which:
                     *  - loops through all the positions of the grid
                     *  - if that position in 'map' is active (use 'isActive()') then apply each of the maps
                     *    MAP_1 -> MAP_3 for this position (use 'applyMap') and store these resulting points
                     *   to variables and,
                     *  - for each of the above resulting points, if it is within the bounds (use 'within_bounds'),
                     *    then set this position in 'state_out' to ACTIVE.
                     * */

                    System.out.println("loop");
                    for (int x = 0; x < X_PIXELS; x++) {
                        for (int y = 0; y < Y_PIXELS; y++) {
                            if (map[x][y].is_active()) {
                                Point m1, m2, m3;
                                m1 = MAP_1.applyMap(x, y);
                                //m2 = MAP_2.applyMap(x, y);
                                m3 = MAP_3.applyMap(x, y);

                                if (within_bounds(m1.x, m1.y)) {
                                    state_out[m1.x][m1.y] = StateComplete.ACTIVE;
                                }
//                                if (within_bounds(m2.x, m2.y)) {
//                                    state_out[m2.x][m2.y] = StateComplete.ACTIVE;
//                                }
                                if (within_bounds(m3.x, m3.y)) {
                                    state_out[m3.x][m3.y] = StateComplete.ACTIVE;
                                }
                            }
                        }
                    }

                    /*
                     * Afterwards, we apply this new state map over our existing 'map'
                     * */
                    boolean static_check = true;
                    for (int x = 0; x < X_PIXELS; x++) {
                        for (int y = 0; y < Y_PIXELS; y++) {
                            if (!(state_out[x][y] == map[x][y].getState())){
                                if (state_out[x][y] == StateComplete.ACTIVE) {
                                    map[x][y].activate();
                                } else {
                                    map[x][y].deactivate();
                                }
                                static_check = false;
                            }
                        }
                    }
                    if (static_check){
                        animation.stop();
                    }
                }));

        // Begin primary animation
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }

    // Establishes the gridpane with X_PIXELS number of columns and
    // Y_PIXELS number of rows.
    private void establish_grid() {
        pixel_map = new GridPane();
        for (int i = 0; i < Y_PIXELS; i++) {
            RowConstraints row = new RowConstraints(PIXEL_SIZE);
            pixel_map.getRowConstraints().add(row);
        }
        for (int i = 0; i < X_PIXELS; i++) {
            ColumnConstraints row = new ColumnConstraints(PIXEL_SIZE);
            pixel_map.getColumnConstraints().add(row);
        }
        root.getChildren().add(pixel_map);
    }

    // Creates pixels at each position on the grid and adds these
    // pixels to 'map'.
    private void initialise_map() {
        for (int x = 0; x < X_PIXELS; x++) {
            for (int y = 0; y < Y_PIXELS; y++) {
                PixelComplete p = new PixelComplete(PIXEL_SIZE, StateComplete.ACTIVE);
                map[x][y] = p;
                pixel_map.add(p, x, y);
            }
        }
    }

    private boolean within_bounds(int x, int y) {
        return (x >= 0 && x < X_PIXELS && y >= 0 && y < Y_PIXELS);
    }

}
