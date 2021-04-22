

import java.util.Scanner;

import impl.CashRegisterImpl;

public class App {
   public static void main(String[] args) {
      final Scanner scanner = new Scanner(System.in);
      CashRegisterImpl crDeploy = new CashRegisterImpl();
      System.out.println("Cash Register Ready, input a command below: ");
      String[] cashRegCmd = scanner.nextLine().split("\\s+");

      //So command will be case insensitive
      String command = cashRegCmd[0].toLowerCase();
      while(!command.equals("quit")){
          if(command.equals("show")){
              crDeploy.showCashRegState();
          } else if(command.equals("put")){
              crDeploy.putCRBills(cashRegCmd);
          } else if(command.equals("take")){
              crDeploy.takeCRBills(cashRegCmd);
          } else if(command.equals("change")){
              crDeploy.giveCRChange(cashRegCmd);
          } else if(command.equals("help")){
              System.out.println("'show' - show current state, including total and each denomination: $Total #$20 #$10 #$5 #$2 #$1");
              System.out.println();
              System.out.println("'put' - put bills in each denomination: #$20 #$10 #$5 #$2 #$1 and show current state");
              System.out.println();
              System.out.println("'take' - take bills in each denomination: #$20 #$10 #$5 #$2 #$1 and show current state");
              System.out.println();
              System.out.println("'change' - show requested change in each denomination: #$20 #$10 #$5 #$2 #$1 and remove money from cash register");
              System.out.println();
          } else {
              System.out.println("Invalid Command or structure. Please try again");
              System.out.println("To see the list of available commmands, type 'help' only.");
              System.out.println();
          }

          System.out.println("Cash Register Ready again, input a command below: ");
          cashRegCmd = scanner.nextLine().split(" ");
          command = cashRegCmd[0].toLowerCase();
      }

      System.out.println("Cash Register Terminated, Bye.");
      scanner.close();
  }
}
