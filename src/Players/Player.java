package Players;

import java.util.ArrayList;

public class Player {
    private String song = "My song";

    public void playSong() {
        System.out.println("Playing : " + this.song);
    }

    public void playSong(ArrayList<String> strings){
        System.out.println("Playing " + strings.get(0));

    }

    public void playAllSongs(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("Now playing : " + strings.get(i));
        }
    }
}