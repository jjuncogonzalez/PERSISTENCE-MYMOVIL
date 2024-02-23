package com.grupomovil.entity.geo.SOAP;

import javax.xml.bind.annotation.XmlAttribute;

public class STATUSSOAP {

    String maxvalue = "";
    String textContent = "";

    public void setMaxvalue(String maxvalue) {
        this.maxvalue = maxvalue;
    }

    @XmlAttribute(name = "maxvalue")
    public String getMaxvalue() {
        return maxvalue;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @XmlAttribute(name = "TextContent")
    public String getTextContent() {
        return textContent;
    }

}
