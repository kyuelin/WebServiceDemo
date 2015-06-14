package dev.kyuelin.extservice.weather.demo;

import dev.kyuelin.extservice.weather.model.Forecast;
import dev.kyuelin.extservice.weather.model.ForecastReturn;
import dev.kyuelin.extservice.weather.wsclient.Weather;
import dev.kyuelin.extservice.weather.wsclient.WeatherLocator;
import dev.kyuelin.extservice.weather.wsclient.WeatherSoap_PortType;

import java.text.SimpleDateFormat;


/**
 * Created by linken on 6/7/15.
 */
public class WeatherClient {
    public static void main(String[] argv) {
        try {
            Weather weather = new WeatherLocator();
            WeatherSoap_PortType port = weather.getWeatherSoap12();
            ForecastReturn forecast = port.getCityForecastByZIP("11358");
            //((WeatherSoap12Stub)service).setUsername("user3");
            //((WeatherSoap12Stub)service).setPassword("pass3");
            // invoke business method
            Forecast[] result = forecast.getForecastResult();
            System.out.println(result[0].getDesciption());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            System.out.println(dateFormat.format(result[0].getDate().getTime())); //2013/10/15 16:16:39kjj
            System.out.println(result[0].getProbabilityOfPrecipiation().getDaytime());
            System.out.println(result[0].getProbabilityOfPrecipiation().getNighttime());
            System.out.println(result[0].getTemperatures().getDaytimeHigh());
            System.out.println(result[0].getTemperatures().getMorningLow());
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
