public class HumanPlayer extends Player{

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public boolean isBoardLegal(String input) {
        if(input.toLowerCase().equals("yes")){
            return true;
        }
        return false;
    }
}
