package coffee.order;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeOrderBoard.class);
    private Queue<Order> orders;
    private static int id;

    public CoffeeOrderBoard() {
        orders = new LinkedList<>();
    }

    public void add(String name) {
        Order order = new Order(name);
        order.setId(++id);
        LOGGER.info("new order : {} | {}", order.getId(), order.getName());
        orders.add(order);
    }

    public void deliver() {
        Order order = orders.poll();
        if (order == null) {
            LOGGER.error("the queue is empty");
        } else {
            LOGGER.info("order delivered : {} | {}", order.getId(), order.getName());
        }
    }

    public void deliver(int id) {
        if (!orders.isEmpty()){
        Order order = orders.stream().filter(o -> o.getId() == id).findFirst().get();
        if (orders.removeIf(o -> o.getId() == id)) {
            LOGGER.info("order delivered out of order : {} | {}", order.getId(), order.getName());
        }
        } else {
            LOGGER.error("the queue is empty");
        }
    }

    public void draw() {
        System.out.println("order board :");
        orders.forEach(System.out::print);
        LOGGER.info("queue display request : \n {}", orders);
    }

    @Override
    public String toString() {
        return "CoffeeOrderBoard : " + orders;
    }
}
