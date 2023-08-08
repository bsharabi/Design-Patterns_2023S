package L03.Java_Fac;


public class ATMFacade extends ATMAction {


    public ATMFacade() {}

    public boolean WithDrawMoney() {
        ValidateCard();
        ValidatePincode();
        ValidateAccount();
        ValidateBalance();
        GiveClientHisMoney();
        return true;
    }

}
