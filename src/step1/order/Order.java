package step1.order;

public class Order {

    private String foodName;
    private int price;
    private int amount;

    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public Order(String foodName, int price, int amount) {
        this.foodName = foodName;
        this.price = price;
        this.amount = amount;
    }
}
