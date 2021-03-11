package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 陈明涛 Email:cmt96@foxmail.com
 * @version V1.0
 * @Description:
 * @Date 2021/3/10 21:20
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
