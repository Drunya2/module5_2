package Module5_2;

/**
 Плеер 2.
 Имеет final цену(задается в конструкторе) и геттер
 Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
 playSong Пытаясь проиграть песню выдает ошибку в консоль - “error”.
 */

public class Pleer2 extends PlaySong{

    public Pleer2(String songName, int price) {
        super(songName, price);
    }

    @Override
    public void playSong(){
        System.out.println("error");
    }
}