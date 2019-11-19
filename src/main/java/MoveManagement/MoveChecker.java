package MoveManagement;

import java.util.List;

public interface MoveChecker {

    List<int[]> availableMoves();

    List<int[]> legalMoves();
}
