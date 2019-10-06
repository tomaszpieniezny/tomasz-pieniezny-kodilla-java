package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.stream.Collectors;

@Entity
@Table(name = "TASK_FINACIALS")
public class TaskFinancialDetails {
    private int id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "PAID")
    public boolean isPaid() {
        return paid;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setPaid(boolean paid) {
        this.paid = paid;
    }
}
