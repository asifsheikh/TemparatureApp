package com.olacabs.asif.temparatureapp.ui;

import com.olacabs.asif.temparatureapp.BasePresenter;
import com.olacabs.asif.temparatureapp.BaseView;

/**
 * Created by asif.shaikh2 on 29/03/18.
 */

public interface WeatherActivtyContract {

  interface Presenter extends BasePresenter{
    void getCurrentTemperature();
  }

  interface View extends BaseView<Presenter>{
    void showProgressDialog();
    void hideProgressDialog();
    void showCurrentLatLng(String lat,String lng);
    void showCurrentTemperature(int temperature);
  }

}
