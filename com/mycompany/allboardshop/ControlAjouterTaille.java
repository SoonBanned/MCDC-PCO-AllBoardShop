package com.mycompany.allboardshop;

/**
 * @author Alexis Campourcy & Emeline Kleinhans
 */
public class ControlAjouterTaille {
    public boolean ajouterTaille(Tailles[] tailles, String taille, int quantite){
        int i = 0;
        boolean b;
        Tailles t = new Tailles();
        
        b = t.validerSaisie(quantite, taille);

        if (b){
            i = 0;
            while(i < 20 && tailles[i] != null ){
                i++;
            }
            if (i != 20){
                tailles[i] = t;
            }
        }
        return b;
    }
}
