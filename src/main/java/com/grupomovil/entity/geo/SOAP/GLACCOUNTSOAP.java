package com.grupomovil.entity.geo.SOAP;

import javax.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GLACCOUNTSOAP {

    String vALUE = "";
    String textContent = "";
    @JsonProperty("GLCOMP")
    GLCOMPSOAP gLCOMPSOAP;

    public void setVALUE(String vALUE) {
        this.vALUE = vALUE;
    }

    @XmlAttribute(name = "VALUE")
    public String getVALUE() {
        return vALUE;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @XmlAttribute(name = "TextContent")
    public String getTextContent() {
        return textContent;
    }

    @XmlElement(name = "GLCOMP")
    public GLCOMPSOAP getGLCOMPSOAP() {
        if (gLCOMPSOAP == null) {
            gLCOMPSOAP = new GLCOMPSOAP();
        }
        return gLCOMPSOAP;
    }

    public void setGLCOMPSOAP(GLCOMPSOAP gLCOMPSOAP) {
        this.gLCOMPSOAP = gLCOMPSOAP;
    }

}
