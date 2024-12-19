package com.mycompany.allboardshop;

import org.javatuples.Pair; 

/**
 * @author Alexis Campourcy & Emeline Kleinhans
 */
public class Vente {
    public String nom;
    public String dateDebut;
    public String dateFin;
    public String descriptif;
    public Activite[] activites;
    public Pair<Produit, Tailles[]>[] produitsProposes;

    public boolean validerSaisie(String nom, String dateDebut, String dateFin, String descriptif, Activite[] activites) {
        int i = 0;
                
        while(i < 6 && activites[i] != null){
            i++;
        }       
        
        
        if("".equals(nom) || "".equals(dateDebut) || "".equals(dateFin) || "".equals(descriptif) || i < 1){
            return false;
        }     
        
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.descriptif = descriptif;
        this.activites = activites;
        return true;
    }
    
    public void setProduits(Pair<Produit, Tailles[]>[] produitsProposes){
        this.produitsProposes = produitsProposes;
    }
    
    @Override
    public String toString(){
        Produit p;
        Tailles[] t;
        int i = 0;
        int j = 0;
        while(i < 6 && this.activites[i] != null){
            i++;
        }
        
        String text = "Informations vente:\n";
        text += "Nom Vente : " + this.nom + "\n";
        text += "Date Début Vente : " + this.dateDebut + "\n";
        text += "Date Fin Vente : " + this.dateFin + "\n";
        text += "Descriptif Vente : " + this.descriptif + "\n\n";
        
        text += "Activités de Vente : \n\t";
        for (Activite a : this.activites){
            if (a != null){
                text += a.toString();
                if (j < i - 1){
                    text += ",";
                }
                text += " ";
                j++;
            }
        }
        text += "\n\n";
        
        text += "Produit Proposés :\n";
        for (Pair<Produit, Tailles[]> produitPropose : this.produitsProposes){
            if ( produitPropose != null){
                
                p = produitPropose.getValue0();
                t = produitPropose.getValue1();
                
                text += p.toString();
                
                text += "\tTailles :\n";
                for (Tailles taille : t){
                    if (taille != null){
                        text += taille.toString();
                    }
                }
                text += "\n";
            }
        }
        return text;
    }
}
