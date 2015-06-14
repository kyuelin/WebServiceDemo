/**
 * WeatherSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.kyuelin.extservice.weather.wsclient;

import dev.kyuelin.extservice.weather.model.ForecastReturn;
import dev.kyuelin.extservice.weather.model.WeatherDescription;
import dev.kyuelin.extservice.weather.model.WeatherReturn;

public interface WeatherSoap_PortType extends java.rmi.Remote {

    /**
     * Gets Information for each WeatherID
     */
    public WeatherDescription[] getWeatherInformation() throws java.rmi.RemoteException;

    /**
     * Allows you to get your City Forecast Over the Next 7 Days,
     * which is updated hourly. U.S. Only
     */
    public ForecastReturn getCityForecastByZIP(java.lang.String ZIP) throws java.rmi.RemoteException;

    /**
     * Allows you to get your City's Weather, which is updated hourly.
     * U.S. Only
     */
    public WeatherReturn getCityWeatherByZIP(java.lang.String ZIP) throws java.rmi.RemoteException;
}
