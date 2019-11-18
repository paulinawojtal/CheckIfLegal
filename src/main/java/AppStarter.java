public class AppStarter {

    public static void main(String[] args) {

        Creator creator = new Creator("board.txt");

        Printer printer = new Printer();

        printer.printBoard(creator.createBoard());
    }
}
