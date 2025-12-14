package AdapterDesignPattern;

public class phonepe {
    Bank b;

    public phonepe() {
//        b = new YesBankAdapter();
        b = new IciciBankAdapter();
    }


    public int viewBalance() {
        return b.getBalance();
    }
}
