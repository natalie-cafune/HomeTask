package Players;

public class SecondPlayer extends Player {

    final int PRICE;

    public SecondPlayer(int PRICE) {
        this.PRICE = PRICE;
    }
    public int getPrice() {
        return PRICE;
    }

    @Override
    public void playSong() {
        System.out.println("Error");
    }
}
