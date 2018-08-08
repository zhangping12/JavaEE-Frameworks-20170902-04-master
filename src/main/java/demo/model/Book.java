package demo.model;

import java.io.Serializable;

public class Book implements Serializable {
    private Long id;
    private String title;
    private double price;
    private int amount;
    private String pubTime;
    private int userId;
    private User user;

    public Book() {
    }

    public Book(Long id, String title, double price, int amount, String pubTime, int userId) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.amount = amount;
        this.pubTime = pubTime;
        this.userId = userId;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", pubTime='" + pubTime + '\'' +
                ", userId=" + userId +
                '}';
    }
}
