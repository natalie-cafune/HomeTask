package Players;

import java.util.ArrayList;

public class ThirdPlayer extends Player {
    final int PRICE;


    public ThirdPlayer(int PRICE) {
        this.PRICE = PRICE;
    }

    public int getPrice() {
        return PRICE;
    }

    @Override
    public void playSong(ArrayList <String> strings) {
        super.playSong(strings);
    }

    @Override
    public void playAllSongs(ArrayList <String> strings) {
        super.playAllSongs(strings);
    }
}
