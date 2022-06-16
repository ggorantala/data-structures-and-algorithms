package math;

public class BuyCandy {
  public static void main(String[] args) {
    System.out.println(buyCandy(4, 9));
  }

  // A box of candy costs price dollars. You have balance dollars. Compute the number of boxes of
  // candy you can buy and return how many more dollars you need to buy one more box of candy.
  static int buyCandy(int price, int balance) {
    int boxes = balance / price;
    int balanceNeeded = (boxes + 1) * price;
    return balanceNeeded - balance;
  }
}
