import coffee.order.CoffeeOrderBoard;

public class App {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("cat1");
        coffeeOrderBoard.add("cat2");
        coffeeOrderBoard.add("cat3");
        coffeeOrderBoard.add("cat4");
        coffeeOrderBoard.add("cat5");
        coffeeOrderBoard.add("cat6");
        coffeeOrderBoard.add("cat7");
        coffeeOrderBoard.add("cat8");
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver(6);
        coffeeOrderBoard.draw();
    }
}
