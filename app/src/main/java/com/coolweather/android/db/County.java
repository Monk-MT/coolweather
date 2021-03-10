package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author 陈明涛 Email:cmt96@foxmail.com
 * @version V1.0
 * @Description: 县表
 * @Date 2021/3/10 16:35
 */
public class County extends LitePalSupport {
    private int id;
    private String countyName; // 县名
    private String weatherId; // 县的天气代号
    private int cityId; // 所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
