package MoveManagement;

import java.util.List;

public class KingMove extends DefaultMove{

    public KingMove() {
    }

    @Override
    public List<int[]> initializeDefaultMoves(int r, int c) {
        List<int[]> moveList = super.initializeDefaultMoves(r, c);
        moveList.add(new int[]{r-1,c});
        moveList.add(new int[]{r+1,c});
        moveList.add(new int[]{r,c+1});
        moveList.add(new int[]{r,c-1});
        moveList.add(new int[]{r-1,c-1});
        moveList.add(new int[]{r+1,c-1});
        moveList.add(new int[]{r-1,c+1});
        moveList.add(new int[]{r-1,c+1});

        return moveList;
    }
}
