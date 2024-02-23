package com.grupomovil.entity.geo.SOAP;

/**
 * @author Omar.beltran
 */
public class EBMae_veh {
                                //nombres de las etiquetas que se identifican en el SOAP
    private String placa;       //
    private String codVehicle;  //DESCRIPTION
    private String kilometer;   //LASTREADING
    private String readDate;    //LASTREADINGDATE

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

    public String getKilometer() {
        return kilometer;
    }

    public void setKilometer(String kilometer) {
        this.kilometer = kilometer;
    }

    public String getReadDate() {
        return readDate;
    }

    public void setReadDate(String readDate) {
        this.readDate = readDate;
    }
    
}
