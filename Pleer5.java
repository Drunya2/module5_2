package Module5_2;

/**
 Плеер 5.
 Имеет final цену(задается в конструкторе) и геттер
 Имеет плейлист
 playSong Может проиграть первую песню
 playAllSongs может проиграть все песни с конца плейлиста в начало
 */
import java.util.Arrays;

public class Pleer5 extends PlayAllSongs{


    public Pleer5( String[] playlist, int price) {
        super(playlist, price);;
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllsong(){

        String n1 = playlist[0];
        playlist[0] = playlist[2];
        playlist[2] = n1;

        System.out.println("All songs are playing from the end to the beginning: " + Arrays.asList(playlist));
    }
}
