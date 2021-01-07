package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DELL on 2021/1/7.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private int citId;

    public int getId(){
        return id;
    }
    public String getCountyName(){
        return countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public int getCitId(){
        return citId;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    public void setCitId(int citId){
        this.citId = citId;
    }

}
