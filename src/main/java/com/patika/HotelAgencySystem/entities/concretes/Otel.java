package com.patika.HotelAgencySystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "otel")
public class Otel {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private String name;
    private String address;
    private String mail;
    private String phone;
    private int star;


}
