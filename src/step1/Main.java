package step1;


import step1.app.Consumer;
import step1.app.OrderApplication;
import step1.enums.Menu;
import step1.order.Order;
import step1.order.OrderList;

public class Main {
    public static void main(String[] args) {
        //치킨 주문
        Consumer consumer = new OrderApplication();
        consumer.chickenOrder(Menu.Chicken,20);

        //주문 확인
        OrderList orderList = new OrderList();
        for (Order order : orderList.getOrderList()) {
            System.out.println(order.getFoodName());
            System.out.println(order.getPrice());
            System.out.println(order.getAmount());
            System.out.println();
        }
        consumer.pizzaOrder(Menu.Pizza, 2);

        // 주문 내역 확인
        orderList = new OrderList();
        for (Order order : orderList.getOrderList()) {
            System.out.println(order.getFoodName());
            System.out.println(order.getPrice());
            System.out.println(order.getAmount());
        }
    }
}
