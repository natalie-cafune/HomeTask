package Players;


public class FirstPlayer extends Player {

    final int PRICE;

    public FirstPlayer(int PRICE) {
        this.PRICE = PRICE;
    }

    public int getPrice() {
        return PRICE;
    }

    @Override
    public void playSong() {
        super.playSong();
    }
}
