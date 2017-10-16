package com.example.user.myapplication.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by USER on 2017-10-16.
 */

//ListView 아이템을 위한 Layout 리소스(listview_item.xml)에 정의될 데이터
public class ListItem {
    //위치
    String location;
    //거리
    String distance;
    //신고시간
    Date requestTime;
    //관광객의 사용가능한 언어 - 1개이상
    List<String> lang;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public List<String> getLang() {
        return lang;
    }

    public void setLang(List<String> lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "location='" + location + '\'' +
                ", distance='" + distance + '\'' +
                ", requestTime=" + requestTime +
                ", lang=" + lang +
                '}';
    }
}
