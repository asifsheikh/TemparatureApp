package com.olacabs.asif.temparatureapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asif.shaikh2 on 27/03/18.
 */

public class CurrentWeatherDataModel {
  @SerializedName("time")
  private String mtime;
  @SerializedName("summary")
  private String msummary;
  @SerializedName("precipIntensity")
  private int mprecipIntensity;
  @SerializedName("precipProbability")
  private int mprecipProbability;
  @SerializedName("precipType")
  private String mprecipType;
  @SerializedName("temperature")
  private String mtemperature;
  @SerializedName("apparentTemperature")
  private String mapparentTemperature;
  @SerializedName("dewPoint")
  private String mdewPoint;
  @SerializedName("humidity")
  private String mhumidity;
  @SerializedName("pressure")
  private String mpressure;
  @SerializedName("windSpeed")
  private String mwindSpeed;
  @SerializedName("windGust")
  private String mwindGust;
  @SerializedName("windBearing")
  private String mwindBearing;
  @SerializedName("cloudCover")
  private String mcloudCover;
  @SerializedName("uvIndex")
  private String muvIndex;
  @SerializedName("visibility")
  private String mvisibility;
  @SerializedName("ozone")
  private String mozone;

  public CurrentWeatherDataModel(String mtime, String msummary, int mprecipIntensity,
      int mprecipProbability, String mprecipType, String mtemperature, String mapparentTemperature,
      String mdewPoint, String mhumidity, String mpressure, String mwindSpeed, String mwindGust, String mwindBearing,
      String mcloudCover, String muvIndex, String mvisibility, String mozone) {
    this.mtime = mtime;
    this.msummary = msummary;
    this.mprecipIntensity = mprecipIntensity;
    this.mprecipProbability = mprecipProbability;
    this.mprecipType = mprecipType;
    this.mtemperature = mtemperature;
    this.mapparentTemperature = mapparentTemperature;
    this.mdewPoint = mdewPoint;
    this.mhumidity = mhumidity;
    this.mpressure = mpressure;
    this.mwindSpeed = mwindSpeed;
    this.mwindGust = mwindGust;
    this.mwindBearing = mwindBearing;
    this.mcloudCover = mcloudCover;
    this.muvIndex = muvIndex;
    this.mvisibility = mvisibility;
    this.mozone = mozone;
  }

  public String getMtime() {
    return mtime;
  }

  public void setMtime(String mtime) {
    this.mtime = mtime;
  }

  public String getMsummary() {
    return msummary;
  }

  public void setMsummary(String msummary) {
    this.msummary = msummary;
  }

  public int getMprecipIntensity() {
    return mprecipIntensity;
  }

  public void setMprecipIntensity(int mprecipIntensity) {
    this.mprecipIntensity = mprecipIntensity;
  }

  public int getMprecipProbability() {
    return mprecipProbability;
  }

  public void setMprecipProbability(int mprecipProbability) {
    this.mprecipProbability = mprecipProbability;
  }

  public String getMprecipType() {
    return mprecipType;
  }

  public void setMprecipType(String mprecipType) {
    this.mprecipType = mprecipType;
  }

  public String getMtemperature() {
    return mtemperature;
  }

  public void setMtemperature(String mtemperature) {
    this.mtemperature = mtemperature;
  }

  public String getMapparentTemperature() {
    return mapparentTemperature;
  }

  public void setMapparentTemperature(String mapparentTemperature) {
    this.mapparentTemperature = mapparentTemperature;
  }

  public String getMdewPoint() {
    return mdewPoint;
  }

  public void setMdewPoint(String mdewPoint) {
    this.mdewPoint = mdewPoint;
  }

  public String getMhumidity() {
    return mhumidity;
  }

  public void setMhumidity(String mhumidity) {
    this.mhumidity = mhumidity;
  }

  public String getMpressure() {
    return mpressure;
  }

  public void setMpressure(String mpressure) {
    this.mpressure = mpressure;
  }

  public String getMwindSpeed() {
    return mwindSpeed;
  }

  public void setMwindSpeed(String mwindSpeed) {
    this.mwindSpeed = mwindSpeed;
  }

  public String getMwindGust() {
    return mwindGust;
  }

  public void setMwindGust(String mwindGust) {
    this.mwindGust = mwindGust;
  }

  public String getMwindBearing() {
    return mwindBearing;
  }

  public void setMwindBearing(String mwindBearing) {
    this.mwindBearing = mwindBearing;
  }

  public String getMcloudCover() {
    return mcloudCover;
  }

  public void setMcloudCover(String mcloudCover) {
    this.mcloudCover = mcloudCover;
  }

  public String getMuvIndex() {
    return muvIndex;
  }

  public void setMuvIndex(String muvIndex) {
    this.muvIndex = muvIndex;
  }

  public String getMvisibility() {
    return mvisibility;
  }

  public void setMvisibility(String mvisibility) {
    this.mvisibility = mvisibility;
  }

  public String getMozone() {
    return mozone;
  }

  public void setMozone(String mozone) {
    this.mozone = mozone;
  }
}
