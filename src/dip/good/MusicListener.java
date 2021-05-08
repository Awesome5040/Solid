package dip.good;

public class MusicListener {

    public MusicListener(final String name, final IMusicPlayer musicPlayer) {
        this.name = name;
        this.musicPlayer = musicPlayer;
    }

    private String name;
    private IMusicPlayer musicPlayer;

    public void listenMusic() {
        musicPlayer.play();
        System.out.println(name + " is listening to music");
    }

    public void stopMusic() {
        musicPlayer.pause();
        System.out.println(name + " paused the music");
    }

    public void changeDevice(final IMusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        System.out.println("Device was changed");
    }

}
