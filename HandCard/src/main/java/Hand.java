import java.util.ArrayList;

public class Hand implements PHand {
    ArrayList<PCard> hand=new ArrayList<PCard>();

    public int getSize() {
        return hand.size();
    }

    public void addCard(PCard card) {
        hand.add(card);
    }

    public PCard getCard(int index) {
        PCard indexCard=hand.get(index);
        return indexCard;
    }

    public PCard removeCard(int index) {
        PCard indexCard=hand.get(index);
        hand.remove(indexCard);
        return indexCard;
    }

    public int getValue() {
        int sum=0;
        int switch1=0;
        for (int i = 0; i <hand.size() ; i++) {
            PCard card=hand.get(i);
            String x=card.toString();
            if (x.equals("1"))switch1++;
            int y=Integer.parseInt(x);
            sum+=y;
        }
        if (switch1>0&&switch1<22&&sum<22)sum+=10;
        return sum;
    }
}
