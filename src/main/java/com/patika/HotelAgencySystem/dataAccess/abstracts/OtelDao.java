package com.patika.HotelAgencySystem.dataAccess.abstracts;

import com.patika.HotelAgencySystem.entities.concretes.Otel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtelDao extends JpaRepository<Otel,Integer> {
    Otel findAllByName(String name);
}
