package com.example.dipto.android_mvp_v2;

/**
 * Created by Dipto on 1/13/2018.
 */

public class MainActivityPresenterImp implements MainActivityPresenter, MainActivityInteractor.OnRequestListener{

    /*
    * MainActivityView implemented in MainActivity
    * MainActivityInteractor implemented in MainActivityInteractorImp
    * Implemented places objects initiating in interfaces to call those methods
    * */

    private MainActivityView view ;
    private MainActivityInteractor interactor ;

    public MainActivityPresenterImp(MainActivityView mainActivityView, MainActivityInteractorImp interactor){
        this.view = mainActivityView ;
        this.interactor = interactor ;
    }

    @Override
    public void callGetIpResponse() {

        if(view != null){
            view.startLoading();
        }
        interactor.getIpResponse(this);
    }

    @Override
    public void onDestroy() {
        view = null ;
    }

    @Override
    public void onSuccess(IPResponse ipResponse) {
        view.stopLoading();
        view.showIpInfo(ipResponse);
    }

    @Override
    public void onFailure(String msg) {
        view.showMessage(msg);
    }
}
