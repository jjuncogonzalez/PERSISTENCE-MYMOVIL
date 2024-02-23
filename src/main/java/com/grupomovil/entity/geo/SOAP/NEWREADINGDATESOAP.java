package com.grupomovil.entity.geo.SOAP;

import javax.xml.bind.annotation.XmlAttribute;

public class NEWREADINGDATESOAP {

    String nil = "";
    String textContent = "";

    public void setNil(String nil) {
        this.nil = nil;
    }

    @XmlAttribute(name = "nil")
    public String getNil() {
        return nil;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @XmlAttribute(name = "TextContent")
    public String getTextContent() {
        return textContent;
    }

}
