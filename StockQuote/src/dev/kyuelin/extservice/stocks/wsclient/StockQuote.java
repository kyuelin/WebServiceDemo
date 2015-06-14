/**
 * StockQuote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.kyuelin.extservice.stocks.wsclient;

import dev.kyuelin.extservice.stocks.wsclient.StockQuoteSoap_PortType;

public interface StockQuote extends javax.xml.rpc.Service {
    public java.lang.String getStockQuoteSoap12Address();

    public StockQuoteSoap_PortType getStockQuoteSoap12() throws javax.xml.rpc.ServiceException;

    public StockQuoteSoap_PortType getStockQuoteSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getStockQuoteSoapAddress();

    public StockQuoteSoap_PortType getStockQuoteSoap() throws javax.xml.rpc.ServiceException;

    public StockQuoteSoap_PortType getStockQuoteSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
