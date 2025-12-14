package AdapterDesignPattern;

import AdapterDesignPattern.ThirdParty.ICICIBank;
import AdapterDesignPattern.ThirdParty.YesBank;

public class IciciBankAdapter implements Bank{
    ICICIBank iciciBank;

    IciciBankAdapter() {
        this.iciciBank = new ICICIBank();
    }

    @Override
    public int getBalance() {
        return iciciBank.BalanceEnquiry();
    }
}
