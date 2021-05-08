package dip.good;

public class Mp4Player implements IMusicPlayer{
    @Override
    public void play() {
        System.out.println("Music plays on mp4 player");
    }

    @Override
    public void pause() {
        System.out.println("Music stops on mp4 player");
    }
}
