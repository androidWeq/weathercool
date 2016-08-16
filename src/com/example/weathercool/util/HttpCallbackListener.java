package com.example.weathercool.util;

public interface HttpCallbackListener {
	
	void onFinish(String response);
	void onError(Exception e);

}
