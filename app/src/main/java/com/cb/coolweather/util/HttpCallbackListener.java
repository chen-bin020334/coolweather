package com.cb.coolweather.util;

/**
 * Created by cb on 18-6-29.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
