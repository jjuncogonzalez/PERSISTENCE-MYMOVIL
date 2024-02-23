package com.grupomovil.entity.geo.SOAP;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MAESTRO_VEHICULOSet")
public class MAESTRO_VEHICULOSetSOAP {

    String textContent = "";
    @JsonProperty("ASSET")
    List< ASSETSOAP> aSSETSOAPList;

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @XmlAttribute(name = "TextContent")
    public String getTextContent() {
        return textContent;
    }

    public void setASSETSOAPList(List<ASSETSOAP> aSSETSOAPList) {
        this.aSSETSOAPList = aSSETSOAPList;
    }

    @XmlElement(name = "ASSET")
    public List<ASSETSOAP> getASSETSOAPList() {
        if (aSSETSOAPList == null) {
            aSSETSOAPList = new ArrayList<ASSETSOAP>();
        }
        return aSSETSOAPList;
    }

}
