package com.example.dipto.android_mvp_v2;

/**
 * Created by Dipto on 1/13/2018.
 */

public interface MainActivityInteractor {

    interface OnRequestListener{

        public void onSuccess(IPResponse ipResponse) ;

        public void onFailure(String msg) ;
    }

    public void getIpResponse(OnRequestListener onRequestListener) ;
}
