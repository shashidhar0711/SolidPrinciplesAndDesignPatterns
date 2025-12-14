package FacadeDesignPatternWithSRP;

import java.lang.foreign.AddressLayout;

public class HomeTheaterFacade {
    private Display display;
    private AudioSystem audioSystem;
    private MediaPlayer mediaPlayer;

    public HomeTheaterFacade(Display display, AudioSystem audioSystem, MediaPlayer mediaPlayer) {
        this.display = display;
        this.audioSystem = audioSystem;
        this.mediaPlayer = mediaPlayer;
    }

    public void watchMovie(){
        System.out.println("Setting up home theater....");
        display.On();
        audioSystem.On();
        mediaPlayer.On();
        System.out.println("Movie Started..Enjoy!");
    }
}
