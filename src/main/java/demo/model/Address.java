package demo.model;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer id;
    private String detail;
    private int userId;

    private User user;

    public Address() {
    }

    public Address(Integer id, String detail, int userId) {
        this.id = id;
        this.detail = detail;
        this.userId = userId;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
        return "Address{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", userId=" + userId +
                '}';
    }
}
