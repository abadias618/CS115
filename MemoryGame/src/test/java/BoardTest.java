import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getCorrect() {
        Board board=new Board();
        assertEquals(0,board.getCorrect());

    }

    //checks if the array has all the words f
    @Test
    void read() throws Exception {
        ArrayList<String> words=new ArrayList<String>();
        File read=new File("Word-list.txt");
        Scanner readerScanner=new Scanner(read);
        while(readerScanner.hasNext()){
            String word=readerScanner.nextLine();
            words.add(word);
        }
        readerScanner.close();
        assertEquals(6345,words.size());
    }

    @Test
    void selectWords() throws Exception{
        Board board=new Board();
        board.read();
        board.selectWords(5);
        assertEquals(5,board.getNarrowedWords().size());

    }

    @Test
    void calculateLayout() throws Exception {
        Board board=new Board();
        board.read();
        board.selectWords(5);
        int[] a={4,3};
        int[] b=board.calculateLayout();
        assertEquals(a[1],b[1]);
        assertEquals(a[2],b[2]);
    }

    @Test
    void calculateCell() throws Exception{
        Board board=new Board();
        board.read();
        board.selectWords(4);
        //shouldn't be equal beacause the lenght is random
        assertNotEquals(1,board.calculateCell());


    }

    @Test
    void createGrid() throws Exception{
        Board board=new Board();
        board.read();
        board.selectWords(2);
        String[][] a=new String[2][2];
        int[] b={2,2};
        assertArrayEquals(a,board.createGrid(b));
    }

    @Test
    void populateNullGrid() {
    }

    @Test
    void populateGrid() {
    }

    @Test
    void printArray() {
    }

    @Test
    void movement() {
    }

    @Test
    void validateMove() {
    }

    @Test
    void intCheck() {
    }
}