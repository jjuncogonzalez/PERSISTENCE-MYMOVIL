package com.grupomovil.entity.geo.SOAP;

import javax.xml.bind.annotation.XmlAttribute;

public class GLCOMPSOAP {

    String glorder = "";
    String textContent = "";

    public void setGlorder(String glorder) {
        this.glorder = glorder;
    }

    @XmlAttribute(name = "glorder")
    public String getGlorder() {
        return glorder;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @XmlAttribute(name = "TextContent")
    public String getTextContent() {
        return textContent;
    }

}
