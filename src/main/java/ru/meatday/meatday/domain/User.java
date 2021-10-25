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
@Table(name = "data_users")
public class User {

    @Id
    @Column(name = "user_id")
    private Long id;

    @NotBlank
    @Column(name = "user_name")
    private String name;

    @NotBlank
    @Column(name = "phone_number")
    private String phoneNumber;
}
