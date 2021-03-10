package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author 陈明涛 Email:cmt96@foxmail.com
 * @version V1.0
 * @Description: 城市表
 * @Date 2021/3/10 16:35
 */
public class City extends LitePalSupport {
    private int id;
    private String cityName; // 市名
    private int cityCode; // 市代码
    private int provinceId; // 所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
