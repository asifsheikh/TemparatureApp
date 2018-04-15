package com.olacabs.asif.temparatureapp.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by asif.shaikh2 on 15/04/18.
 */

public class NetworkHelper {

  private static NetworkHelper networkHelper;

  public static synchronized NetworkHelper getInstance() {
    if (networkHelper == null) {
      networkHelper = new NetworkHelper();
    }
    return networkHelper;
  }

  public boolean isNetworkAvailable(Context context) {
    ConnectivityManager connectivityManager =
        (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

    NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
    boolean isConnected = activeNetwork != null &&
        activeNetwork.isConnectedOrConnecting();
    return isConnected;
  }
}