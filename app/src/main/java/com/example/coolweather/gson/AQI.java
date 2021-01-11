package com.example.coolweather.gson;

/**
 * Created by DELL on 2021/1/10.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }

}
