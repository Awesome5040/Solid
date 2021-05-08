package dip.good;

public class Mp3Player implements IMusicPlayer{
    @Override
    public void play() {
        System.out.println("Music plays on mp3 player");
    }

    @Override
    public void pause() {
        System.out.println("Music stops on mp3 player");
    }
}
