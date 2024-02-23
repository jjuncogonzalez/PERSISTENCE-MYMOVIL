package com.grupomovil.entity.geo.SOAP;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class METERSOAP {

    String textContent = "";
    @JsonProperty("METERTYPE")
    List< METERTYPESOAP> mETERTYPESOAPList;

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @XmlAttribute(name = "TextContent")
    public String getTextContent() {
        return textContent;
    }

    public void setMETERTYPESOAPList(List<METERTYPESOAP> mETERTYPESOAPList) {
        this.mETERTYPESOAPList = mETERTYPESOAPList;
    }

    @XmlElement(name = "METERTYPE")
    public List<METERTYPESOAP> getMETERTYPESOAPList() {
        if (mETERTYPESOAPList == null) {
            mETERTYPESOAPList = new ArrayList<METERTYPESOAP>();
        }
        return mETERTYPESOAPList;
    }

}
