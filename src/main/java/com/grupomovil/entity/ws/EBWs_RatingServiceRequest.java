package com.grupomovil.entity.ws;

/**
 *
 * @author jeisson.junco
 */
public class EBWs_RatingServiceRequest {

    private int id;
    private int id_rating;
    private String user_rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_rating() {
        return id_rating;
    }

    public void setId_rating(int id_rating) {
        this.id_rating = id_rating;
    }

    public String getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(String user_rating) {
        this.user_rating = user_rating;
    }

}
