package comp1110.lab8;

import javafx.scene.paint.Color;

public enum StateComplete {
    ACTIVE, INACTIVE;

    // Complete the method colorFromState which given a State s returns
    // the 'alive' color if the state is ACTIVE and the 'dead' colour if
    // the state is INACTIVE.
    static Color colorFromState(StateComplete s) {
        if (s == ACTIVE){
            return Color.BLACK;
        }
        else{
            return Color.WHITE;
        }
    }
}
