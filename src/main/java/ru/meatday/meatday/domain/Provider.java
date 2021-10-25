package ru.meatday.meatday.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * @author Shaporto Ilya
 * @date 25.10.2021
 */

@Data
@Entity
@Table(name = "provider")
public class Provider {

    @Id
    @Column(name = "provider_id")
    private Long id;

    @NotBlank
    @Column(name = "provider_title")
    private String title;

    @Column(name = "provider_number")
    private String number;

    @Column(name = "provider_address")
    private String address;

}
