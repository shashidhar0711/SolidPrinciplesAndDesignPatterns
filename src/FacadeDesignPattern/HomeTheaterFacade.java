package FacadeDesignPattern;

public class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private Speaker speaker;

    public HomeTheaterFacade() {
        this.tv = new TV();
        this.dvdPlayer = new DVDPlayer();
        this.speaker = new Speaker();
    }

    public void watchMovie(){
        System.out.println("Setting up home theater....");
        tv.On();
        dvdPlayer.On();
        speaker.On();
        System.out.println("Movie Started..Enjoy!");
    }
}
