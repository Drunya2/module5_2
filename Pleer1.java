package Module5_2;

/**
 Плеер 1.
 Имеет final цену(задается в конструкторе) и геттер
 Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
 playSong Может проиграть песню.
 */

public class Pleer1 extends PlaySong {


    public Pleer1(String songName, int price) {
        super(songName, price);

    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + songName);
    }
}
