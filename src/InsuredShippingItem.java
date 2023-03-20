public class InsuredShippingItem extends ShippingItem {
  private double insuredAmount;
  
  public InsuredShippingItem(double w, double insAmt) {
    super(w);
    this.insuredAmount = insAmt;
  }

  @Override
  public double getCost() {
    return insuredAmount + super.getCost();
  }
  
  public void addMoreInsurance(double amt) {
    insuredAmount += amt;
  }
}