package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 陈明涛 Email:cmt96@foxmail.com
 * @version V1.0
 * @Description:
 * @Date 2021/3/10 21:18
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
