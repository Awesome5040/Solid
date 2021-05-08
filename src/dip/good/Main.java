package dip.good;



public class Main {

    public static void main(String[] args) {
        MusicListener musicListener = new MusicListener("John", new Mp3Player());
        musicListener.listenMusic();
        musicListener.stopMusic();
        musicListener.changeDevice(new Mp4Player());
        musicListener.listenMusic();
        musicListener.stopMusic();
    }
}
