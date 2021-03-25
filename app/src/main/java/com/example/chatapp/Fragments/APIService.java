package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                  "Content-Type:application/json",
                    "Authorization:key=AAAAs9_kAhM:APA91bHq8zcSq2MiiAYHd8Ph0J0jjMq6JZfwrIipwWBOsx65e99bNEUr1oCKdco3JECL91r1GGVBO4rc9pifZuDuti0Z9PfiSQX00Ajey6fHxWA4DJj8QiJO8cR0xpvWvH8ioaEcn8Hd"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
