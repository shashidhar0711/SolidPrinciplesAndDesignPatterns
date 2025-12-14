package AdapterDesignPattern;

import AdapterDesignPattern.ThirdParty.YesBank;

public class YesBankAdapter implements Bank{

    YesBank yesBank;

    YesBankAdapter() {
        this.yesBank = new YesBank();
    }
    @Override
    public int getBalance() {
        return yesBank.checkBalance();
    }
}
