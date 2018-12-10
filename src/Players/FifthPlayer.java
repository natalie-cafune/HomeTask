package Players;

import java.util.ArrayList;

public class FifthPlayer extends Player {
    final int PRICE;

    public FifthPlayer(int PRICE) {
        this.PRICE = PRICE;
    }

    public int getPRICE() {
        return PRICE;
    }

    @Override
    public void playSong(ArrayList<String> strings) {
        super.playSong(strings);
    }

    @Override
    public void playAllSongs(ArrayList<String> strings) {
        for (int i = strings.size() - 1; i >= 0 ; i --){
            System.out.println("Now playing " + strings.get(i));
        }
    }
}

