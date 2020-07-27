package comp1110.lab8;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PixelComplete extends Rectangle {
    private Color color = null;
    private StateComplete state;

    // Complete the Pixel constructor so that the rectangle has sides 'size' and
    // state 'pixel_state'. Set the color based on the 'pixel_state'.
    // Make the rectangle fill color the same as 'color'. (Hint, try looking at
    // the documentation for the methods of the super class 'Rectangle' which
    // relate to fill).
    public PixelComplete(int size, StateComplete pixel_state) {
        super(size,size);
        this.state = pixel_state;
        this.color = StateComplete.colorFromState(pixel_state);
        super.setFill(this.color);
    }

    // Complete this method, which sets the Pixel's state to INACTIVE, and
    // updates the Pixel's color and fill colour to WHITE
    public void deactivate() {
        this.state = StateComplete.INACTIVE;
        this.color = StateComplete.colorFromState(this.state);
        super.setFill(this.color);
    }

    // Complete this method, which sets the Pixel's state to ACTIVE, and
    // updates the Pixel's color and fill colour to BLACK
    public void activate() {
        this.state = StateComplete.ACTIVE;
        this.color = StateComplete.colorFromState(this.state);
        super.setFill(this.color);
    }

    // Return a boolean which states whether the Pixel is active (i.e. has state ACTIVE).
    public boolean is_active() {
        return state == StateComplete.ACTIVE;
    }

    public StateComplete getState(){
        return this.state;
    }

}