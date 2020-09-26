package banks;

public abstract class Bank {
    public int a = 20;
    public int getA(){
        return a;
    }
    public abstract void giveCredit();
}

class PashaBank extends Bank{
    public int a = 30;
    @Override
    public void giveCredit() {
        setCreditInterestRate(18.67);
    }
    private void setCreditInterestRate(double interestRate){
        System.out.println("Pasha Bank gives credit with " + interestRate + " % rate");
    }
}
class KapitalBank extends Bank{
    @Override
    public void giveCredit() {
        setCreditInterestRate(21.02);
    }
    private void setCreditInterestRate(double interestRate){
        System.out.println("Kapital Bank gives credit with " + interestRate + " % rate");
    }
}
class BeynelxalqBank extends Bank{
    @Override
    public void giveCredit() {
        setCreditInterestRate(16.734);
    }
    private void setCreditInterestRate(double interestRate){
        System.out.println("Beynelxalq Bank gives credit with " + interestRate + " % rate");
    }
}
class AzerTurkBank extends Bank{

    public void giveCredit() {
        setCreditInterestRate(23.12);
    }
    private void setCreditInterestRate(double interestRate){
        System.out.println("AzerTurk Bank gives credit with " + interestRate + " % rate");
    }
}

class CreditProcessing{
    public void giveCreditFromAnyBank(Bank bank){
        bank.giveCredit();
    }
}

class Main{
    public static void main(String[] args) {
        CreditProcessing creditProcessing = new CreditProcessing();
        creditProcessing.giveCreditFromAnyBank(new AzerTurkBank());

        PashaBank bank = new PashaBank();
        System.out.println(bank.getA());
    }
}