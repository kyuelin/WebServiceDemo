package dev.kyuelin.extservice.stocks.demo;

import dev.kyuelin.extservice.stocks.wsclient.StockQuote;
import dev.kyuelin.extservice.stocks.wsclient.StockQuoteLocator;
import dev.kyuelin.extservice.stocks.wsclient.StockQuoteSoap_PortType;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.rmi.RemoteException;

/**
 * Created by linken on 6/14/15.
 */
public class StockQuoteDemo {
    public static void main(String[] args) {
        StockQuote service = new StockQuoteLocator();
        try {
            StockQuoteSoap_PortType port = service.getStockQuoteSoap12();
            String quotexml = port.getQuote("MS");
            prettyPrint(parseXmlFile(quotexml));
        } catch (ServiceException exception) {
            exception.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static final Document parseXmlFile(String in) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(in));
            return db.parse(is);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final void prettyPrint(Document xml) throws Exception {
        Transformer tf = TransformerFactory.newInstance().newTransformer();
        tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        Writer out = new StringWriter();
        tf.transform(new DOMSource(xml), new StreamResult(out));
        System.out.println(out.toString());
    }
}
