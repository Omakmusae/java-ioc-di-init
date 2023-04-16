package step1.enums;

public enum Menu {
    Chicken("치킨", 30000),
    Pizza("피자", 50000);
    private String foodName;
    private int price;
    
    
    //생성자를 만들어줘야 Chicken과 Pizza에 foodName과 price를 주입함

    Menu(String foodName, int price) {
        this.foodName = foodName;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }
}
