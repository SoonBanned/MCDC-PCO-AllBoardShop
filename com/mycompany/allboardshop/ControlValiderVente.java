package com.mycompany.allboardshop;

/**
 * @author Alexis Campourcy & Emeline Kleinhans
 */
public class ControlValiderVente {
    public Vente validerVente(String nom, String dateDebut, String dateFin, String descriptif, Activite[] activites){
        Vente v = new Vente();
        v.validerSaisie(nom, dateDebut, dateFin, descriptif, activites);
        return v;
    }
}
