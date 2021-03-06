package com.patika.HotelAgencySystem.business.concretes;

import com.patika.HotelAgencySystem.business.abstracts.OtelService;
import com.patika.HotelAgencySystem.core.Helper.Helper;
import com.patika.HotelAgencySystem.dataAccess.abstracts.OtelDao;
import com.patika.HotelAgencySystem.entities.concretes.Otel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtelManager implements OtelService {

    @Autowired
    private OtelDao otelDao;
    public OtelManager(OtelDao otelDao){
        this.otelDao = otelDao;
    }

    @Override
    public boolean add(Otel otel) {
        var result = this.otelDao.findAllByName(otel.getName());
        if (result == null){
            this.otelDao.save(otel);
            return true;
        }else {

            return false;
        }
    }

    @Override
    public List<Otel> getAll() {
        var otelList = this.otelDao.findAll();
        return otelList;
    }
}
