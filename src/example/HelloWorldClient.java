package example;

import com.globalweather.java.GlobalWeather;
import com.globalweather.java.GlobalWeatherSoap;


/**
 * Created by Student on 10/5/2015.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    com.globalweather.java.GlobalWeatherSoap service = new GlobalWeather().getPort(GlobalWeatherSoap.class);
    //com.globalweather.java.GlobalWeatherSoap service = new GlobalWeather().getGlobalWeatherSoap();
    //invoke business method
    System.out.println(service.getWeather("Milwaukee", "United States"));
  }
}
