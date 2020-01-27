import java.util.Scanner;

public class MemoryCardService {
    public static void main(String[] args) throws Exception {
        int numberSelected;
        int move1A;
        int move2A;
        int move1B;
        int move2B;
        Scanner input=new Scanner(System.in);
        Board board=new Board();
        board.read();
        System.out.println("How many words would you like in your memory game?: ");
        numberSelected=board.intCheck();
        int selectWords=board.selectWords(numberSelected);
        int[] calculateLayout=board.calculateLayout();
        int wordMaxSize=board.calculateCell();
        String[][] createGrid=board.createGrid(calculateLayout);
        String[][] createNullGrid=board.createGrid(calculateLayout);
        String[][] populateNullGrid=board.populateNullGrid(createNullGrid,selectWords,wordMaxSize);
        String[][] populateGrid=board.populateGrid(createGrid,selectWords);
        while(numberSelected!=board.getCorrect()){
            board.printArray(populateNullGrid,wordMaxSize);
            System.out.println("First move(row first!)");
            System.out.println("row:");
            move1A=board.intCheck();
            System.out.println("column:");
            move2A=board.intCheck();
            if(!board.validateMove(populateGrid,move1A,move2A)){
                System.out.println("Sorry your coordinates are out of bounds. Try again...");
                continue;
            }
            System.out.println("Second move(row first!)");
            System.out.println("row:");
            move1B=board.intCheck();
            System.out.println("column:");
            move2B=board.intCheck();
            if(!board.validateMove(populateGrid,move1B,move2B)){
                System.out.println("Sorry your coordinates are out of bounds. Try again...");
                continue;
            }
            populateNullGrid=board.movement(populateNullGrid,populateGrid,move1A,move2A,move1B,move2B);
        }
    }
}
