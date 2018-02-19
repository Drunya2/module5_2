package Module5_2;

public class Main {
    public static void main(String[] args) {


        Pleer1 pleer1 = new Pleer1("Song 1", 100);
        Pleer2 pleer2 = new Pleer2("Song 2", 200);
        Pleer3 pleer3 = new Pleer3(new String[]{ "The best song", "Good song", "Super Song"}, 300);
        Pleer4 pleer4 = new Pleer4(new String[]{ "The best song", "Good song", "Super Song"}, 400);
        Pleer5 pleer5 = new Pleer5(new String[]{ "The best song", "Good song", "Super Song"}, 500);
        Pleer6 pleer6 = new Pleer6(new String[]{ "The best song", "Good song", "Super Song"}, 600);



        PlaySong pleer = new PlaySong("Song 1", 100);
        int a = pleer.getPrice();

        pleer1.playSong();
        pleer2.playSong();
        pleer3.playSong();
        pleer3.playAllsong();
        pleer4.playSong();
        pleer5.playAllsong();
        pleer6.shuffle();


    }
}