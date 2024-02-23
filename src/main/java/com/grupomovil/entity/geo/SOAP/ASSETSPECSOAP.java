package com.grupomovil.entity.geo.SOAP;

import javax.xml.bind.annotation.XmlAttribute;

public class ASSETSPECSOAP {

    String aLNVALUE = "";
    String aSSETATTRID = "";
    String lINEARASSETSPECID = "";
    String sECTION = "";
    String textContent = "";

    public void setALNVALUE(String aLNVALUE) {
        this.aLNVALUE = aLNVALUE;
    }

    @XmlAttribute(name = "ALNVALUE")
    public String getALNVALUE() {
        return aLNVALUE;
    }

    public void setASSETATTRID(String aSSETATTRID) {
        this.aSSETATTRID = aSSETATTRID;
    }

    @XmlAttribute(name = "ASSETATTRID")
    public String getASSETATTRID() {
        return aSSETATTRID;
    }

    public void setLINEARASSETSPECID(String lINEARASSETSPECID) {
        this.lINEARASSETSPECID = lINEARASSETSPECID;
    }

    @XmlAttribute(name = "LINEARASSETSPECID")
    public String getLINEARASSETSPECID() {
        return lINEARASSETSPECID;
    }

    public void setSECTION(String sECTION) {
        this.sECTION = sECTION;
    }

    @XmlAttribute(name = "SECTION")
    public String getSECTION() {
        return sECTION;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @XmlAttribute(name = "TextContent")
    public String getTextContent() {
        return textContent;
    }

}
