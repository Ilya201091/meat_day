package ru.meatday.meatday.domain;

import lombok.Data;

/**
 * @author Shaporto Ilya
 * @date 25.10.2021
 */

@Data

public abstract class Product {

    private String name;
    private Double price;
}
