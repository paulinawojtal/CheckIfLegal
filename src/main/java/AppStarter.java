import boardManagement.Creator;

import java.util.Scanner;

public class AppStarter {

    public static void main(String[] args) {

        Creator creator = new Creator("board.txt");

        creator.createBoard();

        Scanner scan = new Scanner(System.in);

        Player player = new HumanPlayer("Anna");
        System.out.println("Is board legal? enter yes or no:");
        System.out.println(player.isBoardLegal(scan.nextLine()));
        
    }
}
