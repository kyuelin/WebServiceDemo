package dev.kyuelin.extservice.nwsweather.demo;

import dev.kyuelin.extservice.nwsweather.wsclient.NdfdXML;
import dev.kyuelin.extservice.nwsweather.wsclient.NdfdXMLLocator;
import dev.kyuelin.extservice.nwsweather.wsclient.NdfdXMLPortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created by linken on 6/14/15.
 */
public class NWSWeatherClient {
    public static void main(String[] args) {
        NdfdXML service = new NdfdXMLLocator();
        try {
            NdfdXMLPortType port = service.getndfdXMLPort();
            System.out.println(port.latLonListZipCode("11358"));
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
