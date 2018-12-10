package Players;

import java.util.ArrayList;

public class FourthPlayer extends Player {
    final int PRICE;

    public FourthPlayer(int PRICE) {
        this.PRICE = PRICE;
    }

    public int getPrice() {
        return PRICE;
    }

    public void playSong(String[] strings) {
        System.out.println("Playing " + strings[strings.length - 1]);
    }

    @Override
    public void playAllSongs(ArrayList<String> strings) {
        super.playAllSongs(strings);
    }
}