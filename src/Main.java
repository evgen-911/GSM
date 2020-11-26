public class Main {
    public static void main(String[] args) {
      int replenishment_amount = 1500 ;
              int current_account = 200;
              int bonus_ruble = (int) (replenishment_amount * 0.01);
      int total_account;
      if(replenishment_amount > 1000)
      { total_account = current_account + replenishment_amount + bonus_ruble;
      } else {
          total_account = replenishment_amount + current_account;
      }
      System.out.println(total_account);
    }
}
