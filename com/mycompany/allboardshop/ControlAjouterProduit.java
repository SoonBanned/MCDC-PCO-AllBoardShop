package com.mycompany.allboardshop;

import org.javatuples.Pair;

/**
 * @author Alexis Campourcy & Emeline Kleinhans
 */
public class ControlAjouterProduit {
    public boolean ajouterProduit(String nom, String description, String cheminPhoto, Float prixBase, Float prixVente, Tailles[] tailles, Pair<Produit, Tailles[]>[] produits){
        int i;
        boolean b;
        Produit p = new Produit();
        
        b = p.validerSaisie(nom, cheminPhoto, prixBase, prixVente, description);

        if (b){

            i = 0;

            while(i < 100 && produits[i] != null){
                i++;
            }
            
            if (i != 100){
                produits[i] = new Pair(p, tailles);
            }
        }
        return b;
    }
}
