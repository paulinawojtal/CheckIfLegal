package MoveManagement;

import java.util.ArrayList;
import java.util.List;

public abstract class DefaultMove {

    private List<int[]> defaultMoves;

    public DefaultMove() {
    }

    public List<int[]> initializeDefaultMoves(int r, int c){
        defaultMoves = new ArrayList<>();
        return defaultMoves;
    }

}
