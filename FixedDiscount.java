public class FixedDiscount implements Discountable {

    @Override
    public double applyDiscount(double price) {
        return Math.max(0, price - 50000);
    }
}
