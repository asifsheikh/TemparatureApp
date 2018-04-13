package com.olacabs.asif.temparatureapp;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by asif.shaikh2 on 13/04/18.
 */

public class TemperatureApp extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    SystemClock.sleep(2000);
  }
}
