package com.mycompany.allboardshop;

/**
 * @author Alexis Campourcy & Emeline Kleinhans
 */
public class Produit {
    public String nom;
    public String photo;
    public float prixBase;
    public float prixVente;
    public String description;

    public boolean validerSaisie(String nom, String photo, float prixBase, float prixVente, String description) {
        if (prixBase <=0 || prixVente <=0 || "".equals(photo) || "".equals(description) || "".equals(nom)){
            return false;
        }
        this.photo = photo;
        this.prixBase = prixBase;
        this.prixVente = prixVente;
        this.description = description;
        this.nom = nom;
        return true;
    }
    @Override
    public String toString(){
        String text = "\tNom Produit : " + this.nom + "\n";
        text += "\tPrix de Base : " + Float.toString(this.prixBase) + "\n";
        text += "\tPrix de Vente : " + Float.toString(this.prixVente) + "\n";
        text += "\tDescription : " + this.description + "\n";
        
        return text;
    }
    
}
