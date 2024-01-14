//public class RewardValue {
//}

//getMilesValue()

//getCashValue()

//RewardValue must convert from miles to cash at a rate of 0.0035

//----

//-----

public class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;
    private int milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_RATE);
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public int getMilesValue() {
        return milesValue;
    }
}
