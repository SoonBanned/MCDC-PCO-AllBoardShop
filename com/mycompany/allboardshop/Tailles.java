package com.mycompany.allboardshop;

/**
 * @author Alexis Campourcy & Emeline Kleinhans
 */
public class Tailles {
    public int quantite;
    public String taille;

    public boolean validerSaisie(int quantite, String taille) {
        if (quantite <= 0 || "".equals(quantite)){
            return false;
        }
        this.quantite = quantite;
        this.taille = taille;
        return true;
    }
    
    @Override
    public String toString(){
        String text = "\t      -   " + this.taille + " : " + Integer.toString(this.quantite) + "\n";
        return text;
    }
    
}
