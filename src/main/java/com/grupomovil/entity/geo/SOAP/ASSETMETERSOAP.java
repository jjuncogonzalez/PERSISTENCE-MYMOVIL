package com.grupomovil.entity.geo.SOAP;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ASSETMETERSOAP {

    String aCTIVE = "";
    String dOMAINID = "";
    String dOROLLOVER = "";
    String iNSPECTOR = "";
    String isMulti = "";
    String lASTREADING = "";
    String lINEARASSETMETERID = "";
    String mEASUREUNITID = "";
    String mETERNAME = "";
    String nEWREADING = "";
    String pREVIOUSREADING = "";
    String rEADINGTYPE = "";
    String textContent = "";
    String AVERAGE = "";
    String LASTREADINGDATE;
    @JsonProperty("NEWREADINGDATE")
    NEWREADINGDATESOAP nEWREADINGDATESOAP;
    @JsonProperty("PREVIOUSREADINGDATE")
    PREVIOUSREADINGDATESOAP pREVIOUSREADINGDATESOAP;
    @JsonProperty("METER")
    List< METERSOAP> mETERSOAPList;

    public void setACTIVE(String aCTIVE) {
        this.aCTIVE = aCTIVE;
    }

    @XmlAttribute(name = "ACTIVE")
    public String getACTIVE() {
        return aCTIVE;
    }

    public void setDOMAINID(String dOMAINID) {
        this.dOMAINID = dOMAINID;
    }

    @XmlAttribute(name = "DOMAINID")
    public String getDOMAINID() {
        return dOMAINID;
    }

    public void setDOROLLOVER(String dOROLLOVER) {
        this.dOROLLOVER = dOROLLOVER;
    }

    @XmlAttribute(name = "DOROLLOVER")
    public String getDOROLLOVER() {
        return dOROLLOVER;
    }

    public void setINSPECTOR(String iNSPECTOR) {
        this.iNSPECTOR = iNSPECTOR;
    }

    @XmlAttribute(name = "INSPECTOR")
    public String getINSPECTOR() {
        return iNSPECTOR;
    }

    public void setIsMulti(String isMulti) {
        this.isMulti = isMulti;
    }

    @XmlAttribute(name = "IsMulti")
    public String getIsMulti() {
        return isMulti;
    }

    @XmlElement
    public void setLASTREADING(String lASTREADING) {
        this.lASTREADING = lASTREADING;
    }

    public String getLASTREADING() {
        return lASTREADING;
    }

    public void setLINEARASSETMETERID(String lINEARASSETMETERID) {
        this.lINEARASSETMETERID = lINEARASSETMETERID;
    }

    @XmlAttribute(name = "LINEARASSETMETERID")
    public String getLINEARASSETMETERID() {
        return lINEARASSETMETERID;
    }

    public void setMEASUREUNITID(String mEASUREUNITID) {
        this.mEASUREUNITID = mEASUREUNITID;
    }

    @XmlAttribute(name = "MEASUREUNITID")
    public String getMEASUREUNITID() {
        return mEASUREUNITID;
    }

    @XmlElement
    public void setMETERNAME(String mETERNAME) {
        this.mETERNAME = mETERNAME;
    }

    public String getMETERNAME() {
        return mETERNAME;
    }

    public void setNEWREADING(String nEWREADING) {
        this.nEWREADING = nEWREADING;
    }

    @XmlAttribute(name = "NEWREADING")
    public String getNEWREADING() {
        return nEWREADING;
    }

    public void setPREVIOUSREADING(String pREVIOUSREADING) {
        this.pREVIOUSREADING = pREVIOUSREADING;
    }

    @XmlAttribute(name = "PREVIOUSREADING")
    public String getPREVIOUSREADING() {
        return pREVIOUSREADING;
    }

    public void setREADINGTYPE(String rEADINGTYPE) {
        this.rEADINGTYPE = rEADINGTYPE;
    }

    @XmlAttribute(name = "READINGTYPE")
    public String getREADINGTYPE() {
        return rEADINGTYPE;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @XmlAttribute(name = "TextContent")
    public String getTextContent() {
        return textContent;
    }

    @XmlAttribute(name = "AVERAGE")
    public String getAVERAGE() {
        return AVERAGE;
    }

    public void setAVERAGE(String AVERAGE) {
        this.AVERAGE = AVERAGE;
    }

    public String getLASTREADINGDATE() {
        return LASTREADINGDATE;
    }

    @XmlElement
    public void setLASTREADINGDATE(String LASTREADINGDATE) {
        this.LASTREADINGDATE = LASTREADINGDATE;
    }

    @XmlElement(name = "NEWREADINGDATE")
    public NEWREADINGDATESOAP getNEWREADINGDATESOAP() {
        if (nEWREADINGDATESOAP == null) {
            nEWREADINGDATESOAP = new NEWREADINGDATESOAP();
        }
        return nEWREADINGDATESOAP;
    }

    public void setNEWREADINGDATESOAP(NEWREADINGDATESOAP nEWREADINGDATESOAP) {
        this.nEWREADINGDATESOAP = nEWREADINGDATESOAP;
    }

    @XmlElement(name = "PREVIOUSREADINGDATE")
    public PREVIOUSREADINGDATESOAP getPREVIOUSREADINGDATESOAP() {
        if (pREVIOUSREADINGDATESOAP == null) {
            pREVIOUSREADINGDATESOAP = new PREVIOUSREADINGDATESOAP();
        }
        return pREVIOUSREADINGDATESOAP;
    }

    public void setPREVIOUSREADINGDATESOAP(PREVIOUSREADINGDATESOAP pREVIOUSREADINGDATESOAP) {
        this.pREVIOUSREADINGDATESOAP = pREVIOUSREADINGDATESOAP;
    }

    public void setMETERSOAPList(List<METERSOAP> mETERSOAPList) {
        this.mETERSOAPList = mETERSOAPList;
    }

    @XmlElement(name = "METER")
    public List<METERSOAP> getMETERSOAPList() {
        if (mETERSOAPList == null) {
            mETERSOAPList = new ArrayList<METERSOAP>();
        }
        return mETERSOAPList;
    }

}
