package com.grupomovil.entity;

import java.io.Serializable;

/**
 *
 * @author jeisson.junco
 */
public class EBAssetmeter implements Serializable {

    private static final long serialVersionUID = 1L;

    private String placa;
    private String codVehicle;
    private String readDate;
    private String kilometer;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCodVehicle() {
        return codVehicle;
    }

    public void setCodVehicle(String codVehicle) {
        this.codVehicle = codVehicle;
    }

    public String getReadDate() {
        return readDate;
    }

    public void setReadDate(String readDate) {
        this.readDate = readDate;
    }

    public String getKilometer() {
        return kilometer;
    }

    public void setKilometer(String kilometer) {
        this.kilometer = kilometer;
    }


}
