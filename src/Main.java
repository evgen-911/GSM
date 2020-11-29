public class Main {
    public static void main(String[] args) {
      int replenishmentAmount = 1500 ;
              int currentAccount = 200;
              int bonusRuble = replenishmentAmount / 100;
      int totalAccount;
      if(replenishmentAmount > 1000)
      { totalAccount = currentAccount + replenishmentAmount + bonusRuble;
      } else {
          totalAccount = replenishmentAmount + currentAccount;
      }
      System.out.println(totalAccount);
    }
}
