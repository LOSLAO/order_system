package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

// 通过这个 Order 来表示一个完整的订单.
// 包括订单中都有哪些菜
// Order 类对应到两张表: order_user + order_dish

public class Order {
    private int orderId;
    private int userId;
    private Timestamp time;
    private int idDone;
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private List<Dish> dishes; //一个订单包含了很多菜

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public int getIdDone() {
        return idDone;
    }

    public void setIdDone(int idDone) {
        this.idDone = idDone;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
