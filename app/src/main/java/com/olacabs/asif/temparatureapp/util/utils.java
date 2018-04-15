package com.olacabs.asif.temparatureapp.util;

/**
 * Created by asif.shaikh2 on 27/03/18.
 */

public final class utils {

    public static String API_KEY = "13b9c7bb32da73d7c9dba072cea744bc";

    // Converts to celcius
    public static int convertFahrenheitToCelcius(float fahrenheit) {
        return (int)((fahrenheit - 32) * 5 / 9);
    }

  // Converts to fahrenheit
  public static float convertCelciusToFahrenheit(float celsius) {
    return ((celsius * 9) / 5) + 32;
  }

}
