package com.patika.HotelAgencySystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "otel_type")
public class OtelType {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "type")
    private String type;
}
