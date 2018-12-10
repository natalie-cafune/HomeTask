package Players;

import java.util.ArrayList;
import java.util.Random;

public class SixthPlayer extends Player {
    final int PRICE;

    public SixthPlayer(int PRICE) {
        this.PRICE = PRICE;
    }

    @Override
    public void playSong(ArrayList<String> strings) {
        super.playSong(strings);
    }

    @Override
    public void playAllSongs(ArrayList<String> strings) {
        super.playAllSongs(strings);
    }

    public int getPRICE() {
        return PRICE;
    }

    public void shuffle(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            int a = new Random().nextInt(strings.size());
            System.out.println("Playing " + strings.get(a) + "...");
        }
    }
}

