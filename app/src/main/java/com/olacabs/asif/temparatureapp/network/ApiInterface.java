package com.olacabs.asif.temparatureapp.network;

import com.olacabs.asif.temparatureapp.model.WeatherDataModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by asif.shaikh2 on 27/03/18.
 */

public interface ApiInterface {
  @GET("{lat},{lng}")
  Call<WeatherDataModel> getCurrentWeatherInfo(@Path("lat") String lat,@Path("lng") String lng,@Query("exclude") String exclude);
}
