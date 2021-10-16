package com.patika.HotelAgencySystem.business.abstracts;

import com.patika.HotelAgencySystem.entities.concretes.Otel;

import java.util.List;

public interface OtelService {
    boolean add (Otel otel);
    List<Otel> getAll();
}
