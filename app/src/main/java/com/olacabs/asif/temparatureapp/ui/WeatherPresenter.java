package com.olacabs.asif.temparatureapp.ui;

import android.support.annotation.NonNull;
import android.util.Log;
import com.olacabs.asif.temparatureapp.model.WeatherDataModel;
import com.olacabs.asif.temparatureapp.network.ApiClient;
import com.olacabs.asif.temparatureapp.network.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by asif.shaikh2 on 27/03/18.
 */

public class WeatherPresenter implements WeatherActivtyContract.Presenter {

  private static  String TAG = WeatherPresenter.class.getSimpleName();

  private WeatherDataModel mWeatherDataModel;
  private ApiInterface mApiInterface;
  private final WeatherActivtyContract.View mWeatherActivityView;


  public WeatherPresenter(@NonNull WeatherActivtyContract.View weatherActivityView){
    mWeatherActivityView = checkNotNull(weatherActivityView,"view cannot be null");
    mWeatherActivityView.setPresenter(this);

  }

  public void getCurrentTemperature(){
    mWeatherActivityView.showProgressDialog();
    mApiInterface = ApiClient.getClient().create(ApiInterface.class);
    Call<WeatherDataModel> call = mApiInterface.getCurrentWeatherInfo("12.903130000000","77.66204140000002","daily,hourly");
    call.enqueue(new Callback<WeatherDataModel>() {
      @Override
      public void onResponse(Call<WeatherDataModel> call, Response<WeatherDataModel> response) {
        mWeatherDataModel = response.body();
        Log.i(TAG,"Successfully got the response " + mWeatherDataModel.getMcurrently().getMtemperature());
      }

      @Override
      public void onFailure(Call<WeatherDataModel> call, Throwable t) {
        // Log error here since request failed
        Log.e(TAG, t.toString());
      }
    });
  }


  @Override
  public void start() {

  }
}
