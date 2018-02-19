package Module5_2;

public class PlaySong {

    String songName;
    final  int price;



    public PlaySong(String songName, int price) {
        this.songName = songName;
        this.price = price;

    }
    public void playSong() {
        System.out.println("Playing: " + songName);

    }

    public int getPrice(){
        return price;
    }


}
