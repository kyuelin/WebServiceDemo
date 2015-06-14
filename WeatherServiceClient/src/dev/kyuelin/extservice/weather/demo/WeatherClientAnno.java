package dev.kyuelin.extservice.weather.demo;

import dev.kyuelin.extservice.weather.model.Forecast;
import dev.kyuelin.extservice.weather.model.ForecastReturn;
import dev.kyuelin.extservice.weather.wsclient.Weather;
import dev.kyuelin.extservice.weather.wsclient.WeatherSoap_PortType;

import javax.xml.rpc.ServiceException;
import javax.xml.ws.WebServiceRef;
import java.rmi.RemoteException;

/**
 * Created by linken on 6/10/15.
 */
public class WeatherClientAnno {
    @WebServiceRef(wsdlLocation = "http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL")
    private static Weather service;

    public static void main(String[] args) {
        try {
            WeatherSoap_PortType port = service.getWeatherSoap12();
            ForecastReturn forecast = port.getCityForecastByZIP("11358");
            //((WeatherSoap12Stub)service).setUsername("user3");
            //((WeatherSoap12Stub)service).setPassword("pass3");
            // invoke business method
            Forecast[] result = forecast.getForecastResult();
            System.out.println(result[0].getDesciption());
            System.out.println(result[0].getDate().toString());
            System.out.println(result[0].getProbabilityOfPrecipiation().getDaytime());
            System.out.println(result[0].getProbabilityOfPrecipiation().getNighttime());
            System.out.println(result[0].getTemperatures().getDaytimeHigh());
            System.out.println(result[0].getTemperatures().getMorningLow());
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
