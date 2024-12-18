package com.mqs.stockservice.entity;

import com.mqs.stockservice.constants.OrderStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "order_event")
public class OrderEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus status;

    private String message;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_order"))
    private Order order;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderEvent{" +
                "Id=" + Id +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", order=" + order +
                '}';
    }
}
