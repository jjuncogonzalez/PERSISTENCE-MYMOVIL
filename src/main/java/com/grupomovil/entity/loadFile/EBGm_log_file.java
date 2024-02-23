/*
 * Entidad que se emplea para generar un log de errores al usuario final
 */
package com.grupomovil.entity.loadFile;

/**
 * @author Omar.beltran
 */
public class EBGm_log_file {
    private int id;
    private String file_name;//nombre del archivo que se está importando
    private int reg_id;     //identificador del registro, corresponde al número de fila
    private int col_id;     //número de la columna
    private String col_name;//nombre de la columna
    private String reg_obs; //observación sobre el registro

    public EBGm_log_file() {
    }
    
    public EBGm_log_file(int reg_id, String reg_obs) {
        this.reg_obs = reg_obs;
        this.reg_id = reg_id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public int getReg_id() {
        return reg_id;
    }

    public void setReg_id(int reg_id) {
        this.reg_id = reg_id;
    }

    public int getCol_id() {
        return col_id;
    }

    public void setCol_id(int col_id) {
        this.col_id = col_id;
    }

    public String getCol_name() {
        return col_name;
    }

    public void setCol_name(String col_name) {
        this.col_name = col_name;
    }

    public String getReg_obs() {
        return reg_obs;
    }

    public void setReg_obs(String reg_obs) {
        this.reg_obs = reg_obs;
    }
    
}
