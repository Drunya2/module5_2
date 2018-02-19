package Module5_2;

public class PlayAllSongs {

    String songName;

    String[] playlist;
    final  int price;

    public PlayAllSongs(String[] playlist, int price) {
        this.playlist =  playlist;
        this.price = price;

    }

    public void playSong() {
        System.out.println("Playing: " + songName);

    }

    public void playAllsong(){
        System.out.println(playlist);
    }
}
