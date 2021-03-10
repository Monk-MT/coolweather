package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author 陈明涛 Email:cmt96@foxmail.com
 * @version V1.0
 * @Description: 网络工具类
 * @Date 2021/3/10 16:55
 */
public class HttpUtil {

    // 向服务器发送数据
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build(); //存放参数
        client.newCall(request).enqueue(callback); //消息入队，稍后发送
    }
}
