package com.example.dipto.android_mvp_v2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    @BindView(R.id.textViewIp)
    TextView textViewIp;
    @BindView(R.id.textViewCountry)
    TextView textViewCountry;
    @BindView(R.id.textViewLocation)
    TextView textViewLocation;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public void showIpInfo(IPResponse ipResponse) {

    }

    @Override
    public void startLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public Context getAppContext() {
        return getApplicationContext();
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
    }
}
