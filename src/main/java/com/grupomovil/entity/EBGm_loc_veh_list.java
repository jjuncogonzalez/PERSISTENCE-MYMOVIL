package com.grupomovil.entity;

import java.io.Serializable;

/**
 * @author jjunco
 */
public class EBGm_loc_veh_list implements Serializable {

    private static final long serialVersionUID = 1L;

    public class ListData {

        private String code_vehicle;
        private String type_vehicle;
        private String position;
        private int batery;
        private String loc_veh;
        private String loc_pos;
        private String loc_est;
        private Long loc_dat_con;
        private String loc_niv_cari;
        private String loc_niv_carf;
        private String loc_km;
        private Boolean results;
        private int usu_cre;

        private String dat_cre;

        public String getLoc_veh() {
            return loc_veh;
        }

        public void setLoc_veh(String loc_veh) {
            this.loc_veh = loc_veh;
        }

        public String getLoc_pos() {
            return loc_pos;
        }

        public void setLoc_pos(String loc_pos) {
            this.loc_pos = loc_pos;
        }

        public String getLoc_est() {
            return loc_est;
        }

        public void setLoc_est(String loc_est) {
            this.loc_est = loc_est;
        }

        public Long getLoc_dat_con() {
            return loc_dat_con;
        }

        public void setLoc_dat_con(Long loc_dat_con) {
            this.loc_dat_con = loc_dat_con;
        }

        public String getLoc_niv_cari() {
            return loc_niv_cari;
        }

        public void setLoc_niv_cari(String loc_niv_cari) {
            this.loc_niv_cari = loc_niv_cari;
        }

        public String getLoc_niv_carf() {
            return loc_niv_carf;
        }

        public void setLoc_niv_carf(String loc_niv_carf) {
            this.loc_niv_carf = loc_niv_carf;
        }

        public String getLoc_km() {
            return loc_km;
        }

        public void setLoc_km(String loc_km) {
            this.loc_km = loc_km;
        }

        public Boolean getResults() {
            return results;
        }

        public void setResults(Boolean results) {
            this.results = results;
        }

        public int getUsu_cre() {
            return usu_cre;
        }

        public void setUsu_cre(int usu_cre) {
            this.usu_cre = usu_cre;
        }

        public String getDat_cre() {
            return dat_cre;
        }

        public void setDat_cre(String dat_cre) {
            this.dat_cre = dat_cre;
        }

        public String getCode_vehicle() {
            return code_vehicle;
        }

        public void setCode_vehicle(String code_vehicle) {
            this.code_vehicle = code_vehicle;
        }

        public String getType_vehicle() {
            return type_vehicle;
        }

        public void setType_vehicle(String type_vehicle) {
            this.type_vehicle = type_vehicle;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getBatery() {
            return batery;
        }

        public void setBatery(int batery) {
            this.batery = batery;
        }

    }

}
