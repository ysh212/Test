package com.example.user.myapplication.domain;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.widget.Toast;

import com.example.user.myapplication.ListItemActivity;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/** by Hong Ji Hoon aka Hongvyo on github,
 *  Kim Eun Hye,
 *  Kim Min Ji,
 *  Kwon Soon Jo,
 *  Yu Seok Hwan
 *
 * 2017 september
 * submission to the Seoul App Competition held by the Seoul City Government.
 * copyright: MIT License
 */

public class Tourist {
    String location;
    Double lat;
    Double lon;
    String lang;
    Date requestTime;
    UUID uuid;
    //임시...나중에 지워야됨(getter & setter 둘다)
    String distance;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    /*
    public String getLocation(){
        return findAddress(lat, lon);
    }
    */

    @Override
    public String toString() {
        return "Tourist{" +
                "location='" + location + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", lang='" + lang + '\'' +
                ", requestTime=" + requestTime +
                ", uuid=" + uuid +
                ", distance='" + distance + '\'' +
                '}';
    }

}
