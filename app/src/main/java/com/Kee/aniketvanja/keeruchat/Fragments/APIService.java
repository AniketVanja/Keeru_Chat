package com.Kee.aniketvanja.keeruchat.Fragments;

import com.Kee.aniketvanja.keeruchat.Notifications.MyResponse;
import com.Kee.aniketvanja.keeruchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAc983t7o:APA91bEZLeLpbDANG3Ipds36X8SYlgB9swrIrKxpZd4T9Nq2mJg35X_a4PqPb2VB2CWSaj6r_1RlqT_oP6JRpnYFQ7SwfYnyf8bl3Q8XvmI2VegdFMRB0OmTfXmw95vyckt6hOdaMWt7"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

