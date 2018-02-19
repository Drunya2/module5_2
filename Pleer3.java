package Module5_2;

/**
 Плеер 3.
 Имеет final цену(задается в конструкторе) и геттер
 Имеет плейлист
 playSong Может проиграть первую песню
 playAllSongs может проиграть все песни
 */
import java.util.Arrays;

public class Pleer3 extends PlayAllSongs{


    public Pleer3( String[] playlist, int price) {
        super(playlist, price);;
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + playlist[0]);
    }


    public void playAllsong(){
        System.out.println("playing all songs: " + Arrays.asList(playlist));
    }

}
