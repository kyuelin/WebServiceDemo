/**
 * CompTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.kyuelin.extservice.nwsweather.model;

public class CompTypeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CompTypeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IsEqual = "IsEqual";
    public static final java.lang.String _Between = "Between";
    public static final java.lang.String _GreaterThan = "GreaterThan";
    public static final java.lang.String _GreaterThanEqualTo = "GreaterThanEqualTo";
    public static final java.lang.String _LessThan = "LessThan";
    public static final java.lang.String _LessThanEqualTo = "LessThanEqualTo";
    public static final CompTypeType IsEqual = new CompTypeType(_IsEqual);
    public static final CompTypeType Between = new CompTypeType(_Between);
    public static final CompTypeType GreaterThan = new CompTypeType(_GreaterThan);
    public static final CompTypeType GreaterThanEqualTo = new CompTypeType(_GreaterThanEqualTo);
    public static final CompTypeType LessThan = new CompTypeType(_LessThan);
    public static final CompTypeType LessThanEqualTo = new CompTypeType(_LessThanEqualTo);
    public java.lang.String getValue() { return _value_;}
    public static CompTypeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CompTypeType enumeration = (CompTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CompTypeType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd", "compTypeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public static class FeatureTypeType implements java.io.Serializable {
        private String _value_;
        private static java.util.HashMap _table_ = new java.util.HashMap();

        // Constructor
        protected FeatureTypeType(String value) {
            _value_ = value;
            _table_.put(_value_,this);
        }

        public static final String _Forecast_Gml2Point = "Forecast_Gml2Point";
        public static final String _Forecast_Gml2AllWx = "Forecast_Gml2AllWx";
        public static final String _Forecast_GmlsfPoint = "Forecast_GmlsfPoint";
        public static final String _Forecast_GmlObs = "Forecast_GmlObs";
        public static final String _NdfdMultiPointCoverage = "NdfdMultiPointCoverage";
        public static final String _Ndfd_KmlPoint = "Ndfd_KmlPoint";
        public static final FeatureTypeType Forecast_Gml2Point = new FeatureTypeType(_Forecast_Gml2Point);
        public static final FeatureTypeType Forecast_Gml2AllWx = new FeatureTypeType(_Forecast_Gml2AllWx);
        public static final FeatureTypeType Forecast_GmlsfPoint = new FeatureTypeType(_Forecast_GmlsfPoint);
        public static final FeatureTypeType Forecast_GmlObs = new FeatureTypeType(_Forecast_GmlObs);
        public static final FeatureTypeType NdfdMultiPointCoverage = new FeatureTypeType(_NdfdMultiPointCoverage);
        public static final FeatureTypeType Ndfd_KmlPoint = new FeatureTypeType(_Ndfd_KmlPoint);
        public String getValue() { return _value_;}
        public static FeatureTypeType fromValue(String value)
              throws IllegalArgumentException {
            FeatureTypeType enumeration = (FeatureTypeType)
                _table_.get(value);
            if (enumeration==null) throw new IllegalArgumentException();
            return enumeration;
        }
        public static FeatureTypeType fromString(String value)
              throws IllegalArgumentException {
            return fromValue(value);
        }
        public boolean equals(Object obj) {return (obj == this);}
        public int hashCode() { return toString().hashCode();}
        public String toString() { return _value_;}
        public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
        public static org.apache.axis.encoding.Serializer getSerializer(
               String mechType,
               Class _javaType,
               javax.xml.namespace.QName _xmlType) {
            return
              new org.apache.axis.encoding.ser.EnumSerializer(
                _javaType, _xmlType);
        }
        public static org.apache.axis.encoding.Deserializer getDeserializer(
               String mechType,
               Class _javaType,
               javax.xml.namespace.QName _xmlType) {
            return
              new org.apache.axis.encoding.ser.EnumDeserializer(
                _javaType, _xmlType);
        }
        // Type metadata
        private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FeatureTypeType.class);

        static {
            typeDesc.setXmlType(new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd", "featureTypeType"));
        }
        /**
         * Return type metadata object
         */
        public static org.apache.axis.description.TypeDesc getTypeDesc() {
            return typeDesc;
        }

    }

    public static class FormatType implements java.io.Serializable {
        private String _value_;
        private static java.util.HashMap _table_ = new java.util.HashMap();

        // Constructor
        protected FormatType(String value) {
            _value_ = value;
            _table_.put(_value_,this);
        }

        public static final String _value1 = "24 hourly";
        public static final String _value2 = "12 hourly";
        public static final FormatType value1 = new FormatType(_value1);
        public static final FormatType value2 = new FormatType(_value2);
        public String getValue() { return _value_;}
        public static FormatType fromValue(String value)
              throws IllegalArgumentException {
            FormatType enumeration = (FormatType)
                _table_.get(value);
            if (enumeration==null) throw new IllegalArgumentException();
            return enumeration;
        }
        public static FormatType fromString(String value)
              throws IllegalArgumentException {
            return fromValue(value);
        }
        public boolean equals(Object obj) {return (obj == this);}
        public int hashCode() { return toString().hashCode();}
        public String toString() { return _value_;}
        public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
        public static org.apache.axis.encoding.Serializer getSerializer(
               String mechType,
               Class _javaType,
               javax.xml.namespace.QName _xmlType) {
            return
              new org.apache.axis.encoding.ser.EnumSerializer(
                _javaType, _xmlType);
        }
        public static org.apache.axis.encoding.Deserializer getDeserializer(
               String mechType,
               Class _javaType,
               javax.xml.namespace.QName _xmlType) {
            return
              new org.apache.axis.encoding.ser.EnumDeserializer(
                _javaType, _xmlType);
        }
        // Type metadata
        private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FormatType.class);

        static {
            typeDesc.setXmlType(new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd", "formatType"));
        }
        /**
         * Return type metadata object
         */
        public static org.apache.axis.description.TypeDesc getTypeDesc() {
            return typeDesc;
        }

    }
}
