package com.example.dipto.android_mvp_v2;

import android.content.Context;

/**
 * Created by Dipto on 1/13/2018.
 */

public interface MainActivityView {

    public void showIpInfo(IPResponse ipResponse) ;

    public void startLoading() ;

    public void stopLoading() ;

    public void showMessage(String msg) ;

    Context getAppContext() ;
}
