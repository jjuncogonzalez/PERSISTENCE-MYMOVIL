package com.grupomovil.entity;

/**
 * Entidad para el cambio de contraseñas
 * @author Omar.beltran
 */
public class EBGm_cha_pas {

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getRepeatNewPassword() {
        return repeatNewPassword;
    }

    public void setRepeatNewPassword(String repeatNewPassword) {
        this.repeatNewPassword = repeatNewPassword;
    }
    
    private String currentPassword;
    private String newPassword;
    private String repeatNewPassword;
}
