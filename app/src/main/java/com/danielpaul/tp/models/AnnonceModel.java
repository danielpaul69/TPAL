package com.danielpaul.tp.models;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.Exclude;
import com.google.firebase.firestore.GeoPoint;
import com.google.type.LatLng;

import java.util.Date;

public class AnnonceModel {
    String titre;
    String description;
    GeoPoint position;
    Date dateAjout;
    String utilisateur;

    public AnnonceModel() {
    }

    public AnnonceModel(String titre, String description, GeoPoint position, Date dateAjout, String utilisateur) {
        this.titre = titre;
        this.description = description;
        this.position = position;
        this.dateAjout = dateAjout;
        this.utilisateur = utilisateur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GeoPoint getPosition() {
        return position;
    }

    public void setPosition(GeoPoint position) {
        this.position = position;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }
}
