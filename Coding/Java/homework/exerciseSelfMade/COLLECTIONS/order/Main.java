package homework.exerciseSelfMade.COLLECTIONS.order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Order> userOrders = new ArrayList();

    }

    public static void addOrder(List<Order> list, Order order) {
        list.add(order);
    }

    public static void addItemToOrder(Order order, String item) {
        order.getItems().add(item);

    }

    public static void calculateTotalCost(List<Order> orders) {
        double totalPrice = orders.stream()
                .mapToDouble(Order::getTotalPrice)
                .sum();

        System.out.println("Total Price of all orders: " + totalPrice);
    }


}
