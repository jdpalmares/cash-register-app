package interfaces;

public interface CashRegister {
   public void showCashRegState();
   public void putCRBills(String[] cashRegCmd);
   public void takeCRBills(String[] cashRegCmd);
   public void giveCRChange(String[] cashRegCmd);
}
