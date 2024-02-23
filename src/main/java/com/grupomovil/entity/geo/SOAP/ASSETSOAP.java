package com.grupomovil.entity.geo.SOAP;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ASSETSOAP {

    String aSSETNUM = "";
    String cHANGEBY = "";
    String cHANGEDATE = "";
    String cHANGEPMSTATUS = "";
    String dESCRIPTION = "";
    String dESCRIPTION_LONGDESCRIPTION = "";
    String eSTENDOFLIFE = "";
    String eXPECTEDLIFE = "";
    String hIERARCHYPATH = "";
    String iNSTALLDATE = "";
    String iSRUNNING = "";
    String iTEMNUM = "";
    String isMulti = "";
    String lOCATION = "";
    String mANUFACTURER = "";
    String mETHODNAME = "";
    String nEWSITE = "";
    String oRGID = "";
    String pURCHASEPRICE = "";
    String rEMOVEFROMACTIVEROUTES = "";
    String rEMOVEFROMACTIVESP = "";
    String rOLLTOALLCHILDREN = "";
    String sERIALNUM = "";
    String sITEID = "";
    String sTATUSDATE = "";
    String tOTDOWNTIME = "";
    String vENDOR = "";
    String yTDCOST = "";
    String textContent = "";
    @JsonProperty("ASSETTYPE")
    List< ASSETTYPESOAP> aSSETTYPESOAPList;
    @JsonProperty("GLACCOUNT")
    GLACCOUNTSOAP gLACCOUNTSOAP;
    @JsonProperty("STATUS")
    STATUSSOAP sTATUSSOAP;
    @JsonProperty("WARRANTYEXPDATE")
    WARRANTYEXPDATESOAP wARRANTYEXPDATESOAP;
    @JsonProperty("WELL_MAINTAINED")
    WELL_MAINTAINEDSOAP wELL_MAINTAINEDSOAP;
    List<ASSETMETERSOAP> ASSETMETER;
    @JsonProperty("ASSETSPEC")
    List<ASSETSPECSOAP> aSSETSPECSOAPList;

    @XmlElement
    public void setASSETNUM(String aSSETNUM) {
        this.aSSETNUM = aSSETNUM;
    }

    public String getASSETNUM() {
        return aSSETNUM;
    }

    public void setCHANGEBY(String cHANGEBY) {
        this.cHANGEBY = cHANGEBY;
    }

    @XmlAttribute(name = "CHANGEBY")
    public String getCHANGEBY() {
        return cHANGEBY;
    }

    public void setCHANGEDATE(String cHANGEDATE) {
        this.cHANGEDATE = cHANGEDATE;
    }

    @XmlAttribute(name = "CHANGEDATE")
    public String getCHANGEDATE() {
        return cHANGEDATE;
    }

    public void setCHANGEPMSTATUS(String cHANGEPMSTATUS) {
        this.cHANGEPMSTATUS = cHANGEPMSTATUS;
    }

    @XmlAttribute(name = "CHANGEPMSTATUS")
    public String getCHANGEPMSTATUS() {
        return cHANGEPMSTATUS;
    }

    @XmlElement
    public void setDESCRIPTION(String dESCRIPTION) {
        this.dESCRIPTION = dESCRIPTION;
    }

    public String getDESCRIPTION() {
        return dESCRIPTION;
    }

    public void setDESCRIPTION_LONGDESCRIPTION(String dESCRIPTION_LONGDESCRIPTION) {
        this.dESCRIPTION_LONGDESCRIPTION = dESCRIPTION_LONGDESCRIPTION;
    }

    @XmlAttribute(name = "DESCRIPTION_LONGDESCRIPTION")
    public String getDESCRIPTION_LONGDESCRIPTION() {
        return dESCRIPTION_LONGDESCRIPTION;
    }

    public void setESTENDOFLIFE(String eSTENDOFLIFE) {
        this.eSTENDOFLIFE = eSTENDOFLIFE;
    }

    @XmlAttribute(name = "ESTENDOFLIFE")
    public String getESTENDOFLIFE() {
        return eSTENDOFLIFE;
    }

    public void setEXPECTEDLIFE(String eXPECTEDLIFE) {
        this.eXPECTEDLIFE = eXPECTEDLIFE;
    }

    @XmlAttribute(name = "EXPECTEDLIFE")
    public String getEXPECTEDLIFE() {
        return eXPECTEDLIFE;
    }

    public void setHIERARCHYPATH(String hIERARCHYPATH) {
        this.hIERARCHYPATH = hIERARCHYPATH;
    }

    @XmlAttribute(name = "HIERARCHYPATH")
    public String getHIERARCHYPATH() {
        return hIERARCHYPATH;
    }

    public void setINSTALLDATE(String iNSTALLDATE) {
        this.iNSTALLDATE = iNSTALLDATE;
    }

    @XmlAttribute(name = "INSTALLDATE")
    public String getINSTALLDATE() {
        return iNSTALLDATE;
    }

    public void setISRUNNING(String iSRUNNING) {
        this.iSRUNNING = iSRUNNING;
    }

    @XmlAttribute(name = "ISRUNNING")
    public String getISRUNNING() {
        return iSRUNNING;
    }

    public void setITEMNUM(String iTEMNUM) {
        this.iTEMNUM = iTEMNUM;
    }

    @XmlAttribute(name = "ITEMNUM")
    public String getITEMNUM() {
        return iTEMNUM;
    }

    public void setIsMulti(String isMulti) {
        this.isMulti = isMulti;
    }

    @XmlAttribute(name = "IsMulti")
    public String getIsMulti() {
        return isMulti;
    }

    public void setLOCATION(String lOCATION) {
        this.lOCATION = lOCATION;
    }

    @XmlAttribute(name = "LOCATION")
    public String getLOCATION() {
        return lOCATION;
    }

    public void setMANUFACTURER(String mANUFACTURER) {
        this.mANUFACTURER = mANUFACTURER;
    }

    @XmlAttribute(name = "MANUFACTURER")
    public String getMANUFACTURER() {
        return mANUFACTURER;
    }

    public void setMETHODNAME(String mETHODNAME) {
        this.mETHODNAME = mETHODNAME;
    }

    @XmlAttribute(name = "METHODNAME")
    public String getMETHODNAME() {
        return mETHODNAME;
    }

    public void setNEWSITE(String nEWSITE) {
        this.nEWSITE = nEWSITE;
    }

    @XmlAttribute(name = "NEWSITE")
    public String getNEWSITE() {
        return nEWSITE;
    }

    public void setORGID(String oRGID) {
        this.oRGID = oRGID;
    }

    @XmlAttribute(name = "ORGID")
    public String getORGID() {
        return oRGID;
    }

    public void setPURCHASEPRICE(String pURCHASEPRICE) {
        this.pURCHASEPRICE = pURCHASEPRICE;
    }

    @XmlAttribute(name = "PURCHASEPRICE")
    public String getPURCHASEPRICE() {
        return pURCHASEPRICE;
    }

    public void setREMOVEFROMACTIVEROUTES(String rEMOVEFROMACTIVEROUTES) {
        this.rEMOVEFROMACTIVEROUTES = rEMOVEFROMACTIVEROUTES;
    }

    @XmlAttribute(name = "REMOVEFROMACTIVEROUTES")
    public String getREMOVEFROMACTIVEROUTES() {
        return rEMOVEFROMACTIVEROUTES;
    }

    public void setREMOVEFROMACTIVESP(String rEMOVEFROMACTIVESP) {
        this.rEMOVEFROMACTIVESP = rEMOVEFROMACTIVESP;
    }

    @XmlAttribute(name = "REMOVEFROMACTIVESP")
    public String getREMOVEFROMACTIVESP() {
        return rEMOVEFROMACTIVESP;
    }

    public void setROLLTOALLCHILDREN(String rOLLTOALLCHILDREN) {
        this.rOLLTOALLCHILDREN = rOLLTOALLCHILDREN;
    }

    @XmlAttribute(name = "ROLLTOALLCHILDREN")
    public String getROLLTOALLCHILDREN() {
        return rOLLTOALLCHILDREN;
    }

    public void setSERIALNUM(String sERIALNUM) {
        this.sERIALNUM = sERIALNUM;
    }

    @XmlAttribute(name = "SERIALNUM")
    public String getSERIALNUM() {
        return sERIALNUM;
    }

    public void setSITEID(String sITEID) {
        this.sITEID = sITEID;
    }

    @XmlAttribute(name = "SITEID")
    public String getSITEID() {
        return sITEID;
    }

    public void setSTATUSDATE(String sTATUSDATE) {
        this.sTATUSDATE = sTATUSDATE;
    }

    @XmlAttribute(name = "STATUSDATE")
    public String getSTATUSDATE() {
        return sTATUSDATE;
    }

    public void setTOTDOWNTIME(String tOTDOWNTIME) {
        this.tOTDOWNTIME = tOTDOWNTIME;
    }

    @XmlAttribute(name = "TOTDOWNTIME")
    public String getTOTDOWNTIME() {
        return tOTDOWNTIME;
    }

    public void setVENDOR(String vENDOR) {
        this.vENDOR = vENDOR;
    }

    @XmlAttribute(name = "VENDOR")
    public String getVENDOR() {
        return vENDOR;
    }

    public void setYTDCOST(String yTDCOST) {
        this.yTDCOST = yTDCOST;
    }

    @XmlAttribute(name = "YTDCOST")
    public String getYTDCOST() {
        return yTDCOST;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @XmlAttribute(name = "TextContent")
    public String getTextContent() {
        return textContent;
    }

    public void setASSETTYPESOAPList(List<ASSETTYPESOAP> aSSETTYPESOAPList) {
        this.aSSETTYPESOAPList = aSSETTYPESOAPList;
    }

    @XmlElement(name = "ASSETTYPE")
    public List<ASSETTYPESOAP> getASSETTYPESOAPList() {
        if (aSSETTYPESOAPList == null) {
            aSSETTYPESOAPList = new ArrayList<ASSETTYPESOAP>();
        }
        return aSSETTYPESOAPList;
    }

    @XmlElement(name = "GLACCOUNT")
    public GLACCOUNTSOAP getGLACCOUNTSOAP() {
        if (gLACCOUNTSOAP == null) {
            gLACCOUNTSOAP = new GLACCOUNTSOAP();
        }
        return gLACCOUNTSOAP;
    }

    public void setGLACCOUNTSOAP(GLACCOUNTSOAP gLACCOUNTSOAP) {
        this.gLACCOUNTSOAP = gLACCOUNTSOAP;
    }

    @XmlElement(name = "STATUS")
    public STATUSSOAP getSTATUSSOAP() {
        if (sTATUSSOAP == null) {
            sTATUSSOAP = new STATUSSOAP();
        }
        return sTATUSSOAP;
    }

    public void setSTATUSSOAP(STATUSSOAP sTATUSSOAP) {
        this.sTATUSSOAP = sTATUSSOAP;
    }

    @XmlElement(name = "WARRANTYEXPDATE")
    public WARRANTYEXPDATESOAP getWARRANTYEXPDATESOAP() {
        if (wARRANTYEXPDATESOAP == null) {
            wARRANTYEXPDATESOAP = new WARRANTYEXPDATESOAP();
        }
        return wARRANTYEXPDATESOAP;
    }

    public void setWARRANTYEXPDATESOAP(WARRANTYEXPDATESOAP wARRANTYEXPDATESOAP) {
        this.wARRANTYEXPDATESOAP = wARRANTYEXPDATESOAP;
    }

    @XmlElement(name = "WELL_MAINTAINED")
    public WELL_MAINTAINEDSOAP getWELL_MAINTAINEDSOAP() {
        if (wELL_MAINTAINEDSOAP == null) {
            wELL_MAINTAINEDSOAP = new WELL_MAINTAINEDSOAP();
        }
        return wELL_MAINTAINEDSOAP;
    }

    public void setWELL_MAINTAINEDSOAP(WELL_MAINTAINEDSOAP wELL_MAINTAINEDSOAP) {
        this.wELL_MAINTAINEDSOAP = wELL_MAINTAINEDSOAP;
    }

    public List<ASSETMETERSOAP> getASSETMETER() {
        return ASSETMETER;
    }

    @XmlElement
    public void setASSETMETER(List<ASSETMETERSOAP> ASSETMETER) {
        this.ASSETMETER = ASSETMETER;
    }

    public void setASSETSPECSOAPList(List<ASSETSPECSOAP> aSSETSPECSOAPList) {
        this.aSSETSPECSOAPList = aSSETSPECSOAPList;
    }

    @XmlElement(name = "ASSETSPEC")
    public List<ASSETSPECSOAP> getASSETSPECSOAPList() {
        if (aSSETSPECSOAPList == null) {
            aSSETSPECSOAPList = new ArrayList<ASSETSPECSOAP>();
        }
        return aSSETSPECSOAPList;
    }

}
