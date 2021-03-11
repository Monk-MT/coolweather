package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 陈明涛 Email:cmt96@foxmail.com
 * @version V1.0
 * @Description:
 * @Date 2021/3/10 21:29
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
