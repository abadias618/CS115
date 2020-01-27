import java.io.File;
import java.util.*;

public class Board {
    //6345 words contained in word-list.txt
    private ArrayList<String> words=new ArrayList<String>();

    public ArrayList<String> getWords() {
        return words;
    }

    public ArrayList<String> getNarrowedWords() {
        return narrowedWords;
    }

    public ArrayList<String> getNarrowedWordsx2() {
        return narrowedWordsx2;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getWordMaxSize() {
        return wordMaxSize;
    }

    //10 words in this List
    private ArrayList<String> narrowedWords=new ArrayList<String>();
    //the board layout
    private ArrayList<String > narrowedWordsx2=new ArrayList<String>();
    //moves
    private int attempts=0;
    //int to check if its the end
    private int correct=0;
    //maximum characters of the largest work of the list
    private int wordMaxSize;

    public int getCorrect() {
        return correct;
    }


    //the path here probably will have to be changed

    void read() throws Exception{
        File read=new File("Word-list.txt");
        Scanner readerScanner=new Scanner(read);
        while(readerScanner.hasNext()){
            String word=readerScanner.nextLine();
            words.add(word);
        }
        readerScanner.close();
    }
    //selects randomly 10 words and puts them into another list
    int selectWords(int numberOfWords){
        if(numberOfWords>0){
            Random random=new Random();
            int randNum;
            int wordCounter=0;
            while (wordCounter<numberOfWords){
                randNum=random.nextInt(6345);
                narrowedWords.add(words.get(randNum));
                wordCounter++;
            }
            System.out.println(narrowedWords.toString());
        }
        else System.out.println("You must insert a number more than 0");
        //populate narrowedWordsx2
        int size=narrowedWords.size()*2;
        for (int i = 0; i <size; i++) {
            if(i<size/2){
                narrowedWordsx2.add(narrowedWords.get(i));
            }
            else{
                i=i-(size/2);
                narrowedWordsx2.add(narrowedWords.get(i));
                i=i+(size/2);
            }

        }

        return size;

    }
    int[] calculateLayout(){
        int a=narrowedWords.size()*2;
        double b=Math.sqrt(a);
        int c=(int)b;
        int d=c;
        if((d*d)+d<a){
            d++;
        }
        if(c*d<a){
            c++;
        }
        System.out.println(c+" "+d);
        int[] layoutCalc={c,d};
        return layoutCalc;
    }
    //calculates the size of each box based upon the longest word
    int calculateCell(){
        ArrayList<Integer> maxSize=new ArrayList<Integer>();
        for (int i = 0; i <narrowedWords.size() ; i++) {
            String a=narrowedWords.get(i);
            maxSize.add(a.length());
        }
        Collections.sort(maxSize);
        wordMaxSize=maxSize.get(maxSize.size()-1);
        return maxSize.get(maxSize.size()-1);
    }
    //creates the 2 dimensional array in which the words will be
    String[][] createGrid(int[] a){
        String[][] grid=new String[a[0]][a[1]];
        return grid;
    }
    //create blank array
    //a is the empty array
    //b is the set of selected words
    //c is the maximum number of characters that the set of words contains
    String[][] populateNullGrid(String[][] a,int b,int c){
        int i=0;
        String str="";
        int counter=0;
        while(counter<c){
            str=str+"*";
            counter++;
        }
        for (int row = 0; row <a.length; row++) {
            for (int column = 0; column <a[row].length ; column++) {
                a[row][column]=str;
                i++;

                if(i==b)break;
            }
        }
        return a;
    }
    //populates the array randomly
    //b will come from the selectWords method
    String[][] populateGrid(String[][] a,int b){
        ArrayList<Integer> randomValues=new ArrayList<Integer>(b);
        Random random=new Random();
        //nextInt returns including 0 and excluding the bound
        int c;
        for (int i = 0; i <b ; i++) {
            while(true){
                c=random.nextInt(b);
                if(!randomValues.contains(c)){
                    randomValues.add(c);
                    break;
                }
            }
        }
        //add to the grid
        //rows first then column
        int i=0;
        for (int row = 0; row <a.length; row++) {
            for (int column = 0; column <a[row].length ; column++) {
                a[row][column]=narrowedWordsx2.get(randomValues.get(i));
                i++;
                if(i==b)break;
            }
        }
        return a;
    }
    static void printArray(String[][] a, int b){
        int limit;
        //loop to make the top index
        int topIndex=0;
        String mashTopIndex="";
        String spaces="";
        String topIndexLiteral;
        int counter2=0;
        while(counter2<(b-3)){
            spaces=spaces+" ";
            counter2++;
        }
        while(topIndex< a[0].length){
            topIndex++;
            topIndexLiteral="col "+Integer.toString(topIndex);
            mashTopIndex=mashTopIndex+topIndexLiteral+spaces;
        }
        //end top index
        //side Index
        int sideIndex=0;
        String sideIndexLiteral;
        String mash="";
        String str="";
        for (int row = 0; row <a.length; row++) {
            for (int column = 0; column <a[row].length ; column++) {
                //if to calculate the difference between the chars in the letter and the global
                //number of chars which is "b"
                if(a[row][column]!=null){
                    limit=b-a[row][column].length();
                    str="";
                    int counter=0;
                    while(counter<limit){
                        str=str+" ";
                        counter++;
                    }
                }

                if(a[row][column]==null){
                    break;
                }
                else if(column==0){
                    sideIndex++;
                    sideIndexLiteral="row "+Integer.toString(sideIndex);
                    mash=mash+(sideIndexLiteral+"["+a[row][column]+str+"]");
                }
                else if(column==(a[row].length-1)){
                    mash=mash+("["+a[row][column]+str+"]"+"\n");
                }
                else {
                    mash=mash+("["+a[row][column]+str+"]");
                }
            }
        }
        System.out.println("     "+mashTopIndex);
        System.out.println(mash);
    }
    //a is the empty array
    //b is the populated array
    String[][] movement(String[][] a, String[][] b,int moveA1, int moveA2, int moveB1, int moveB2){
        attempts=attempts+1;
        String[][] result=a;
        moveA1=moveA1-1;
        moveA2=moveA2-1;
        moveB1=moveB1-1;
        moveB2=moveB2-1;
        //prevents you from inserting the same coordinates
        if((moveA1==moveB1)&&(moveA2==moveB2)){
            System.out.println("Sorry you cant insert the same coordinates");
        }
        else{
            if(b[moveA1][moveA2]==b[moveB1][moveB2]){
                a[moveA1][moveA2]=b[moveA1][moveA2];
                a[moveB1][moveB2]=b[moveB1][moveB2];
                correct=correct+1;
                System.out.println("Match!");
                //when you complete the puzzle
                if(correct==narrowedWords.size()){
                    printArray(a,wordMaxSize);
                    System.out.println("Congrats! you Finished! \n It took you "+attempts+" moves.");

                }

            }
            else {
                String[][] cloned=new String[a.length][a[0].length];
                for (int row = 0; row <a.length; row++) {
                    for (int column = 0; column <a[row].length ; column++) {
                        cloned[row][column]=a[row][column];
                    }
                }

                cloned[moveA1][moveA2]=b[moveA1][moveA2];
                cloned[moveB1][moveB2]=b[moveB1][moveB2];
                System.out.println("Sorry, not a Match!");
                printArray(cloned,wordMaxSize);
            }
        }


        return result;

    }
    //validates if the moves ara inside the bounds
    boolean validateMove(String[][] a, int b,int c){
        int arrayLen=a.length-1;
        int counter=0;
        boolean result=false;
        int xLimit=a.length;
        int yLimit=a[arrayLen].length;
        for (int i = 0; i <a[arrayLen].length ; i++) {
            if (a[arrayLen][i]==null){
                counter++;
            }
        }
        int yLastLimit=a[arrayLen].length-counter;
        if(b<=xLimit&&c<=yLimit&&b!=xLimit){
            result=true;
        }
        else if(b==xLimit&&c<=yLastLimit){
            result=true;
        }
        return result;
    }

    //verifies an integer is inserted
    int intCheck(){
        boolean result=true;
        int number=0;
        Scanner scanner=new Scanner(System.in);
        do{
            try{
                number=scanner.nextInt();
                result=false;
            }
            catch (InputMismatchException ex){
                System.out.println("Please insert an Integer");
                scanner.nextLine();
            }
        }while(result);
        return number;
    }

}
