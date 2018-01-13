package com.example.dipto.android_mvp_v2;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Dipto on 1/13/2018.
 */

public class MainActivityInteractorImp implements MainActivityInteractor{

    RetrofitInterface retrofitInterface ;

    @Override
    public void getIpResponse(final OnRequestListener onRequestListener) {

        retrofitInterface = RetrofitClient.getRetrofitClient().create(RetrofitInterface.class) ;

        Call<IPResponse> call = retrofitInterface.getIPDetails() ;

        call.enqueue(new Callback<IPResponse>() {
            @Override
            public void onResponse(Call<IPResponse> call, Response<IPResponse> response) {
                if(response.isSuccessful()){
                    Log.d("+++onResponse+++", "yes") ;
                }
                else{

                }
            }

            @Override
            public void onFailure(Call<IPResponse> call, Throwable t) {

            }
        });
    }
}
