package ru.meatday.meatday.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Shaporto Ilya
 * @date 25.10.2021
 */

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id")
    private Long id;

    @NotBlank
    @Column(name = "product_name")
    private String name;

    @Column(name = "product_price")
    private Double price;

    @Column(name = "product_in_stock")
    private Boolean inStock;

    @Column(name = "purchase_value")
    private Double purchaseValue;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    private Provider provider;
}
