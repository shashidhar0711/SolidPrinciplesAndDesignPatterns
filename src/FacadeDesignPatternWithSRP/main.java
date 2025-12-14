package FacadeDesignPatternWithSRP;

public class main {
    static void main(String[] args) {
        // Example of Facade design pattern
        // With solid principle ie DI, OCP, SRP and tight coupling as well
        Display tv = new TV();
        AudioSystem speaker = new Speaker();
        MediaPlayer dvd = new DVDPlayer();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tv,speaker, dvd);
        homeTheaterFacade.watchMovie();
    }
}
