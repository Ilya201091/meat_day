package ru.meatday.meatday.domain;

import lombok.Data;

import javax.persistence.*;

import java.util.List;

/**
 * @author Shaporto Ilya
 * @date 25.10.2021
 */

@Data
@Entity
@Table(name = "order_user")
public class Order {

    @Id
    @Column(name = "order_id")
    private Long id;

    @Column(name = "order_total_cost")
    private Double totalСost;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Product> groceryList;
}
