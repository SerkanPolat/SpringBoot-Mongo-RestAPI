package org.spring.mongo.restapi.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

//MongoDb veritabaninda varliklara karsilik gelecek olan sinif
@Document
public class Kisi {
    @org.springframework.data.annotation.Id
    private String Id;
    private String Ad;
    private String Soyad;
    private HashMap Ozellikler;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public HashMap getOzellikler() {
        return Ozellikler;
    }

    public void setOzellikler(HashMap ozellikler) {
        Ozellikler = ozellikler;
    }
}
