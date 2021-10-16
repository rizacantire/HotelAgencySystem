package com.patika.HotelAgencySystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "otel_property")
public class OtelProperty {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "property")
    private String property;
}
