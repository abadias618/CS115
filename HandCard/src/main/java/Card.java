import java.awt.*;

public class Card extends PCard {
    //black clubs unicode \u2663 white \u2667
    //black heart unicode \u2665 white \u2661
    //black diamond unicode \u2666 white \u2662
    //black spade unicode \u2660 white \u2664
    boolean hidden=false;
    String numeric;
    String literal;
    String symbol;

    Card(int number,String type){
        if(number==1)numeric="A";
        else if(number==2)numeric="2";
        else if(number==3)numeric="3";
        else if(number==4)numeric="4";
        else if(number==5)numeric="5";
        else if(number==6)numeric="6";
        else if(number==7)numeric="7";
        else if(number==8)numeric="8";
        else if(number==9)numeric="9";
        else if(number==10)numeric="10";
        else if(number==11)numeric="J";
        else if(number==12)numeric="N";
        else if(number==13)numeric="Q";
        else if(number==14)numeric="K";
        //
        if (type=="club")literal="\u2663";
        else if (type=="spade")literal="\u2660";
        else if (type=="heart")literal="\u2661";
        else if (type=="diamond")literal="\u2662";
        symbol=numeric+""+literal;
    }

    @Override
    public String getText() {
        return symbol;
    }

    @Override
    public String toString(){
        if(numeric=="J"){
            numeric="10";
        }
        else if(numeric=="N"){
            numeric="10";
        }
        else if(numeric=="Q"){
            numeric="10";
        }
        else if(numeric=="A"){
            numeric="1";

        }
        else if(numeric=="K"){
            numeric="10";
        }

        return (numeric);
    }

    @Override
    public void showCard() {
        hidden=false;
    }

    @Override
    public void hideCard() {
        hidden=true;
    }

    @Override
    public boolean isHidden() {
        return hidden;

    }

    @Override
    public Color getFontColor() {
        return Color.RED;
    }

    @Override
    public Color getFaceColor() {
        return Color.YELLOW;
    }

    @Override
    public Color getBackColor() {
        return Color.YELLOW;
    }

    @Override
    public Color getBorderColor() {
        return Color.BLACK;
    }

    @Override
    public Color getStripeColor() {
        return Color.CYAN;
    }
}
