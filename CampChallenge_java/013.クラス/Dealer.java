
import java.util.ArrayList;
import java.util.Random;

public abstract class Dealer extends Human {

    public ArrayList<Integer> cards = new ArrayList<Integer>();

    public Dealer() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                cards.add(j);
            }
        }
    }

    public ArrayList<Integer> deal() {

        ArrayList<Integer> dealList = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 2; i++) {
            int index = rand.nextInt(cards.size());
            dealList.add(cards.get(index));
            cards.remove(index);
        }
        return dealList;

    }

    public ArrayList<Integer> hit() {
        ArrayList<Integer> hitList = new ArrayList<Integer>();
        Random rand = new Random();
        int index = rand.nextInt(cards.size());
        hitList.add(cards.get(index));
        cards.remove(index);

        return hitList;

    }

    @Override
    public int open() {
        int total = 0;
        for (int z = 0; z < this.myCards.size(); z++) {
            total += myCards.get(z);
        }
        return total;
    }

    @Override
    public void setCard(ArrayList<Integer> x) {
        for (Integer num : x) {
            this.myCards.add(num);
        }
    }

    @Override
    public boolean checkSum() {
        if (open() < 17) {
            return true;
        } else {
            return false;
        }
        }
    }

