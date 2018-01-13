package com.example.dipto.android_mvp_v2;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Dipto on 1/13/2018.
 */

public interface RetrofitInterface {

    @GET("json")
    Call<IPResponse> getIPDetails() ;

}
