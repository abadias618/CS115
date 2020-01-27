public class FourInARow {
    public FourInARow(){
    }
    public void verticalBoard(String playerv, String playerh, String player){
        String[] va1 = {"n", "n", "n", "n", "n", "n"};
        String[] va2 = {"n", "n", "n", "n", "n", "n"};
        String[] va3 = {"n", "n", "n", "n", "n", "n"};
        String[] va4 = {"n", "n", "n", "n", "n", "n"};
        String[] va5 = {"n", "n", "n", "n", "n", "n"};
        String[] va6 = {"n", "n", "n", "n", "n", "n"};
        String[] va7 = {"n", "n", "n", "n", "n", "n"};
        String sig = "";
        if (player == "1") {
            sig = "x";
        }
        else if (player == "2") {
            sig = "o";
        }
        if (playerh == "1") {
            int rs = Integer.parseInt(playerv);
            va1[rs - 1] = sig;
        }
        else if (playerh == "2") {
            int rs = Integer.parseInt(playerv);
            va2[rs - 1] = sig;
        }
        else if (playerh == "3") {
            int rs = Integer.parseInt(playerv);
            va3[rs - 1] = sig;
        }
        else if (playerh == "4") {
            int rs = Integer.parseInt(playerv);
            va4[rs - 1] = sig;
        }
        else if (playerh == "5") {
            int rs = Integer.parseInt(playerv);
            va5[rs - 1] = sig;
        }
        else if (playerh == "6") {
            int rs = Integer.parseInt(playerv);
            va6[rs - 1] = sig;
        }
        else if (playerh == "7") {
            int rs = Integer.parseInt(playerv);
            va7[rs - 1] = sig;
        }
    }
    public void horizontalBoard(String playerv, String playerh, String player){
        String[] ha1 = {"n", "n", "n", "n", "n", "n", "n"};
        String[] ha2 = {"n", "n", "n", "n", "n", "n", "n"};
        String[] ha3 = {"n", "n", "n", "n", "n", "n", "n"};
        String[] ha4 = {"n", "n", "n", "n", "n", "n", "n"};
        String[] ha5 = {"n", "n", "n", "n", "n", "n", "n"};
        String[] ha6 = {"n", "n", "n", "n", "n", "n", "n"};

        String sig = "";
        if (player == "1") {
            sig = "x";
        } else if (player == "2") {
            sig = "o";
        }
        if (playerv == "1") {
            int rs = Integer.parseInt(playerh);
            ha1[rs - 1] = sig;
        } else if (playerv == "2") {
            int rs = Integer.parseInt(playerh);
            ha2[rs - 1] = sig;
        } else if (playerv == "3") {
            int rs = Integer.parseInt(playerh);
            ha3[rs - 1] = sig;
        } else if (playerv == "4") {
            int rs = Integer.parseInt(playerh);
            ha4[rs - 1] = sig;
        } else if (playerv == "5") {
            int rs = Integer.parseInt(playerh);
            ha5[rs - 1] = sig;
        } else if (playerv == "6") {
            int rs = Integer.parseInt(playerh);
            ha6[rs - 1] = sig;
        }
    }

    public void diagonalRightBoard(String playerv, String playerh, String player){
        String[] dra1 = {"n", "n", "n", "n"};
        String[] dra2 = {"n", "n", "n", "n", "n"};
        String[] dra3 = {"n", "n", "n", "n", "n", "n"};
        String[] dra4 = {"n", "n", "n", "n", "n", "n"};
        String[] dra5 = {"n", "n", "n", "n", "n"};
        String[] dra6 = {"n", "n", "n", "n"};
        String sig = "";
        if (player == "1") {
            sig = "x";
        }
        else if (player == "2") {
            sig = "o";
        }
        int i;
        int j;
        int k;
        k=0;
        j=3;
        for(i=1;i<5;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dra1[k] = sig;
                j++;
                k++;
            }
        }
        k=0;
        j=2;
        for(i=1;i<6;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dra2[k] = sig;
                j++;
                k++;
            }
        }
        k=0;
        j=1;
        for(i=1;i<7;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dra3[k] = sig;
                j++;
                k++;
            }
        }
        k=0;
        j=1;
        for(i=2;i<8;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dra4[k] = sig;
                j++;
                k++;
            }
        }
        k=0;
        j=1;
        for(i=3;i<7;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dra5[k] = sig;
                j++;
                k++;
            }
        }
        k=0;
        j=1;
        for(i=4;i<7;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dra6[k] = sig;
                j++;
                k++;
            }
        }
    }
    public void diagonalLeftBoard(String playerv, String playerh, String player){
        String[] dla1 = {"n", "n", "n", "n"};
        String[] dla2 = {"n", "n", "n", "n", "n"};
        String[] dla3 = {"n", "n", "n", "n", "n", "n"};
        String[] dla4 = {"n", "n", "n", "n", "n", "n"};
        String[] dla5 = {"n", "n", "n", "n", "n"};
        String[] dla6 = {"n", "n", "n", "n"};

        String sig = "";
        if (player == "1") {
            sig = "x";
        }
        else if (player == "2") {
            sig = "o";
        }
        int i;
        int j;
        int k;
        k=0;
        j=4;
        for(i=1;i<5;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dla1[k] = sig;
                j--;
                k++;
            }
        }
        k=0;
        j=5;
        for(i=1;i<6;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dla2[k] = sig;
                j--;
                k++;
            }
        }
        k=0;
        j=6;
        for(i=1;i<7;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dla3[k] = sig;
                j--;
                k++;
            }
        }
        k=0;
        j=6;
        for(i=2;i<8;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dla4[k] = sig;
                j--;
                k++;
            }
        }
        k=0;
        j=6;
        for(i=3;i<7;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dla5[k] = sig;
                j--;
                k++;
            }
        }
        k=0;
        j=6;
        for(i=4;i<7;i++){

            String ii= Integer.toString(i);
            String jj= Integer.toString(j);

            if (playerh==ii && playerv==jj) {
                dla6[k] = sig;
                j--;
                k++;
            }
        }
    }
    public String checkWinner(String[] array){
        String ret="";
        String s = "";
        for (String u : array) {
            s = s + u;
        }
        if (s.contains("xxxx")) {
            ret="player1 wins!";
        }
        else if (s.contains("oooo")) {
            ret="player2 wins!";
        }
        else {
            ret="keep playing...";
        }
        return ret;
    }
    public String checkVertical(String[] array){
        checkWinner(va1);
        checkWinner(va2);
        checkWinner(va3);
        checkWinner(va4);
        checkWinner(va5);
        checkWinner(va6);
        checkWinner(va7);

    }
}
