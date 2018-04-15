package com.olacabs.asif.temparatureapp.data.model.temperature;

import com.google.gson.annotations.SerializedName;
import com.olacabs.asif.temparatureapp.data.model.temperature.CurrentWeatherDataModel;

/**
 * Created by asif.shaikh2 on 27/03/18.
 */

public class WeatherDataModel {
  @SerializedName("latitude")
  private String mlatitude;
  @SerializedName("longitude")
  private String mlongitude;
  @SerializedName("timezone")
  private String mtimezone;
  @SerializedName("currently")
  private CurrentWeatherDataModel mcurrently;
  @SerializedName("offset")
  private String moffset;

  public String getMlatitude() {
    return mlatitude;
  }

  public void setMlatitude(String mlatitude) {
    this.mlatitude = mlatitude;
  }

  public String getMlongitude() {
    return mlongitude;
  }

  public void setMlongitude(String mlongitude) {
    this.mlongitude = mlongitude;
  }

  public String getMtimezone() {
    return mtimezone;
  }

  public void setMtimezone(String mtimezone) {
    this.mtimezone = mtimezone;
  }

  public CurrentWeatherDataModel getMcurrently() {
    return mcurrently;
  }

  public void setMcurrently(CurrentWeatherDataModel mcurrently) {
    this.mcurrently = mcurrently;
  }

  public String getMoffset() {
    return moffset;
  }

  public void setMoffset(String moffset) {
    this.moffset = moffset;
  }
}
