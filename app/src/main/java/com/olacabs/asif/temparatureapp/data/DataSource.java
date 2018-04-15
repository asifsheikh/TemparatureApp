package com.olacabs.asif.temparatureapp.data;

import com.olacabs.asif.temparatureapp.util.threading.MainUiThread;
import com.olacabs.asif.temparatureapp.util.threading.ThreadExecutor;
import java.util.List;

/**
 * Created by asif.shaikh2 on 15/04/18.
 */

public abstract class DataSource {

  protected MainUiThread mainUiThread;
  protected ThreadExecutor threadExecutor;

  public DataSource(MainUiThread mainUiThread, ThreadExecutor threadExecutor) {
    this.mainUiThread = mainUiThread;
    this.threadExecutor = threadExecutor;
  }

  public interface GetTemperatureCallbacks{
    void onSuccess();

    void onFailure(Throwable throwable);

    void onNetworkFailure();
  }

  public abstract void getTemperature(GetTemperatureCallbacks callback);

}
