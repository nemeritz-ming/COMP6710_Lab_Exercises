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

public class Fractals extends Application {
    private StackPane root = new StackPane();
    private GridPane pixelMap;
    private static final int PIXEL_SIZE = 3;
    private static final int X_PIXELS = 300;
    private static final int Y_PIXELS = 300;
    private static final int LOOP_FRAME_LENGTH = 3000;
    private Pixel[][] mapping = new Pixel[X_PIXELS][Y_PIXELS];
    private static final Mapping MAPPING_1, MAPPING_2, MAPPING_3;
    private Timeline animation;

    static { //Mappings 1 -> 3 create the sierpinski triangle
        MAPPING_1 = new Mapping(0.5, 0.0, 0.0, 0.5, 0.0, 0.0);
        MAPPING_2 = new Mapping(0.5, 0.0, 0.0, 0.5, 0.0, X_PIXELS / 2.0);
        MAPPING_3 = new Mapping(0.5, 0.0, 0.0, 0.5, X_PIXELS / 2.0, X_PIXELS / 4.0);
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

        establishGrid();

        initialiseMappings();

        // Initialize our state holder array for the animation loop, default to INACTIVE
        State[][] stateOut = new State[X_PIXELS][Y_PIXELS];
        for (int x = 0; x < X_PIXELS; x++) {
            for (int y = 0; y < Y_PIXELS; y++) {
                stateOut[x][y] = State.INACTIVE;
            }
        }

        // Create an animation which makes one application of the fractal transformation
        // each frame.
        animation = new Timeline(new KeyFrame(Duration.millis(LOOP_FRAME_LENGTH),
                ae -> {

                    // Reset the stateOut array to INACTIVE - unless a point is mapped to in an iteration,
                    // it should be inactive.
                    for (int x = 0; x < X_PIXELS; x++) {
                        for (int y = 0; y < Y_PIXELS; y++) {
                            stateOut[x][y] = State.INACTIVE;
                        }
                    }

                    // TODO 6 MISSING CODE SECTION
                    /*
                     * Insert a section of code here which:
                     *  - loops through all the positions of the grid and for each position in 'mapping':
                     *  - if it is active (use 'isActive()') then:
                     *  - apply each of the maps (MAPPING_1 to MAPPING_3) for it (use 'applyMap()') and store
                     *    the resulting points to variables and,
                     *  - for each of the above resulting points (stored in variables), if it is within
                     *    the bounds (use 'withinBounds(x,y)'), then set this position (x,y) in 'stateOut'
                     *    to ACTIVE.
                     */

                    /*
                     * Afterwards, we apply this new state mapping over our existing 'mapping'
                     */
                    for (int x = 0; x < X_PIXELS; x++) {
                        for (int y = 0; y < Y_PIXELS; y++) {
                            State s = stateOut[x][y];
                            if (s == State.ACTIVE) {
                                mapping[x][y].activate();
                            } else {
                                mapping[x][y].deactivate();

                            }
                        }
                    }
                }));

        // Begin this animation
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
    }

    /*
     * Create the pixelMap GridPane with X_PIXELS number of columns
     * and Y_PIXELS number of rows.
     */
    private void establishGrid() {
        pixelMap = new GridPane();
        for (int i = 0; i < Y_PIXELS; i++) {
            RowConstraints row = new RowConstraints(PIXEL_SIZE);
            pixelMap.getRowConstraints().add(row);
        }
        for (int i = 0; i < X_PIXELS; i++) {
            ColumnConstraints row = new ColumnConstraints(PIXEL_SIZE);
            pixelMap.getColumnConstraints().add(row);
        }
        root.getChildren().add(pixelMap);
    }

    /*
     * Create pixels at each position on the grid and add these pixels to 'mapping'.
     */
    private void initialiseMappings() {
        for (int x = 0; x < X_PIXELS; x++) {
            for (int y = 0; y < Y_PIXELS; y++) {
                Pixel p = new Pixel(PIXEL_SIZE, State.ACTIVE);
                mapping[x][y] = p;
                pixelMap.add(p, x, y);
            }
        }
    }

    private boolean withinBounds(int x, int y) {
        return (x >= 0 && x < X_PIXELS && y >= 0 && y < Y_PIXELS);
    }

}
