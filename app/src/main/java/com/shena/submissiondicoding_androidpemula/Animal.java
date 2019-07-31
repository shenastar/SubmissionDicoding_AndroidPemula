package com.shena.submissiondicoding_androidpemula;

import java.io.Serializable;

public class Animal implements Serializable{
    private String name, info, photo, latin, habitat, klasifikasiIlmiah;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getKlasifikasiIlmiah() {
        return klasifikasiIlmiah;
    }

    public void setKlasifikasiIlmiah(String klasifikasiIlmiah) {
        this.klasifikasiIlmiah = klasifikasiIlmiah;
    }
}
