public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }


    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }


    public double getCashValue() {
        return cashValue;
    }


    public int getMilesValue() {
        return milesValue;
    }
}
