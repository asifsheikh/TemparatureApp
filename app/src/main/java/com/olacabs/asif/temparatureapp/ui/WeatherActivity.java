package com.olacabs.asif.temparatureapp.ui;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.olacabs.asif.temparatureapp.R;
import static com.google.common.base.Preconditions.checkNotNull;
import com.olacabs.asif.temparatureapp.ui.WeatherActivtyContract.Presenter;

public class WeatherActivity extends AppCompatActivity implements WeatherActivtyContract.View, View.OnClickListener {
  private WeatherActivtyContract.Presenter mPresenter;
  private ProgressDialog dialog;
  private Button mgetTemperatureButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mgetTemperatureButton = findViewById(R.id.button);
    mgetTemperatureButton.setOnClickListener(this);
    new WeatherPresenter(this);
  }


  @Override
  protected void onResume() {
    super.onResume();
  }

  @Override
  protected void onPause() {
    super.onPause();
  }


  @Override
  public void onClick(View v) {
    mPresenter.getCurrentTemperature();
  }

  @Override
  public void setPresenter(Presenter presenter) {
      mPresenter = checkNotNull(presenter);
  }

  @Override
  public void showProgressDialog() {

  }

  @Override
  public void hideProgressDialog() {

  }

  @Override
  public void showCurrentLatLng(String lat, String lng) {

  }

  @Override
  public void showCurrentTemperature(int temperature) {

  }
}
