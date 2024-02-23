package com.grupomovil.entity;

import java.io.Serializable;


/**
 * @author Omar.beltran
 */
public class EBGm_req_max implements Serializable{
    
    private static final long serialVersionUID = 1L;
   
    private int limitDate;
    private int limitCalendar;

    public int getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(int limitDate) {
        this.limitDate = limitDate;
    }

    public int getLimitCalendar() {
        return limitCalendar;
    }

    public void setLimitCalendar(int limitCalendar) {
        this.limitCalendar = limitCalendar;
    }
    
    
}
