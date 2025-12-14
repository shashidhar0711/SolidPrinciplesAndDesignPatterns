package FacadeDesignPatternWithSRP;

public class Speaker implements AudioSystem {

    @Override
    public void On() {
        System.out.println("Speaker ON");
    }
}
