package Players;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> playlist = new ArrayList<String>() ;
        
        playlist.add("Sweetheart");
        playlist.add("World of Mouth");
        playlist.add("Gun");
        playlist.add("Kiss");
        playlist.add("Mountain");
        playlist.add("Spring");
        playlist.add("Nice voice");
        playlist.add("We are the champions");
        playlist.add("Closer");
        playlist.add("Much too much");

        FirstPlayer firstPlayer = new FirstPlayer(10);
        System.out.println(firstPlayer.getPrice());
        firstPlayer.playSong();
        System.out.println();

        SecondPlayer secondPlayer = new SecondPlayer(12);
        secondPlayer.playSong();

        ThirdPlayer thirdPlayer = new ThirdPlayer(20);
        System.out.println(thirdPlayer.getPrice());
        System.out.println();

        System.out.println("Songs of FourthPlayer");
        FourthPlayer fourthPlayer = new FourthPlayer(50);
        fourthPlayer.playSong(playlist);
        fourthPlayer.playAllSongs(playlist);
        System.out.println();

        System.out.println("Songs of Fifth Player ");
        FifthPlayer fifthPlayer = new FifthPlayer(200);
        fifthPlayer.playAllSongs(playlist);
        System.out.println();

        System.out.println("Songs of Sixth Player ");
        SixthPlayer sixthPlayer = new SixthPlayer(150);
        sixthPlayer.shuffle(playlist);
    }
}
