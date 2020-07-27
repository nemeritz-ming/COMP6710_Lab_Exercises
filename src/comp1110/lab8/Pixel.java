package comp1110.lab8;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Represents a 'pixel' in the fractal i.e. a square element of a given size
 * to be displayed on the screen.
 */
public class Pixel extends Rectangle {
    private Color color = null;
    private State state;

    /*
     * Create a new square Pixel with side length 'size' and state
     * 'pixelState'. Set the color based on the 'pixelState'.
     * Make the rectangle fill color the same as 'color'.
     * (Hint, try looking at the documentation for the methods of the super
     * class 'Rectangle' which relate to fill).
     */
    public Pixel(int size, State pixelState) {
        // TODO 2 Fix me
    }

    /*
     * Set the Pixel's state to INACTIVE, and update the Pixel's color to WHITE
     */
    public void deactivate() {
        // TODO 3 Fix me
    }

    /*
     * Set the Pixel's state to ACTIVE, and update the Pixel's color to BLACK
     */
    public void activate() {
        // TODO 4 Fix me
    }

    /*
     * @return true if the Pixel is active (i.e. has state ACTIVE)
     */
    public boolean isActive() {
        // TODO 5 Fix me
        return false;
    }

    public State getState() {
        return this.state;
    }

}