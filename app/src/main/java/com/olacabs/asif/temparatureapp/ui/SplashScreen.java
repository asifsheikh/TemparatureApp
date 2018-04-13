package com.olacabs.asif.temparatureapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.olacabs.asif.temparatureapp.R;

public class SplashScreen extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Intent intent = new Intent(this,WeatherActivity.class);
    startActivity(intent);
    finish();
  }
}
