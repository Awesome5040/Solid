package dip.bad;

public class MusicListener {

    public MusicListener(final String name, final Mp3Player mp3Player) {
        this.name = name;
        this.mp3Player = mp3Player;
    }

    private String name;
    private Mp3Player mp3Player;

    public void listenMusic() {
        mp3Player.play();
        System.out.println(name + " is listening to music");
    }

}
