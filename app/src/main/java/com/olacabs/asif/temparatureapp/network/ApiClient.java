package com.olacabs.asif.temparatureapp.network;

import com.olacabs.asif.temparatureapp.util.utils;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by asif.shaikh2 on 27/03/18.
 */

public class ApiClient {

  public static final String BASE_URL = "https://api.darksky.net/forecast/" + utils.API_KEY + "/";
  private static Retrofit retrofit = null;


  public static Retrofit getClient() {
    if (retrofit==null) {
      retrofit = new Retrofit.Builder()
          .baseUrl(BASE_URL)
          .addConverterFactory(GsonConverterFactory.create())
          .build();
    }
    return retrofit;
  }

}
