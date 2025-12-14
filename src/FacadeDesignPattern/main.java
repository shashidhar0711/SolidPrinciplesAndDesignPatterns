package FacadeDesignPattern;

public class main {
    static void main(String[] args) {
        // Example of Facade design pattern but voilating solid principle ie DI, OCP, SRP and tight coupling as well
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie();
    }
}
