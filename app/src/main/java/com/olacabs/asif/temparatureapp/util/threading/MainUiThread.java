package com.olacabs.asif.temparatureapp.util.threading;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by asif.shaikh2 on 15/04/18.
 */


/**
 * A singleton wrapper around {@link Handler} that helps to post work to the main UI thread.
 */
public class MainUiThread {

  private static MainUiThread mainUiThread;

  private Handler handler;

  private MainUiThread() {
    handler = new Handler(Looper.getMainLooper());
  }

  public static synchronized MainUiThread getInstance() {
    if (mainUiThread == null) {
      mainUiThread = new MainUiThread();
    }
    return mainUiThread;
  }

  public void post(Runnable runnable) {
    handler.post(runnable);
  }

}