package step1.order;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private static List<Order> orderList = new ArrayList<>();

    public void setOrderList(Order order) {
        orderList.add(order);
    }

    public static List<Order> getOrderList() {
        return orderList;
    }
}
