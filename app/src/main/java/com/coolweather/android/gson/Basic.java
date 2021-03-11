package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 陈明涛 Email:cmt96@foxmail.com
 * @version V1.0
 * @Description:
 * @Date 2021/3/10 21:14
 */
public class Basic {

    @SerializedName("city") // 让JSON字段和Java字段建立联系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
