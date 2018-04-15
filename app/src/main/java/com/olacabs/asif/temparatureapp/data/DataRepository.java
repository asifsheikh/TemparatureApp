package com.olacabs.asif.temparatureapp.data;

import com.olacabs.asif.temparatureapp.util.NetworkHelper;

/**
 * Created by asif.shaikh2 on 15/04/18.
 */

public class DataRepository {

  private DataSource remoteDataSource;
  private DataSource localDataSource;
  private NetworkHelper networkHelper;

  private static DataRepository dataRepository;

  public DataRepository(DataSource remoteDataSource, DataSource localDataSource,
      NetworkHelper networkHelper) {
    this.remoteDataSource = remoteDataSource;
    this.localDataSource = localDataSource;
    this.networkHelper = networkHelper;
  }

  public static synchronized DataRepository getInstance(DataSource remoteDataSource,
      DataSource localDataSource,
      NetworkHelper networkHelper) {
    if (dataRepository == null) {
      dataRepository = new DataRepository(remoteDataSource, localDataSource, networkHelper);
    }
    return dataRepository;
  }

  public void getTemperature(){

  }


  public void destroyInstance() {
    dataRepository = null;
  }


}



